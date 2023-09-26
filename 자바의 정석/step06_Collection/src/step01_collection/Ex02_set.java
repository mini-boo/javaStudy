package step01_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_set {

	public static void main(String[] args) {
		//HashSet
		HashSet<String> set1 = new HashSet<String>();
		set1.add("HTML");
		set1.add("CSS");
		set1.add("JAVA SCRIPT");
		set1.add("Java");
		set1.add("Java");
		
		System.out.println(set1);
		//size()
		
		//향상된 for문
		for(String lecture : set1) {
			System.out.println(lecture);
		}
	
		System.out.println();
		
		//Iterator
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		System.out.println(set1.contains("HTML"));
	}

}
