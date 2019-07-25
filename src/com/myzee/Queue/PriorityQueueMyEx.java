package com.myzee.Queue;

import java.util.Comparator;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueMyEx {
	
	
	public static void main(String[] args) {
		enqueue();
		dequeue();
	}
	
	public static Comparator<Employee> idComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getId() - o2.getId();
		}
	};
	public static Queue<Employee> priorityDemoQ = new PriorityBlockingQueue<>(10, idComparator);

	private static void dequeue() {
		System.out.println(priorityDemoQ.size());
		/*for (int i = 0; i < priorityDemoQ.size(); i++) {
			System.out.println("polling element - " + i);
			System.out.println("see - " + priorityDemoQ.poll());
		}*/
		Employee e1;
		while((e1 = priorityDemoQ.poll()) != null) {
			System.out.println(e1);
		}
	}

	private static void enqueue() {
		
		Random rand = new Random();		
		for(int i = 0; i < 10; i++) {
			int id = rand.nextInt(100);
			System.out.println("adding id - " + id);
			Employee e = new Employee(id, "nagaraj"+id);
			priorityDemoQ.add(e);
		}
		
	}
}

class Employee {
	private int id;
	private String name;
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/*
	 * getters and setters
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " " + id;
	}
	
	
}


