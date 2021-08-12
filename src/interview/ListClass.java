package interview;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		List<Integer>  li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(50);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		li.remove(2);
		System.out.println(li);
		
		Integer integer = li.get(2);
		System.out.println(integer);
		
		int size2 = li.size();
		System.out.println(size2);
		
		boolean contains = li.contains(20);
		System.out.println(contains);
		
		boolean b = li.isEmpty();
		System.out.println(b);
		li.set(1, 57);
		System.out.println(li);
		
		int indexOf = li.indexOf(30);
		System.out.println(indexOf);
		int indexOf2 = li.lastIndexOf(10);
		System.out.println(indexOf2);
		for (int i = 0; i < li.size(); i++) {
			Integer integer2 = li.get(i);
		System.out.println(integer2);
		for(Integer x:li) {
			System.out.println(x);
		}
			
		}
		
		
	}

}
