package com.myzee.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.management.ImmutableDescriptor;

public class UnmodifiableList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		List<String> listm = Collections.unmodifiableList(list);
		
		/*
		 * list cannot be modified, only it elements can be retrieved
		 * 
		 */
		System.out.println("modifying the list");
		list.add("F");		//	java.lang.UnsupportedOperationException
//		list.remove("B");	//	java.lang.UnsupportedOperationException
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("C")) {
				itr.remove();	//	java.lang.UnsupportedOperationException
			}
		}
		System.out.println(list.stream().iterator().next());
		System.out.println("size of the list - " + list.size());
		
	}

}
