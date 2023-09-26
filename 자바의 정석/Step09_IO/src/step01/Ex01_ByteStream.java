package step01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_ByteStream {
	//파일 생성 -> 출력(Output Stream): fileSave()
	public static void filesave() throws IOException {
		FileOutputStream fos = new FileOutputStream("ByteStream.txt");
		fos.write(97);	
		
		byte[] data = {65, 66, 67};
		fos.write(data);
		
		fos.close();
	}
	
	//파일 불러오기 -> inputstream : fileOpen()
	public static void fileOpen() throws IOException {
		FileInputStream fis = new FileInputStream("ByteStream.txt");
		
		//ver1
//		int data;
//		while( (data = fis.read()) != -1 ) {
//			System.out.println((char)data);
//		}
		
		
		//ver2
		int fileSize = (int) new File("ByteStream.txt").length();
		byte[] readData = new byte[fileSize];
		fis.read(readData);
		for(int i = 0; i < readData.length; i++) {
			System.out.println((char)readData[i]);
		}
		
		
		fis.close();
	}
	
	
	
	
	public static void main(String[] args) {
		/*try {
			filesave();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
			try {
				fileOpen();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
