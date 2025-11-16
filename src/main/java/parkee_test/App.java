package parkee_test;

public class App {

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        OperationLinkedList ops = new OperationLinkedList(list);

        ops.insertAtEnd(1);
        ops.insertAtEnd(2);
        ops.insertAtEnd(3);

        System.out.println("List awal:");
        ops.display(); // 1,2,3

        System.out.println("Setelah insert di depan (0):");
        ops.insertAtBeginning(0);
        ops.display(); // 0,1,2,3

        System.out.println("Setelah delete value (1):");
        ops.deleteByValue(1);
        ops.display(); // 0,2,3

        System.out.println("Setelah insert di belakang (4):");
        ops.insertAtEnd(4);
        ops.display(); // 0,2,3,4
    }

}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {

    Node head;

    SingleLinkedList() {
        this.head = null;
    }
}

class OperationLinkedList {

    private SingleLinkedList list;

    public OperationLinkedList() {
    }

    public OperationLinkedList(SingleLinkedList list) {
        this.list = list;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (list == null) {
            list = new SingleLinkedList();
            list.head = newNode;
            return;
        } else if (list.head == null) {
            list.head = newNode;
            return;
        }

        Node current = list.head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    void insertAtBeginning(int data) {
        Node newHeadNode = new Node(data);
        newHeadNode.next = list.head;
        list.head = newHeadNode;
    }

    void deleteByValue(int data) {
        if (list == null || list.head == null) {
            return;
        }

        if (list.head.data == data) {
            list.head = list.head.next;
            return;
        }

        Node current = list.head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    void display() {
        if (list == null) {
            return;
        } else if (list.head == null) {
            return;
        }

        Node current = list.head;

        while (current != null) {
            System.out.println("Data Linked list: " + current.data);
            current = current.next;
        }
    }
}
