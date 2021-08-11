package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataStructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStructureApplication.class, args);

		//LinkedList implementation
		LinkedList.duplicatemain();

		//doublyLinkedList implementation
		DoublyLinkedList.duplicatemain();

		//Stack implementation using using linkedlist
		StackUsingLinkedlist.duplicatemain();

		//Queue implementation using linkedlist

		QueueUsingLinkedList.duplicatemain();

		//binarysearchtree implementation
		BinarySearchTree.duplicatemain();

		//graph implementation using adjacency list way
		Graph.duplicatmain();






	}

}
