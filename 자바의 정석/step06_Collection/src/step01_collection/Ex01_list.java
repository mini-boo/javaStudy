package step01_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex01_list {

	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<String> arr1 = new ArrayList();
		
		//add
		arr1.add("Java");
		//arr1.add(1);
		
		//System.out.println(arr1);
		
		//get(idx) : 해당 index의 객체를 return
		//System.out.println(arr1.get(1));
		
		//remove(idx) : 해당 idx 삭제
		//System.out.println(arr1.remove(1));
		//System.out.println(arr1);
		
		for (int i = 0; i < arr1.size() ; i++) {
			//System.out.println(((String)arr1.get(i)).charAt(1));
			System.out.println(arr1.get(i).charAt(1));
		}
		
		//1. 저장 순서!
		arr1.add("JSP");
		System.out.println(arr1);
		
		//1-1. 저장/삭제 순서
		arr1.remove(0);
		System.out.println(arr1);
		//-> ArrayList에서는 중간에 index가 비는 경우가 없다.
		
		//2. 생성
		//초기 몇개의 데이터를 사용해야 하는지 반드시 지정할 필요가 없다.
		//ArrayList의 크기는 동적으로 변한다!
		
		
		//LinkedList
		LinkedList<String> list1 = new LinkedList();
		
		list1.add("java");
		System.out.println(list1);
		
		list1.set(0,  "JAVA");
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
		
		
		
	}

}
