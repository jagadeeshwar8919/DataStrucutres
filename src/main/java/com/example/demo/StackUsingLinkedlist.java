package com.example.demo;

public class StackUsingLinkedlist{
   Node first;

    public static StackUsingLinkedlist push(StackUsingLinkedlist slist, int i) {
        Node newnode=new Node(i);
        newnode.next=slist.first;
        slist.first=newnode;
        return slist;
    }

    public static void printlist(StackUsingLinkedlist slist) {
        Node currnode=slist.first;
        System.out.print("Stack list is: ");
        while(currnode!=null){
            System.out.print(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println();
    }

    public static StackUsingLinkedlist pop(StackUsingLinkedlist slist) {
        Node temp=slist.first;
        slist.first=slist.first.next;
        System.out.println("Removed element :"+temp.data);
        return slist;
    }


    static class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }

}


}
