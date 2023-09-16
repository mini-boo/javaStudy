package step01_collection;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import model.domain.Student;

public class Ex03_Map {

	public static void main(String[] args, Object entry) {
		// HashMap <K, V>
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		
		//put(): 저장
		hm1.put("one", 1);
		hm1.put("two", 2);
		hm1.put("three", 3);
		
		//System.out.println(hm1);
		//get(key)
		//System.out.println(hm1.get("two"));
		
		//hm1.remove("one");
		//System.out.println(hm1);
		
		System.out.println(hm1.values());
		System.out.println(hm1.keySet());
		System.out.println(hm1.entrySet());
		
		/*
		 * map에서도 for문을 이용해서 내용물을 출력하는 게 가능할까요??
		 */
//		System.out.println(hm1.keySet().getClass());
//		for(String key : hm1.keySet()) {
//			System.out.println(hm1.get(key));
//		}
		
//		System.out.println(hm1.values());
//		System.out.println(hm1.keySet());
//		System.out.println(hm1.entrySet());
		
//		for(Entry<String, Integer> entry : hm1.entrySet()) {
//			System.out.println(entry.getValue());
			
			//if("one".equals(entry.getKey())) {
			//	System.out.println(hm1.get(entry.getKey()));
		//	}
		}
		
//		hm2
		Map<String, Student> hm2 = new HashMap<String, Student>();
		
		//? key k1, name java, studentno = 1, grade = junior
//		hm2.put("k1", new Student("java", 1 , "Junior"));
		
		//System.out.println(hm2.get("k1").getGrade());
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("a");
		arr3.add("b");
		arr3.add("c");
		arr3.add("d");
		arr3.add("e");
		
		//hm3 : <String, ArrayList<String>>
		HashMap<String, ArrayList> hm3 = new HashMap<>();
		hm3.put("arr3", arr3);
		
		System.out.println(hm3);
		
		//b를 출력하려면
		//System.out.println(hm3.get("arr3").get(1));
		
		
		//hm4: <String, HashMap>
		HashMap<String, HashMap> hm4 = new HashMap<>();
		hm4.put("hm3", hm3);
		//System.out.println(hm4);
		
		//b를 출력하려면
		//System.out.println( ((ArrayList)(hm4.get("hm3").get("arr3"))).get(1) );
		

	}

}
