/**
 * LinkList
 */
public class LinkList {

// creating a Node class
    public class Node{
        int data;
        Node next=null;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// creating head and tail static for once, so no need to create it again and again
    public static Node head;
    public static Node tail;
    public static int size=0;

// function to add node in LL at fist position
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head==null) {
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
        size+=1;
    }

// function to add node in LL at last position
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        size+=1;
    }
    
//function to print the data in linklist
    public void printLL(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

//Function to add node at certain position in lidnk list
    public void addAt(int pos,int data){
        Node newNode = new Node(data);
        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            if (temp.next==null) {
                System.out.println("Index not found !!!");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size+=1;

    }
//reverses linklist
    public void reverse(){
        Node prevNode = null;
        Node currNode = head;
        Node nextNode;
        tail= head;
        while(currNode!=null){
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode = nextNode;
        }
        head=prevNode;
    }

    // Zig-Zag linkList
    public static void zigZag(){


    }

    public static void main(String[] args) {
        LinkList ll =new LinkList();
        ll.addFirst(7);
        System.out.println(head.data);
        ll.addLast(5);
        ll.addLast(3);
        ll.addLast(1);
        ll.printLL();
        ll.addAt(4,8);
        ll.printLL();
        System.out.println("size : "+size);
        ll.reverse();
        ll.printLL();
        
    }
}