package step01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02_CharacterStream {
	//FileWriter : fileSave()
	public static void fileSave() throws IOException {
		FileWriter fw = new FileWriter("CharacterStream.txt");
		
		char[] city = {'뉴', '욕'};
		fw.write(city);
		fw.write("뉴욕");
		
		fw.close();
	}
	
	//Filereader : fileOpen()
/*	public static void fileOpen() throws IOException {
		FileReader fr = new FileReader("CharacterStream.txt");
		
		int data;
		while ( (data = fr.read()) != -1 ) {
			System.out.println((char)data);
		}
		
		fr.close();
	}*/
	
	// ver2
	  public static void fileOpen() throws IOException {
			// try ~ with ~ resource : AutoClose
			try(FileReader fr = new FileReader("CharacterStream.txt")) {
				int data;
				while ( (data = fr.read()) != -1 ) {
					System.out.println((char)data);
				}
			}
		}
		
		
	public static void main(String[] args) {
		try {
//			fileSave();
			fileOpen();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
