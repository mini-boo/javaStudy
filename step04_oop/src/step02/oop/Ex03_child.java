package step02.oop;

class Parent3 extends Object {
	String name;
	
	//heap에 할당된 주소가 아니라 이름을 도출시키기 위해서
	@Override
	public String toString() {
		return name;
	}
	
}

class Child3 extends Parent3 {
	String nickname;
	
	
	//@override
	public String toString() {
		return name + " " + nickname;
	}
	
}




public class Ex03_child {

	public static void main(String[] args) {
//		Parent3 p3 = new Parent3();
//		p3.name = "java";
//		System.out.println(p3);
		
		Child3 c3 = new Child3 ();
		c3.name = "IT";
		c3.nickname = "dev";
		
		//다 나오는 방법 ?
		System.out.println(c3);
		
	}

}
