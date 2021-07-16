package com.example.demo;

public class LinkedList {
   Node head;
   
    static class Node {
	   int data;
	   Node next;
	public Node(int data) {
		super();
		this.data = data;
		next = null;
	}
	public Node() {
		super();
	}	  
	
	
   }
   
  
static LinkedList insert(LinkedList list,int data) {
	   Node newnode=new Node(data);
	   if(list.head==null) {
		   list.head=newnode;
	   }
	   else {
		   
		  Node currentnode=list.head;   
		   while(currentnode.next!=null) {
			   currentnode=currentnode.next;
		   }
		   currentnode.next=newnode;
		
	   }
	   
	return list;
	   
   }
   
   static void printlist(LinkedList list) {
	   Node currnode=list.head;
	   System.out.print("Linked List is: ");
	   while(currnode!=null) {
		   System.out.print(currnode.data+" ");
		   currnode=currnode.next;
		   
	   }
   }
   
   static LinkedList delete(LinkedList list,int data) {
	   
	   
	   return list;
	   
   }
}
