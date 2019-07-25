package com.myzee.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("N");
		list.add("A");
		list.add("G");
		list.add("A");
		list.add("R");
		list.add("A");
		list.add("J");
		convertArraylistToArray(list);
	}

	private static void convertArraylistToArray(List<String> list) {
		// TODO Auto-generated method stub
		Object[] objArr = list.toArray();
		String[] strArray = Arrays.copyOf(objArr, objArr.length, String[].class);
		System.out.println(strArray.toString());
		for(String s : strArray) {
			System.out.println(s);
		}
		
		String[] sarr = new String[] {"1", "2", "4"};
		Integer[] intArr = Arrays.copyOf(sarr, sarr.length, Integer[].class);
		for(Integer i : intArr) {
			System.out.println(i);
		}
	}

}

