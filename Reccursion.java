public class Reccursion {
    //prints n numbers in increasing order till "n-1";
    public static int inc(int n){
        if(n==0){
            return 0;
        }
        System.out.println(inc(n-1));
        return n; 
    }
    //prints n numbers in increasing order till "n";
    public static void inc2(int n){
        if (n==0) {
            return;
        }
        inc2(n-1);
        System.out.println(n);
        return;
    }
    //prints n numbers in decreasing order till 1;
    public static void dec(int n){
        if (n>0) {
            System.out.println(n);
            dec(n-1);  
        }
        return;
    }
    //Prints factorial of n
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    // returns nth fibbonaci number
    public static int fibbo(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fibbo(n-1)+fibbo(n-2);
    }    
    //Returns true if array is Sorted, False otherwise.
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);  
    }
    //returns a index of last occurance of key in array
    public static int lastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[arr.length-1-i]==key){
            return arr.length-1-i;
        }
        return lastOccurance(arr, key, i+1);
    }
    //returns a index of first occurance of key in array
    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    //returns the value of x to the power n
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        return x * power(x, n-1);
    }
    
    //returns ways of pairing n number of ways.
    public static int frndpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //explaination is  written notebook...
        return frndpairing(n-1)+ (n-1)*frndpairing(n-2);
    }
    //removes duplicates from string and prints the remaining
    public static void removeDuplicates(String str, int idx,StringBuilder newstr,boolean map[] ){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            //it means currChar is a duplicate
            removeDuplicates(str, idx+1, newstr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }
    // binary string Problem
    public static void printBinStr(int n,int lp, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStr(n-1, 0, str+"0");
        if (lp==0) {
            printBinStr(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5,4};
        //dec(10)    prints 0 to 10
        //inc(10);   Prints till 9 only.
        //inc2(10);  prints till 10.
        //System.out.println(fact(5));
        //System.out.println(fibbo(5));
        //System.out.println(isSorted(arr, 0));
        //System.out.println(lastOccurance(arr, 6, 0));
        //System.out.println(firstOccurance(arr, 4, 0));
        //System.out.println(power(2, 10));
        System.out.println(frndpairing(4));
        // String str="appannacollege";
        // removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
        // printBinStr(5, 0, "");
    }
}