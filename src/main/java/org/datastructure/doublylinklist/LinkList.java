package org.datastructure.doublylinklist;

public class LinkList {




    public LinkList(){

    }

    public Node insertAtBegining(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        if (head != null) {
            head.prev = node;
        }

        head = node;
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

    public Node insertAtEnd(Node head, int data)
    {
        Node newNode = new Node(data);

        Node current= head;

        while (current.next!= null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next=null;
        newNode.prev = current;
        return head;
    }

    public void printMiddleOfLinkList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: " + slow.data);
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        Node head = null;

        head = linkList.insertAtBegining(head, 10);
        head = linkList.insertAtBegining(head, 20);
        head = linkList.insertAtBegining(head, 30);
        head = linkList.insertAtEnd(head, 40);
        linkList.printMiddleOfLinkList(head);

        System.out.println("Doubly Linked List:");
        linkList.printLinkList(head);
    }
}
