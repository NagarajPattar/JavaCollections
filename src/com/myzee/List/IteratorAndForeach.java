package com.myzee.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorAndForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list = Collections.unmodifiableList(list);	// java.lang.UnsupportedOperationException while itr.revmove().
		/*
		 * Using iterator
		 */
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String val = itr.next();
			System.out.print(val + " ");
			if(val.equals("C")) {
				itr.remove();
			}
		}
		System.out.println();
		/*
		 * Using foreach loop
		 * we cannot modify the list using foreach, throws ConcurrentModificationException
		 */
		for(String s : list) {
			if(s.equals("D")) {
				list.remove(s);
			}
		}
		System.out.println(list);
	}

}
