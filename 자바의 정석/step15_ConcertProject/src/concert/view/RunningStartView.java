package concert.view;

import concert.controller.KpopController;
import concert.dto.UserInfoDTO;

public class RunningStartView {

	public static void main(String[] args) {
		KpopController controller = KpopController.getInstance();
		
		
		System.out.println("****예매 정보 관련 기능****");
		
		System.out.println("=====모든 예매내역 검색=====");
		//controller.allResrvs();
		
		System.out.println();
		
		System.out.println("=====ticketno 통해 특정 예매내역 검색=====");
		//controller.getResrv(1001);
		
		System.out.println();

		System.out.println("=====ticketno를 통한 예매 좌석 수정=====");
		//controller.updateResrvseat(1001, "b1");
		
		System.out.println();
		
		System.out.println("=====기존 예매자의 새 예매내역 등록=====");
		//controller.addResrv(4004,"S4","concert2","user2");
		
		System.out.println();
		
		System.out.println("=====기존 회원 예매내역 삭제=====");
		//controller.deleteResrv(4004);
		
		System.out.println();
		
		System.out.println("=====비회원의 새 예매내역 등록=====");

		//controller.addResrv(3003,"S3","concert1",
        //        new UserInfoDTO("user3","karina",26,"W","DaeGu"));
		
		System.out.println();
		
		System.out.println("=====비회원 예매내역 삭제=====");
		//controller.deleteUserResrv("user3",3003);
		
		System.out.println();
		
		System.out.println("****예매자 관련 기능****");
		
		System.out.println();
		
		System.out.println("=====예매자 모두 조회=====");
		//controller.getAllUsers();
		
		System.out.println();
		
		System.out.println("=====예매자 배송지 변경=====");
		//controller.updateAddress("user1", "Jeju");
		
		System.out.println();
		
		System.out.println("****콘서트 정보 관련 기능****");
		
		System.out.println();
		
		System.out.println("=====콘서트 조회=====");
		//controller.getAllConcerts();
		
	
	}

}
