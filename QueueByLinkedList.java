import java.util.Scanner;
 public class QueueByLinkedList {
    Node head = null;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Adding the element at the last
    public void addLast() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to add to queue: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            System.out.println("Inserted.\n");
            return;
        }
        Node curNode = head;
        while(curNode.next!=null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        System.out.println("Inserted.\n");
    }
    //Deleting the element
    public void deleteNode() {    
        if (head == null) {
            System.out.println("queue is empty.\n");
            return;
        }
        System.out.println("Deleted node with value: " + head.data);
        head = head.next;
    }
    //Displaying the List
    public void dispLL() {
        if(head == null) {
            System.out.println("queue is empty.\n");
            return;
        }
        Node curNode = head;
        System.out.println("front -> ");
        while (curNode != null) {
            System.out.print(curNode.data + " -> "); 
            curNode = curNode.next;           
        }
        System.out.println("null\n");
    }
    public static void main(String[] args) {
        QueueByLinkedList ll = new QueueByLinkedList();
        while (1 != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("1) enqueue\n2) dequeue\n3) Display\n4) Exit\n\nEnter your option (1,2,3,4): ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                ll.addLast();
                continue;
                
                case 2:
                ll.deleteNode();                    
                continue;
                case 3:
                ll.dispLL();
                continue;
                case 4:
                break;
                default:
                System.out.println("Invalid option.");
                continue;
            }
        }
    
        }
 }
