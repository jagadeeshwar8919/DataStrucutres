package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStructureApplication.class, args);

		//LinkedList implementation
		LinkedList list=new LinkedList();
		list.duplicatemain();

		//doublyLinkedList implementation
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.duplicatemain();

		//Stack implementation using using linkedlist
		 StackUsingLinkedlist slist=new StackUsingLinkedlist();
		 slist.duplicatemain();

		//Queue implementation using linkedlist
		QueueUsingLinkedList qlist=new QueueUsingLinkedList();
		qlist.duplicatemain();

		//binarysearchtree implementation
			BinarySearchTree btlist=new BinarySearchTree();
			btlist.duplicatemain();





	}

}
