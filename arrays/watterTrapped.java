

public class watterTrapped {
    public static void main(String[] args) {
        int heightmax[] = { 0,1,0,2,1,0,1,3,2,1,2,1 };
        int i, j, n = heightmax.length,totalwater=0;
        int leftmax[] = new int[n];
        int right[] = new int[n];
        leftmax[0] = heightmax[0];
        for (i = 0, j = 1; j < n; i++, j++) {
            leftmax[j] = Math.max(leftmax[i], heightmax[j]);
        }
        right[n - 1] = heightmax[n - 1];
        for (i = n - 1, j = i - 1; i > 0; i--, j--) {
            right[j] = Math.max(right[i], heightmax[j]);
        }
        for (int k = 0; k < right.length; k++) {
            int water_lvl=Math.min(leftmax[k], right[k]);
            totalwater+=water_lvl-heightmax[k];
        }
        System.out.println("Total water trapped is "+totalwater+" unit");
    }
}