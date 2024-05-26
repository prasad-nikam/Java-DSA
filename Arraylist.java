import java.util.*;
public class Arraylist {

    //BrutForce Approch
    public static void maxWaterContainer(ArrayList<Integer> list){
        int maxWater=-1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i +1 ; j < list.size(); j++) {

                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                maxWater=Math.max(maxWater, width*height);

            }
        }
        System.out.println("It can contain: "+maxWater+" amount of water");
    }

    //Two Pointer Approch
    public static void maxWaterContainer2(ArrayList<Integer> list){
        int maxWater=-1;
        int lp=0, rp=list.size()-1;
        while (lp < rp) {

            int height=Math.min(list.get(lp), list.get(rp));
            int width=rp-lp;
            maxWater=Math.max(maxWater, width*height);

            if (list.get(lp)<list.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("It can contain: "+maxWater+" amount of water");
    }

    //pair sum
    public static boolean pairSum(ArrayList<Integer> list, int target){
        list.sort(null);
        int lp=0;
        int rp=list.size()-1;
        int sum=-1;
        while (lp<rp) {
            sum=list.get(lp)+list.get(rp);
            if (sum > target) {
                rp--;
            }
            else if(sum < target){
                lp++;
            }
            else{
                return true;
            }
        }
        return false;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> height =new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        // maxWaterContainer(height);
        // maxWaterContainer2(height);
        System.out.println(pairSum(height, 5));




    }
}