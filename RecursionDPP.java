public class RecursionDPP {

    /*For a given integer array of size N.You have to find all the occurrences (indices) of a given element (Key)
    and print them . Use a recursive function to solve this problem. 
    Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
    Sample Output: 1 5 7 8                                                                    */
    public static void allOcurrences(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allOcurrences(arr, key, i+1);
    }

    /*You are given a number (eg -  2019), convert it into a String of english like “two zero one nine”.
    Use a recursive function to solve this problem.
    NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
    Sample Input: 1947 Sample Output: “one nine four seven”
    */
    public static void num_To_Str(int num){
        if(num==0){
            return;
        }
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        num_To_Str(num/10);
        System.out.print(numbers[num%10]+" ");
    }
    
    /* Write a program to findLength of aStringusing Recursion.*/
    public static int findLength(String str){
        if(str.length() ==0) {
            return 0;
        }
        return findLength (str.substring(1)) +1;
    }

    /*We are given a string S, we need to find the count of all contiguous substrings starting and ending with 
    the same character. Sample Input 1: S = "abcab" 
                        Sample Output 1: 7
      ;)  */ 
    public static int substr(String str,int beg,int end,int count){
        if(end==str.length()+1){
            return count;
        }
        if(str.charAt(beg)==str.charAt(end-1)){
            count++;
        }
        count= substr(str, beg, end+1,count);
        if(beg==end-1){
            count= substr(str, beg+1, end+1,count);
        }
        return count;
    }

    //Tower of Hanoi... This is correct solution
    public static void tower_of_hanoi(char from, char using, char to,  int n){
        if (n==2) {
            System.out.println(from+"->"+using);//4
            System.out.println(from+"->"+to);//3
            System.out.println(using+"->"+to);//4
            return;
        }
        tower_of_hanoi(from, to, using, n-1);
        System.out.println(from+"->"+to);//2
        tower_of_hanoi(using, from, to, n-1);
    }
    public static void main(String[] args) {
        // int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        // allOcurrences(arr, 2, 0);
        // num_To_Str(2019);
        //System.out.println(findLength("prasad nikam"));
        // System.out.println((substr("abcab", 0, 1,0)));
        tower_of_hanoi('A', 'B', 'C', 4);
        
    }
}
