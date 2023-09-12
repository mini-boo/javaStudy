package step04_override;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// equals 재정의
	@Override
	public boolean equals(Object o) {
		//o 객체를 활용하여 name, age를 가져올 수 있어야 함. -> 형변환
		Person p = (Person)o;
		//형변환한 p와 자기자신의 name, age값을 비교해야 함.
		if(o instanceof Person) {
			return true;
		}
		return false;
	}
}

class Person2 {
	String name;
	int age;
	
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Equalsoverride {
	public static void main(String[] args) {
		Person p = new Person("java", 28);
		Person p1 = new Person("java", 28);
		Person2 p2 = new Person2("java", 28);
		
		//? 같은 타입 && 같은 이름 && 같은 나이 ==> 같은 객체로 인식
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		
	}
}
