package concert. view;

import java.util.ArrayList;

import concert.dto.ConcertInformation;

public class EndView {

	//특정 콘서트 정보
	public static void concertView(ConcertInformation concert) {
	    System.out.println("Concert Name: " + concert.getConcertName());
	    System.out.println("Concert ID: " + concert.getConcertID());
	    System.out.println("Concert Date: " + concert.getConcertDate());
	    System.out.println("Concert Place: " + concert.getConcertPlace());
	    System.out.println("Customer Information: " + concert.getCustomer());
	    System.out.println("Reservation Information: " + concert.getReservationInformation());
	}

	//모든 콘서트 정보
	public static void concertListView(ArrayList<ConcertInformation> allConcerts) {
		for(int i = 0 ; i<allConcerts.size(); i++) {
			System.out.println("[Concert " + (i+1) + "]" );
			System.out.println(allConcerts.get(i));
		}
	}


	// 단순메시지
	public static void messageView(String message) {
		System.out.println(message);
	}
	}
