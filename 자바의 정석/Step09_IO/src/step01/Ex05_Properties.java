package step01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ex05_Properties {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("db.properties"));
			System.out.println(properties.getProperty("username"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
