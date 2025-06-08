package org.datastructure.linklist;

import java.util.HashSet;

public class LinkList {


    public LinkList() {
    }

    public Node insertAtBegining(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    public Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
        return head;

    }

    public Node insertNodeAtSpecificPosition(Node head, int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {

            Node current = head;

            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            } else {
                System.out.println("Position out of bounds");
            }
        }
        return head;

    }

    public void printLinkList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static int getLength(Node head) {
        int len = 0;

        Node current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        return len;
    }

    public void search(Node head, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Data found: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Data not found: " + data);
    }

    public Node deleteAtStart(Node head) {
        if (head == null) {
            return null; // List is empty
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }

    public Node deleteAtEnd(Node head) {

        if (head == null) {
            return null; // List is empty
        }

        if (head.next == null) {
            return null; // List has only one node
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public Node deleteAtPosition(Node head, int position) {
        if (head == null) {
            return head;
        }

        Node current = head;

        if (position == 0) {
            head = current.next;
            current.next = null;
        } else {

            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
        }

        return head;
    }

    public Node modifydataAtPosition(Node head, int position, int data) {
        if (head == null) {
            return head;
        }

        Node current = head;

        int index = 0;

        while (current != null) {
            if (position == 0) {
                current.data = data;
                return head;
            }

            if (index == position) {
                current.data = data;
            }
            current = current.next;
            position++;
        }
        return head;
    }


    //1->2->-3->4->5->null
    //5->4->3->2->1->null
    public Node reverseLink(Node head) {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void detectLoop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                System.out.println("Loop detected");
                return;
            }
        }
        System.out.println("No loop detected");
    }

    public Node detectLoop2(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (set.contains(current)) {
                System.out.println("Loop detected");
                prev.next = null; // Remove the loop
                return head; // Return the modified list
            } else {
                set.add(current);
                prev = current;
                current = current.next;
            }
        }
        System.out.println("No loop detected");
        return head;
    }

    public Node removeDuplicate(Node head){
        Node current = head;
        while (current!=null){
            if (current.next.next.data==current.data){
                current.next=current.next.next;
        }
            current= current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        Node head = null;
        head = linkList.insertAtBegining(head, 10);
        head = linkList.insertAtBegining(head, 20);
        head = linkList.insertAtBegining(head, 30);
        head = linkList.insertAtBegining(head, 40);
        head = linkList.insertAtEnd(head, 50);
        linkList.printLinkList(head);
        System.out.println(getLength(head));
        linkList.search(head, 89);
        head = linkList.deleteAtStart(head);
        linkList.printLinkList(head);
        linkList.deleteAtEnd(head);
        linkList.printLinkList(head);
        //  head= linkList.modifydataAtPosition(head,0, 100);
        head = linkList.reverseLink(head);
        linkList.printLinkList(head);
        head.next.next = head.next;
        // linkList.detectLoop(head);
        head = linkList.detectLoop2(head);
        // head=linkList.detectLoop2(head);
        linkList.printLinkList(head);
    }
}
