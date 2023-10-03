package concert.view;

import concert.controller.ConcertController;
import concert.dto.ConcertInformation;
import concert.dto.Customer;
import concert.dto.ReservationInformation;

public class StartView {

	public static void main(String[] args) {
		ConcertController controller = ConcertController.getInstance();
		
	//고객
		Customer customer4 = new Customer("army", "customer4", 30, "27구역", true);
	//예매날짜
		ReservationInformation newReservationDate = new ReservationInformation("2023-04-17");
	//새로운 콘서트 정보
		ConcertInformation newReservation = new ConcertInformation("BTS PERMISSION TO DANCE ON STAGE", "HYBE-BTS", "2023-07-23", "고척스카이돔", customer4, newReservationDate);

		
	//콘서트 검색
		System.out.println("===콘서트 검색===");
		controller.concertView("2023 LOVESOME - 불편한 편의점");
		System.out.println();
		
	
	//예매내역 추가
		System.out.println("===예매내역 추가===");
		controller.concertInsert(newReservation);
		controller.concertListView();
		System.out.println();
		
		
	//예매내역 삭제
		System.out.println("===예매내역 삭제===");
		controller.concertDelete("2023 aespa 1st Concert ‘SYNK : HYPER LINE’", "my");
		controller.concertView("2023 aespa 1st Concert ‘SYNK : HYPER LINE’");
		System.out.println();

	}

}
