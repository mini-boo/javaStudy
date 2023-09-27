package step02_chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class client {
	public static void main(String[] args) {
		// socket
		Socket socket = new Socket();
		try {
			// step01 : 연결 요청
			System.out.println("연결 요청 중입니다.");
			socket.connect(new InetSocketAddress("localhost", 9999));
			System.out.println("서버에 접속했습니다.");
			
			// step02 : 통신1(클라이언트 -> 서버)
			OutputStream os = socket.getOutputStream();
			
			String msg = "오늘 금요일이까 칼퇴, 불금!!";
			os.write(msg.getBytes());
			os.flush();
			System.out.println("메세지 전송이 완료되었습니다.");
			
			//step03 : 통신 (서버-> 클라이언트)
			InputStream is = socket.getInputStream();
			
			byte[] requestMsg = new byte[100];
			int countByte = is.read(requestMsg);
			
			String msg2 = new String(requestMsg, 0, countByte, "UTF-8");
			System.out.println("메세지를 정상적으로 받았습니다 : " + msg);
			
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}