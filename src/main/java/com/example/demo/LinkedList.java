package com.example.demo;

 public class LinkedList {
		   Node head;
			public static class Node {
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
   
  
		public static LinkedList insert(LinkedList list, int data) {
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
   
		   public static void printlist(LinkedList list) {
			   Node currnode=list.head;
			   System.out.print("Linked List is: ");
			   while(currnode!=null) {
				   System.out.print(currnode.data+" ");
				   currnode=currnode.next;

			   }
			   System.out.println();
		   }

		   public static LinkedList delete(LinkedList list, int data) {
			   Node currNode = list.head, prev = null;
			   if (currNode != null && currNode.data == data) {
				   list.head = currNode.next;
				   System.out.println( "found the key "+data+"  and deleted");
				   return list;
			   }
			   while (currNode != null && currNode.data != data) {
				   prev = currNode;
				   currNode = currNode.next;
			   }
			   if (currNode != null) {
				   prev.next = currNode.next;
				   System.out.println( "found the key "+data+"  and deleted");
			   }
			   if (currNode == null) {
				   System.out.println(data + " not found");
			   }
			   return list;

		   }

		   public static void duplicatemain(){
			   LinkedList list=new LinkedList();
			   insert(list, 1);
			   insert(list, 2);
			   insert(list, 8);
			   insert(list, 5);
			   insert(list, 9);
			   insert(list, 4);
			   printlist(list);
			   delete(list,2);
			   printlist(list);
		   }
}
