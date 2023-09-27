package step01_IP;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		// IP
		try {
			//InetAddress local = InetAddress.getLocalHost();
			//System.out.println(local);
			
			//외부 ip
			//InetAddress remote = InetAddress.getByName("naver.com");
			//InetAddress[] remote = InetAddress.getAllByName("naver.com");
			//System.out.println(remote);
			
			
			//url
					URL url = new URL("https://www.naver.com/index.html");
					System.out.println(url.getFile());
			
				
				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
