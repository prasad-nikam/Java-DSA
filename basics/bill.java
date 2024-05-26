import java.util.*;
class bill{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the price of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = sc.nextFloat();
        sc.close();
        float total = pen + pencil + eraser;
        System.out.println("total cost is: "+total);

        total += total*0.18f; //adding GST 18%
        System.out.println("total cost after adding 18 % GST is: "+total);

    }
}