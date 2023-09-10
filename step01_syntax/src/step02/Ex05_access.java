package step02;

import model.domain.People;

public class Ex05_access {

	public static void main(String[] args) {
		People ppl1 = new People("java", 29);		
		//System.out.println(ppl1.getName());
		
		ppl1.getName();
		ppl1.getClass();
	}

}


