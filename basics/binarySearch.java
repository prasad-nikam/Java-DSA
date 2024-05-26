public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 9, 12, 14, 21, 24, 30, 34, 39, 40, 45 };
        int start = 0;
        int mid,end = arr.length - 1, key = 34;

        while (start <= end) {
            mid = (end + start) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                return;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else if(key>arr[mid]){
                start = mid + 1;
            }
            
        }
        System.out.println("NOT FOUND..!!!");
    }

}
