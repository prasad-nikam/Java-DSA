public class DivedeAndConquer {
    // function for printing array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //===========Merge sort==========
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    } // merge sort merge funtion below \/
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (i = si, k = 0; i <= ei && k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    //===========Quick sort===========
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //Taking last el as a pivote...
        int pivot = arr[ei];
        int i = si;                 //quick sort has worst Time 
        int j = si - 1;             //complexity when the pivote is
                                    //smallest or largest in array
    //==="Partiton()" starts here
        while (i < ei) {            // Usually a separate function is 
            if (arr[i] < pivot) {   //created for "partition" of array.
                j++;                //here we directlly exicute that part
                int temp = arr[i];  //without making an separate 
                arr[i] = arr[j];    //partition()
                arr[j] = temp;
            }
            i++;
        }
        j++;
        int temp = arr[j];
        arr[j] = arr[ei];
        arr[ei] = temp;
    //===Partition ends here. partiton index will be 'j'.
        quickSort(arr, si, j - 1);
        quickSort(arr, j + 1, ei);
    }
    
    //======Sorted Rotated Array======
    public static int search(int arr[], int key, int si, int ei){
        if(si>ei){
            return -1;
        }                         // line one means the one sorted part 
        //kaam                    // of rotated array 
        int mid=si+(ei-si)/2;     //====================================
        //Case FOUND on Mid...    // line 2 is another sorted part of 
        if(key==arr[mid]){        // rotaed array
            return mid;
        }
        //Case 1: Mid on line 1
        if(arr[si] <= arr[mid]){
            //Case a: key is on left of mid
            if(arr[si] <= key && key <=arr[mid] ){
                return search(arr, key, si, mid-1);
            }
            //Case b: Key is on right of mid.
            else{
                return search(arr, key, mid+1, ei);
            }
        }
        //Case 2: Mid on line 2.
        else{
            //Case c: key is on right of mid.
            if(key <= arr[ei] && key >= arr[mid]){
                return search(arr, key, mid+1, ei);
            }
            //Case d: key is on left of mid
            else{
                return search(arr, key, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        //int arr[] = { 5, 4, 6, 2, 8, 9, 7, 3 , -5, -2 };
        // printArr(arr);
        // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length - 1);
        int rArr[]={4,5,6,7,0,1,2,3};
        //          0 1 2 3 4 5 6 7
        printArr(rArr);
        System.err.println(search(rArr, 6, 0, rArr.length-1));
    }
}