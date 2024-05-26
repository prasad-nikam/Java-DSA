import java.util.Scanner;

public class c_b {
    public static void c2b(int dec){
        String bin="";
        int b=0;
        while (dec>0) {
            b=dec%2;
            bin=b+bin;
            dec/=2;
        }
        System.out.println(bin);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a DECIMAL number :");
        int n = sc.nextInt();
        sc.close();
        if (n<16) {
            c2b(n);
        }
        else{
            System.out.println("Number should be less than 16..!!!!");
        }
    }

}

