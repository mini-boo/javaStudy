package concert.view;

import java.util.ArrayList;

import concert.dto.ConcertInfoDTO;
import concert.dto.ResrvInfoDTO;
import concert.dto.UserInfoDTO;

public class RunningEndView {
	
	//예매내역 관련
	//모든 예매내역 출력
	public static void resrvListView(ArrayList<ResrvInfoDTO> allResrv) {
		int length = allResrv.size();
		if (length != 0) {
			for(int index = 0; index < length; index++) {
				System.out.println("검색정보" + (index+1)+ " - " + allResrv.get(index));
			}
		}
	}
	
	//특정 예매내역 출력
	public static void reservView(ResrvInfoDTO resrv) {
		System.out.println(resrv);
	}
	
	
	
	
	//예매자 관련
	//모든 예매자 정보 출력
	public static void userListView(ArrayList<UserInfoDTO> allUser) {
		int length = allUser.size();
		if (length != 0) {
			for(int index = 0; index < length; index++) {
				System.out.println("검색정보" + (index+1)+ " - " + allUser.get(index));	
			}
		}
	}
	
	//특정 예매자 정보 출력
	public static void reservView2(UserInfoDTO user) {
		System.out.println(user);
	}
	
	
	
	
	//콘서트 관련
	//모든 콘서트 정보 출력
	public static void concertListView(ArrayList<ConcertInfoDTO> allConcert) {
		int length = allConcert.size();
		if(length != 0) {
			for(int index = 0; index < length; index++) {
				System.out.println("검색정보" + (index+1)+ " - " + allConcert.get(index));	
			}
		}
	}
	
	
	
	
	//모든 DTO 정보 출력하는 메소드
	public static void allView(Object object) {
		System.out.println(object);
	}
	
	//예외 상황 출력
	public static void showError(String message) {
		System.out.println(message);
	}
	
	
	
}
