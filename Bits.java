public class Bits {
    public static void oddEven(int n){
        if((n&1)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }    
    }

    public static void getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

    public static int setIthBit(int n,int i){
        int bitmask = 1<< i;
        return n | bitmask;
    }

    public static int clearLastIthBits(int n,int i){
        printBits(n);
        int bitmask = ~0<<i;
        printBits(n & bitmask);
        return n & bitmask;
    }

    public static void printBits(int n){
        StringBuilder ans = new StringBuilder();
        while(n>0){
            
            if((n & 1)==0){
                ans.insert(0,"0");
            }else{
                ans.insert(0,"1");
            }
            n>>=1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // getIthBit(15,3);
        // oddEven(5);
        // oddEven(6);
        // oddEven(11);
        // System.out.println(setIthBit(0, 4));
        // printBits(31);
        //System.out.println(clearLastIthBits(63, 4));
        printBits(36);
    }
}
