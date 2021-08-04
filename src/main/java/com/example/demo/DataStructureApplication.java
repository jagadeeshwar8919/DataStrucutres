package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStructureApplication.class, args);
		//LinkedList implementation
		LinkedList list=new LinkedList();
		list=LinkedList.insert(list, 1);
		list=LinkedList.insert(list, 2);
		list=LinkedList.insert(list, 8);
		list=LinkedList.insert(list, 5);
		list=LinkedList.insert(list, 9);
		list=LinkedList.insert(list, 4);
		list.printlist(list);
		list=LinkedList.delete(list,2);
		list.printlist(list);

		//doublyLinkedList implementation

		DoublyLinkedList dlist=new DoublyLinkedList();
		//adding at the front
		dlist=DoublyLinkedList.insertAtFront(dlist,5);
		dlist=DoublyLinkedList.insertAtFront(dlist,6);
		dlist=DoublyLinkedList.insertAtFront(dlist,7);
		DoublyLinkedList.printdoublylist(dlist);
		//adding at end
		dlist=DoublyLinkedList.insertAtEnd(dlist,1);
		dlist=DoublyLinkedList.insertAtEnd(dlist,2);
		dlist=DoublyLinkedList.insertAtEnd(dlist,3);
		DoublyLinkedList.printdoublylist(dlist);


		//Stack implementation using using linkedlist
		 StackUsingLinkedlist slist=new StackUsingLinkedlist();
		 slist =StackUsingLinkedlist.push(slist,3);
		slist=StackUsingLinkedlist.push(slist,4);
		slist=StackUsingLinkedlist.push(slist,2);
		slist=StackUsingLinkedlist.push(slist,5);
		StackUsingLinkedlist.printlist(slist);
		slist=StackUsingLinkedlist.pop(slist);
		slist=StackUsingLinkedlist.pop(slist);
		StackUsingLinkedlist.printlist(slist);


		//Queue implementation using linkedlist
		QueueUsingLinkedList qlist=new QueueUsingLinkedList();
		qlist=QueueUsingLinkedList.enqueue(qlist,3);
		qlist=QueueUsingLinkedList.enqueue(qlist,8);
		qlist=QueueUsingLinkedList.enqueue(qlist,5);
		qlist=QueueUsingLinkedList.enqueue(qlist,1);
		qlist=QueueUsingLinkedList.enqueue(qlist,4);
		QueueUsingLinkedList.printlist(qlist);
		qlist=QueueUsingLinkedList.dequeue(qlist);
		qlist=QueueUsingLinkedList.dequeue(qlist);
		QueueUsingLinkedList.printlist(qlist);


	}

}
