package step02_Listup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionPractice {


	public static void main(String[] args) {
		
		ArrayList<String> ateez = new ArrayList();
		
		ateez.add("HJ");
		
		System.out.println(ateez);

		
		HashSet<String> newjeans = new HashSet<String>();
		
		newjeans.add("MG");
		
		System.out.println(newjeans);
		
		HashMap<String, Integer> aespa = new HashMap<String, Integer>();
		aespa.put("Karina", 2);
		
		System.out.println(aespa);
	}

}
