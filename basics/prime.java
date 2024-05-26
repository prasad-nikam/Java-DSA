import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to print all prime numbers till it :");
        int n   = sc.nextInt();
        sc.close();
        int j,count=0;
        for(int i=2;i<n;i++){
            for(j=2;j<(i+2)/2;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j>(i/2)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("total prime numbers till "+n+" are : "+count);
    }
}
