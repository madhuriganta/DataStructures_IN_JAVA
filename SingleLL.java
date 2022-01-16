package com.course1;

class Node
{
    int data;
    Node next;
    public void printList()
    {
        System.out.print(data+"->\n");
    }
}
class SingleLinkedList
{
    Node head;
    SingleLinkedList()
    {
        head=null;
    }
    public boolean isEmpty()
    {
        return(head==null);
    }

    public void insertFirst(int d)
    {
        Node newNode= new Node();
        newNode.data=d;
        newNode.next=head;
        head=newNode;
    }
    public void printElements()
    {
        Node current=head;
        while(current!=null)
        {
            current.printList();
            current=current.next;
        }

    }
    public void insertLast(int d)
    {
        Node newNode=new Node();
        newNode.data = d;
        newNode.next= null;
        if(head==null)
            head=newNode;
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }

    }
    public void deleteFirst() {
        head = head.next;
    }
    public void deleteLast()
    {

    }


}


public class SingleLL {
    public static void main(String[] args) {
        SingleLinkedList sll=new SingleLinkedList();
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(4);
//        Node first=new Node();
//        first.data=10;
//        first.next=null;
//        sll.head=first;
//        Node second =new Node();
//        second.data=20;
//        second.next=null;
//        first.next=second;
//        Node third=new Node();
//        third.data=30;
//        third.next=null;
//        second.next=third;
//        sll.printElements();
        sll.printElements();

        if(sll.isEmpty())
            System.out.println("list is empty!");
        else
            System.out.println("List is not empty");

        sll.insertLast(1);
        System.out.println("inserting last element\n ");
        sll.printElements();

        sll.deleteFirst();
        System.out.println(" deleting First element\n");
        sll.printElements();

    }




}
