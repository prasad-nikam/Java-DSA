import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        System.out.println("Enter any number to reverse it :");
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        long rev=0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n/=10;

        }
        System.out.println(rev);
        return;
    }
}
/*
 * whhile(n>0){
 *      syso(n%10);
 *      n/=10;
 * }
 */