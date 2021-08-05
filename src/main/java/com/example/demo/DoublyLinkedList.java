package com.example.demo;

public class DoublyLinkedList {
         Node head;
         public class Node{
            int data;
            Node pre;
            Node next;

             public Node(int data) {
                 this.data = data;
                 this.pre=null;
                 this.next=null;
             }
         }

         public DoublyLinkedList insertAtEnd(DoublyLinkedList list,int data){
             Node newnode=new Node(data);
             if(list.head==null){
                 newnode.pre=null;
                 list.head=newnode;
                 return list;
             }
             Node currnode=list.head;
             while(currnode.next!=null){
                 currnode=currnode.next;
             }
             currnode.next=newnode;
             newnode.pre=currnode;
             return list;
         }

         public DoublyLinkedList  insertAtFront(DoublyLinkedList list, int data){
             Node newnode=new Node(data);
             newnode.pre=null;
             newnode.next=list.head;
             if(list.head!=null){
                 list.head.pre=newnode;
             }
             list.head=newnode;
             return list;

        }
        public void printdoublylist(DoublyLinkedList list){
             Node currnode=list.head;
             System.out.print("Doubly linked list  : ");
             while(currnode!=null){
                 System.out.print(currnode.data+" ");
                 currnode=currnode.next;
             }
             System.out.println();
        }


            public void duplicatemain(){
                DoublyLinkedList dlist=new DoublyLinkedList();
                //adding at the front
                insertAtFront(dlist,5);
                insertAtFront(dlist,6);
                insertAtFront(dlist,7);
                printdoublylist(dlist);
                //adding at end
                insertAtEnd(dlist,1);
                insertAtEnd(dlist,2);
                insertAtEnd(dlist,3);
               printdoublylist(dlist);
            }
}
