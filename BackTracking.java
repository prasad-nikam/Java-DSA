public class BackTracking {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void onArray(int arr[], int i) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = i + 1;
        onArray(arr, i + 1);
        arr[i] -= arr.length / 2;
    }

    public static void subStr(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // Yes choice
        subStr(str, ans + str.charAt(i), i + 1);
        // No choice
        subStr(str, ans, i + 1);
    }

    public static void allPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        int i = 0;
        while (i < str.length()) {
            allPermutations(str.substring(0, i) + str.substring(i + 1), ans + str.charAt(i));
            // |----------new str without charAt(i)------------- |---Ans string with apended
            // charAt(i)
            i++;

        }
    }

    // =-=-=-=-=-=-=-=-=-=-=-=-nQueens question-=-=-=-=-=-=-=-=-=-=-=-=
    public static void printBoard(char board[][]) {
        System.out.println("================ Chess Board ===============");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // for up col
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // for up left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // For up right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static int nQueens(char board[][], int row,int count) {
        // base case
        if(row==board.length){
            //printBoard(board);
            count++;
            return count;
        }
       // printBoard(board);
        // recursion
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                count=nQueens(board, row + 1,count);
                board[row][i] = 'X';

            }
        }
        return count;
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    public static int gridWays(int n,int m){
        if (n==1 || m==1) {
            return 1;
        }
        return gridWays(n-1, m)+gridWays(n, m-1);
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    
    public static void main(String[] args) {
        // int arr[]= new int[7];
        // onArray(arr, 0);
        // printArr(arr);
        // subStr("abc", ":-",0);
        // allPermutations("abcd", "");

        // int n = 10;
        // char board[][] = new char[n][n];
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board.length; j++) {
        //         board[i][j] = 'X';
        //     }
        // }
        // nQueens(board, 0,0);
        // System.out.println(nQueens(board, 0, 0));
        System.out.println(gridWays( 5 , 5));

    }
}
