
/*
 * We cannot remove the element from CopyOnWriteArrayList, will get java.lang.UnsupportedOperationException
 */
package com.myzee.List;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> arrList = new CopyOnWriteArrayList<>();
		arrList.add(3);
		arrList.add(4);
		arrList.add(8);
		arrList.add(6);
		Iterator<Integer> itr = arrList.iterator();
		while(itr.hasNext()) {
			int ele = itr.next();
			if(ele == 8) {
				/*
				 * java.lang.UnsupportedOperationException
				 */
//				itr.remove();	
			}
		}
		System.out.println("\n\n");
		Object[] obj = new Object[4];
		obj[0] = 2;
		obj[1] = "text";
		obj[2] = new Double(7);
		
		for(int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				System.out.println(obj[i].toString());
			} else {
				System.out.println(obj[i]);
			}
		}
	}
}

