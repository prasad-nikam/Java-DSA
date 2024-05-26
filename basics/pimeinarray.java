/**
 * pimeinarray
 */
public class pimeinarray {

    static boolean isprime( int n){
        if (n<=1) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n%i==0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String array[];
        if(args.length ==0){
            System.out.println("No arguments provided ");
            return;
        }else{
            array = args;
        }

        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(args[i]);
            if (isprime(n)) {
                System.out.print(n+" ");
            }
        }
    }
}