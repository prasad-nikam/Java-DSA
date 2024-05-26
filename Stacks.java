import java.util.*;

public class Stacks {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void stockSpan(Stack<Integer> h, int stocks[], int span[]) {
        span[0] = 1;
        h.push(0);
        for (int i = 1; i < stocks.length; i++) {
            // whule loop for finding previousHigh for current value
            while (!h.isEmpty() && stocks[i] >= stocks[h.peek()]) {
                 h.pop();       //currValue    previousHigh
            }
            // Special case : if stack becomes empty => span[i]=i+1;
            if (h.isEmpty()) {
                span[i]=i+1;
            }else{
                
                span[i] = i - h.peek();
                h.push(i);  //previousHigh
            }

        }
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 9);
        // reverse(s);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        Stack<Integer> high = new Stack<>();
        int stocks[] = { 100,80,60,70,60,85,100 };
        int span[] = new int[stocks.length];
        stockSpan(high, stocks, span);

        printArr(span);

    }
}