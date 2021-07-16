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
	}

}
