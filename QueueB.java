import java.util.*;
public class QueueB {
    // Queue using array
    static class QueueA{
        int arr[];
        int size;
        int rear;
        QueueA(int n){
            arr =new int[n];
            rear=-1;
            size=n;
        }
        public boolean isEmpty(){
            return rear==-1;
        }

        public void add(int data){
            if (rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            int front =arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }
        public int peek(){
            return arr[0];
        }
    }
    // Circular Queue using Array
    static class QueueACircular{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        QueueACircular(int n){
            arr = new int[n];
            rear=-1;
            front=-1;
            size = n;
        }
        boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        boolean isFull(){
            return (rear+1)%size==front;
        }
        void add(int data){
            if(isFull()){
                System.out.println("Queue is FULL!");
                return;
            }
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        int remove(){
            if (isEmpty()) {
                System.out.print("Queue is Empty");
                return -1;
            }
            int f= arr[front];
            if (front==rear) {
                rear=front=-1;
            } else {
                front = (front+1)%size;
            }
            
            return f;
        }
        int peek(){
            if (isEmpty()) {
                System.out.println("It's Empty");
                return -1;
            }
            return arr[front];
        }
    }
    // Queue Using LinkedList
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class QueueLL{
        static Node head=null;
        static Node tail = null;

        public boolean isEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next=newNode;
            tail = newNode;
        }
        public void remove(){
            if (head==tail) {
                head=tail=null;
                return;
            }
            head=head.next;
        }
        public int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            return head.data;
        } 
    }
    
    // ************************* Questions *************************** //

    // interleave two halves of queue

    static void interleave(Queue<Integer> q){

        // this will work only for even nuber of elements in Queue
        // Uncomment the below if conditions to run it for both even and odd

        Queue<Integer> q2 = new LinkedList<>();
        int halp = q.size()/2;
        
        // if (q.size()%2!=0) {
        //     halp++;
        // }
        for (int i = 0; i < halp; i++) {
            q2.add(q.remove());
        }

        while (!q2.isEmpty()) {
            q.add(q2.remove());
            // if (q2.isEmpty()&&q.size()%2!=0) {
            //     break;
            // }
            q.add(q.remove());
        }
    }
    
    static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        // QueueA q = new QueueA(1);
        // QueueACircular q= new QueueACircular(9);
        // QueueLL q = new QueueLL();


        


        // Queue<Integer> q2 = new LinkedList<>();
        // q2.add(1);
        // q2.add(2);
        // q2.add(3);
        // q2.add(4);
        // q2.add(5);
        // q2.add(6);
        // q2.add(7);
        // System.out.println(q2);
        // reverse(q2);
        // System.out.println(q2);


        // Queue<Integer> q1 = new LinkedList<>();
        // q1.add(1);
        // q1.add(2);
        // q1.add(3);
        // q1.add(4);
        // q1.add(5);
        // q1.add(6);
        // q1.add(7);
        // q1.add(8);
        // q1.add(9);
        // q1.add(10);
        // System.out.println(q1);
        // interleave(q1);
        // System.out.println(q1);

    }
}
