package com.question8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedtoArrayList4 {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Orange");
		list.add("Apple");
		list.add("Peach");
		list.add("Guava");
		list.add("Pear");

		System.out.println("Linked List Elements:");
		System.out.println(list);
		
		System.out.println("ArrayList Elements:");
		List<String> list1=new ArrayList<String>(list);
		
		for(String i:list1)
		{
			System.out.println(i);
		}
	}
}
