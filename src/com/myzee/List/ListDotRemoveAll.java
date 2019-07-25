package com.myzee.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListDotRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>(Arrays.asList("Bob", "seira", "jack", "katty"));
		System.out.println(l);
		List<String> listAftRem = removeElements(l);
		System.out.println("\nAfter removal of collection elements form list\n");
		System.out.println(listAftRem);
	}

	private static <T> List<T> removeElements(List<T> l) {
		// TODO Auto-generated method stub
		Iterator<T> itr = l.iterator();
		List<T> eleToRemove = new ArrayList<>();
		while(itr.hasNext()) {
			T next = itr.next();
			if(next.equals("Bob") || next.equals("jack")) {
				eleToRemove.add(next);
			}
		}
		l.removeAll(eleToRemove);
		Predicate<String> p = null;
		return l;
	}
}


