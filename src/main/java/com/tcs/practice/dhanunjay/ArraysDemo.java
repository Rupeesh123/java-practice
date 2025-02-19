package com.tcs.practice.dhanunjay;

import java.util.ArrayList;
import java.util.HashSet;

public class ArraysDemo {

	public static void main(String[] args) {
		
		
		String [] names = new String [5];
		
		int [] marks= new int[5];
		
		names[0]="rushi1";
		names[1]="rushi2";
		names[2]="rushi3";
		names[3]="rushi4";
	//	names[4]=4.0;
		names[4]="rushi5";
		System.out.println(names[4]);
		
		
		//collections
		
		/// ARRAYLIST, LinkedList | HASHSET, LINKEDHASHSET|HASHMAP , LINKEDHASHMAP
		// allow duplicates       | don't allow duplicates|don't allow duplicate keys
		
		ArrayList arrayList=new ArrayList();
		
		arrayList.add("rushi1");
		arrayList.add("rushi10");
		arrayList.add("rushi11");
		arrayList.add("rushi12");
		arrayList.add(145);
		arrayList.add("rushi13");
		arrayList.add("rushi14");
		arrayList.add("rushi15");
		arrayList.add("rushi16");
		arrayList.add("rushi17");
		arrayList.add("rushi18");
		arrayList.add("rushi2");
		arrayList.add("rushi2");
		arrayList.add("rushi2");
		arrayList.add("rushi2");
		arrayList.add(true);
		
		HashSet hashSet=new HashSet();
		hashSet.add("rushi1");
		hashSet.add("rushi10");
		hashSet.add("rushi11");
		hashSet.add("rushi12");
		hashSet.add(145);
		hashSet.add("rushi13");
		hashSet.add("rushi14");
		hashSet.add("rushi15");
		hashSet.add("rushi16");
		hashSet.add("rushi17");
		hashSet.add("rushi18");
		hashSet.add("rushi2");
		hashSet.add("rushi2");
		hashSet.add("rushi2");
		hashSet.add("rushi2");
		hashSet.add(true);
		
		
		System.out.println("ARRAY LIST Values: "+arrayList);
		
		System.out.println("HashSet Values: "+hashSet);
		
	}
}
