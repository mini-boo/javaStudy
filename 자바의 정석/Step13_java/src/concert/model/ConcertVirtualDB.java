package concert.model;

import java.util.ArrayList;

import concert.dto.ConcertInformation;
import concert.dto.Customer;
import concert.dto.ReservationInformation;

public class ConcertVirtualDB {
	private static ConcertVirtualDB instance = new ConcertVirtualDB();
	private ArrayList<ConcertInformation> projects = new ArrayList<>();
	
	private ConcertVirtualDB () {
		projects.add(new ConcertInformation("2023 aespa 1st Concert ‘SYNK : HYPER LINE’", "SM-aespa", "2023-02-25", "잠실실내체육관",
				new Customer("my", "customer1", 18, "12구역", true),
				new ReservationInformation("2023-01-18")));
		
		projects.add(new ConcertInformation("ATEEZ WORLD TOUR [THE FELLOWSHIP : BREAK THE WALL] ANCHOR IN SEOUL", "SM-ateez", "2023-04-28", "잠실실내체육관",
				new Customer("atiny", "customer2", 23, "16구역", false),
				new ReservationInformation("2023-03-18")));
		
		projects.add(new ConcertInformation("2023 LOVESOME - 불편한 편의점", "yes24", "2023-04-22", "잠실주경기장",
				new Customer("fan", "customer3", 27, "free", true),
				new ReservationInformation("2023-02-09")));
		
	}
	
	
	public static ConcertVirtualDB getInstance() {
		return instance;
	}
	
	//모든 프로젝트 반환
	public ArrayList<ConcertInformation> getProjectList(){
		return projects;
	}
	
	//프로젝트 주입
	public void insertConcert(ConcertInformation newReservation) {
		projects.add(newReservation);
	}

		
		
}
