/* 도메인 모델(Domain Model)
 * - 객체 지향 분석 설계 기반으로 구현하고자 하는 도메인(비즈니스 영역)의 모델을 생성하는 패턴
 * - 도메인에서의 객체 판별, 목록 작성, 객체간의 관계
 * - 속성과 기능 분리
 * - 단순 : 테이블 하나 = 하나의 도메인 객체
 * - 재사용성, 유지보수 용이, 확장성
 * - 모델 구축의 어려움
 */

/* 접근 제한자(Access modifier)
 * modifier[제어자]
1. access modifier
	- 적용되는 위치
		1. 클래스 선언구 : public, default
		2. 변수 선언구 : public, protected, default, private
		3. 생성자 선언구 : public, protected, default, private
		4. 메소드 선언구 : public, protected, default, private
		
	- 호출가능한 범위  제한
	1. public : 동일한 클래스, 동일한 package, 외부 package에서 호출 가능
	2. protected : 동일한 클래스, 동일한 package, 
					단, 상속관계의 외부 package의 클래스에선 호출 가능
	3. default[friendly]
				- 동일한 package에서만 access 가능
	4. private : 동일한 class 내에서만 access 가능 
	
	
2. 기타 modifier
	- 옵션
	1. static
		1. 변수 - 공유자원
		2. 메소드 - 객체 생성없이 메소드 호출 가능 기능만 제공
		3. static{} - 공유자원 단 1번 실행, byte code가 로딩시 단 한번 실행 
		
	2. abstract
		- 추상
	3. final
	4. synchronized
 */

package model.domain;

public class People {
	
	//필드
	//객체의 필드에 직접 접근하지 못하도록 막아주는 행위 - private(캡슐화)
	
	private People() {
		super();
	}
	
	
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//필드
	 String name;
	 int age;
	 
	 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	 
	 
}
