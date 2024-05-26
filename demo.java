// import java.util.*;
public class demo{
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quick(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = ei;
        int i = si - 1; // Initialize i to si - 1
        int j = si;
        while (j < ei) {
            if (arr[j] < arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[i + 1]; // Swap with i + 1 instead of pivot
        arr[i + 1] = arr[pivot];
        arr[pivot] = temp;
    
        quick(arr, si, i); // Quick sort the left subarray
        quick(arr, i + 2, ei); // Quick sort the right subarray
    }
    
    public static void main(String args[]) {
        // int arr[] = { 5, 4, 6, 2, 8, 9, 7, 3 };
        // printArr(arr);
        // quick(arr, 0, arr.length - 1);
        // printArr(arr);
        String str="aasdf";
        System.out.println(str.substring(0,3)+str.substring(4, str.length()));
        int i=6546;
        int arr[]= new int[10];
        System.out.println(arr+" "+i);
        if (true) {
            arr[0]=2;
        }

        //Bits.printBits(15);
    }
}