
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        System.out.println("Elementul " + data + " a fost inserat în listă.");
    }

    public void display() {
        if (head == null) {
            System.out.println("Lista este goală.");
        } else {
            Node current = head;
            System.out.print("Elementele listei sunt: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Lista este goală. Nu se poate realiza ștergerea.");
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    System.out.println("Elementul " + data + " a fost șters din listă.");
                    return;
                }
                current = current.next;
            }
            System.out.println("Elementul " + data + " nu a fost găsit în listă.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Testarea funcțiilor
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);

        list.display();

        list.delete(10);
        list.delete(25);

        list.display();
    }
}

