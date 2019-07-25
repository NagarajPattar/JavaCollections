package com.myzee.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEleFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Bob");
		list.add("Charlie");
		list.add("Katty");
		list.add("Alice");
		
		removeElement(list);
		System.out.println("\nafter removal\n");
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	private static <T> void removeElement(List<T> list) {
		Iterator<T> itr = list.iterator();
		while(itr.hasNext()) {
			T next = itr.next();
			System.out.println(next);
			if (next.equals("Alice") || next.equals("Bob")) {
				itr.remove();
			}
		}
	}
}
