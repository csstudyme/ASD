import java.util.Scanner;

public class SinglyLinkedList {
    Node head = null;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding the element at the first
    public void addFirst() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to add: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted.\n");
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted.\n");
    }

    // Adding the element at the last
    public void addLast() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to add: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted.\n");
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        System.out.println("Inserted.\n");
    }

    // Deleting the element
    public void deleteNode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to delete: ");
        int data = sc.nextInt();

        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }

        Node curNode = head;
        Node prNode = null;

        // If the deleting node is the head
        if (curNode != null && curNode.data == data) {
            head = curNode.next;
            System.out.println("Deleted head node with value: " + data);
            return;
        }
        while (curNode != null && curNode.data != data) {
            prNode = curNode;
            curNode = curNode.next;
        }

        // If the node was not found
        if (curNode == null) {
            System.out.println("Node with value " + data + " not found.\n");
            return;
        }

        prNode.next = curNode.next;
        System.out.println("Deleted node with value: " + data);
    }

    // Displaying the List
    public void dispLL() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        Node curNode = head;

        System.out.print("head -> ");
        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.print("null\n");
        System.out.println("Traversal Complete.");
    }

    // Searching for the element
    public void searchLL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int data = sc.nextInt();
        int count = 0;
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        Node crNode = head;
        while (crNode != null) {
            if (crNode.data == data) {
                break;
            }
            count++;
            crNode = crNode.next;
        }
        if (crNode == null) {
            System.out.println("Element not found.\n");
        } else {
            System.out.println("Element found at the " + count + " position.\n");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        while (1 != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print(
                    "1) Add First\n2) Add Last\n3) Delete\n4) Search\n5) Display\n6)  Exit\n\nEnter your option (1,2,3,4,5): ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    ll.addFirst();
                    continue;

                case 2:
                    ll.addLast();
                    continue;
                case 3:
                    ll.deleteNode();
                    continue;
                case 4:
                    ll.searchLL();
                    continue;
                case 5:
                    ll.dispLL();
                    continue;
                case 6:
                    break;
                default:
                    System.out.println("Invalid option.");
                    continue;
            }
        }

    }
}
