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
	}

}
