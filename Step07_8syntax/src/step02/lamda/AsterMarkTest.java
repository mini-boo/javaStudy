package step02.lamda;

public class AsterMarkTest {
	
	public static void main(String[] args) {
		// ? 두 문장을 *를 기점으로 합쳐서 출력하는 기능
		String str1 = "Hello";
		String str2 = "JAVA";
		//Hello*JAVA
		
		System.out.println();
		
		//interface + class
		AestermarkImpl aestermark = new AestermarkImpl();
		aestermark.addAestermark("Hello", "Java");
		
		
		//lambda
		Aestermark aester = (String s1, String s2) -> System.out.println(s1 + "*" + s2);	
		aester.addAestermark("Hello", "JAVA");
	
	}

}
