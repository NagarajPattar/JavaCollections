package com.myzee.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new HashMap<>();
		hm.put(5, "start");
		hm.put(1, "do");
		hm.put(2, "good");
		hm.put(3, "be");
		hm.put(4, "good");
		
		Map<Integer, String> shm = Collections.synchronizedMap(hm);
		
		shm.put(0, ".");
		System.out.println(shm);
		Iterator<Integer> it = shm.keySet().iterator();
		while(it.hasNext()) System.out.println(shm.get(it.next()) + " ");
		
		Iterator<Integer> itr = shm.keySet().iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			if(i == 0) {
				shm.put(0, "always");
			}
			if(i == 5) {
				shm.remove(5);
			}
		}
		System.out.println(shm);
		HashMap<K, V>
	}

}
