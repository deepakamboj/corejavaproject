package com.dk.collection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> list = new Vector<>();
		list.add(10);
		list.add(12);
		list.add(22);
		list.add(12);
		list.add(12);
		list.add(null);
		list.add(null);
		list.add(3);

		System.out.println(list);
		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println("After deleting duplicate elements : " + "\n" + set);

		Integer min = set.stream().findFirst().get();
//		Integer max = set.stream().sorted(Collections.reverseOrder()).findFirst().get();
//		System.out.println(max);
//		System.out.println(min);

	}

}
