package linked_List;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // next pointer is initialized to null
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // methosd to add a new node at the end of the list
    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: newNode next = head
        newNode.next = head;

        // step 3: head = newNode
        head = newNode; // link
    }

    public void addLast(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode; // if the list is empty both head and tail point to the new node
            return;
        }
        tail.next = newNode;
        tail = newNode; // update tail to point to the new node

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null");
    }

    // add in the middle
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("List is empty cannot remove First element");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.next.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // search in the linked list using iteration
    public int itrSearch(int key) {

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {

                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search in the linked list using recursion
    public int helper(Node head, int key) { // o(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);

    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;
        tail = head;

    }

    public void deleteNthfromEnd(int n) {

        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next; // remove first element
            return;
        }

        // size -n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        i++;
        return;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
         list.printList();
        list.deleteNthfromEnd(3);
        list.printList();
    }
}
