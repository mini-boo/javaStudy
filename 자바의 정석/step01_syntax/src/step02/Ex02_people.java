package step02;

//사람 people
class People2 {
	//멤버 변수, 필드
	//변수 지정이 안 된 상태로 생성만 했을 때는 기본값으로 설정
	String name;
	int age;
	
	//생성자: 반환값이 없음
	
	//사용자 정의 생성자
	//overloading 생성자 오버로딩
	People2(String name){
		this.name = name;
	}
	
	People2(int age){
		this.age = age;
	}
	
	//두 개의 파라미터를 동시에 받을 수 있는 생성자
	
	People2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//메소드
	//이름(String) 반환하는 메소드 getName()
	String getName() {
		return name;
	}
	
	//나이 반환하는 메소드
	int getAge () {
		return age;
	}
	
	
	// setXXX 메소드
	// setAge(int age)
	void setAge(int age) {
		if(age>0) {
		this.age = age;
		}
	}
}

public class Ex02_people {

	public static void main(String[] args) {
		
		// 필드를 통해 값을 직접 할당하는 경우에는 특정 조건을 줄 수 없음.
		// 따라서 이 부분을 해결하기 위해서는 set 메소드를 활용!
		People2 java = new People2("java", 29);
		System.out.println(java.name);
		System.out.println(java.age);
		
		java.setAge(-30);
		System.out.println(java.age);

	}

}