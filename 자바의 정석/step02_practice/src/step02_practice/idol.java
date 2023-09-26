package step02_practice;

class idol2 {
	
	//변수 생성
	String ateez;
	String shinee;
	
	// (1) 기본 생성자
	idol2(){}
	
	// (2) 사용자 정의 생성자
	idol2(String ateez){
		this.ateez = ateez;
	}
	
	//메소드
	String getAteez() {
		return this.ateez;
	}
}
public class idol {

	public static void main(String[] args) {
		idol2 ateez = new idol2("newjeans");
	}

}
