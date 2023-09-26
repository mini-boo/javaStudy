package step01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.domain.Person;

public class Ex04Serialization {
	public static void main(String[] args) {
		try {
			// 객체 출력 : java -> 파일
			FileOutputStream fos = new FileOutputStream("Person.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Person personOut = new Person("java", 29, 1001);
			
			oos.writeObject(personOut);
			
			oos.flush();
			oos.close();
			fos.close();

			// 객체 입력 : 파일 -> java
			FileInputStream fis = new FileInputStream("Person.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person personIn = (Person)ois.readObject();
			System.out.println(personIn.getAge());
			
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}