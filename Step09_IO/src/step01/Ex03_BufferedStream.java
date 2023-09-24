package step01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex03_BufferedStream {
	//버퍼 미사용
	public static void unusedBufferedStream() throws IOException {
		long start;
		long end;
		
		FileInputStream fis = new FileInputStream("waterfall.jpg");
		
		
		start = System.currentTimeMillis();
		while(fis.read() != -1) {}
		end = System.currentTimeMillis();
		
		System.out.println("버퍼 미사용: "+ (end - start) + "ms");
	}
	
	public static void usedBufferedStream() throws IOException {
		long start;
		long end;
		
		FileInputStream fis = new FileInputStream("waterfall.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		
		System.out.println("버퍼 사용: "+ (end - start) + "ms");
	}
	
	
	public static void main(String[] args) {
//	try {
//		unusedBufferedStream();
//		usedBufferedStream();
//	} catch (IOException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

		Scanner inData = new Scanner(System.in);
		int i = inData.nextInt();
		System.out.println(i+10);
	}

}
