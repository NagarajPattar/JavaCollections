
package com.myzee.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> intList = new ArrayList<String>();
		intList.add("A");
		intList.add("B");
		intList.add("C");
		intList.add("D");
		intList.add("E");
		/*
		 * ListIterator can traverse in both the direction.
		 * methods : 
		 * add
		 * hasNext
		 * hasPrevious
		 * next
		 * previous
		 * remove
		 */
		ListIterator<String> litr = intList.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
	}

}
