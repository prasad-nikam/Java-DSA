public class all {
    public static void invertedHalfTriangle(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramidNUM(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void FloidsTri(int lines){
        int j=1,c=1;
        for (int i = 1; i <= lines; i++) {
            for( ; j < c ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedHalfTriangle(5);
        invertedHalfPyramidNUM(5);  
        invertedHalfPyramidNUM(5);      
    }
}
