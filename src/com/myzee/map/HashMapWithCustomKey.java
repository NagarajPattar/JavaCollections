package com.myzee.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWithCustomKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hm = new HashMap<>();
		Employee e1 = new Employee(7, "bob");
		Employee e2 = new Employee(3, "alice");
		Employee e3 = new Employee(9, "charlie");
		Employee e4 = new Employee(9, "charlie");
		
		hm.put(e1, "bob");
		hm.put(e2, "alice");
		hm.put(e3, "charlie");
		hm.put(e4, "charlie");
		System.out.println("==" + (e3==e4));
		System.out.println("equals----" + e3.equals(e4));
		
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println(hm);
		Iterator<Employee> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e);
		}
		
	}
}

class Employee {
	int id;
	String name;
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.id + ":" + this.name;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean t = super.equals(obj);
		System.out.println("equals = " + t);
		return t;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = super.hashCode();
		System.out.println(this.id + "==" + hash);
		return hash;
	}
	*/
}
