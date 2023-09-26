package step01_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex04_InOut {

	public static void main(String[] args) {
		//stack : LIFO
		Stack<String> card = new Stack<String>();
		
		//push (저장)
		card.push("Lotte");
		card.push("Hana");
		card.push("Woori");
		card.push("Hundae");
		
		// pop() : 반환 +삭제 / peek() : 반환
		System.out.println(card.pop());
		System.out.println(card);
		
		System.out.println(card.peek());
		System.out.println(card);
		
		
		
		//Queue : FIFO (인터페이스로 존재)
		Queue<String> drinkBox = new LinkedList<String>();
		
		//add 사용
		drinkBox.add("cocacola");
		drinkBox.add("sprite");
		drinkBox.add("coffee");
		
		System.out.println(drinkBox);
		
		//peek() : 반환 , poll() : 반환+삭제
		System.out.println(drinkBox.peek());
		System.out.println(drinkBox);
		
		System.out.println(drinkBox.poll());
		System.out.println(drinkBox);

	}

}
