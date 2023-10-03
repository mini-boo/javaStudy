package concert.controller;


import java.util.ArrayList;

import concert.dto.ConcertInformation;
import concert.exception.NotExistException;
import concert.service.concertService;
import concert.view.EndView;

public class ConcertController {
	private static ConcertController instance = new ConcertController();
	private concertService service = concertService.getInstance();
	
	private ConcertController() {}
	
	public static ConcertController getInstance() {
		return instance;
	}

	
    //모든 프로젝트 검색
    public void concertListView() {
    	ArrayList<ConcertInformation> allConcerts = service.getAllConcerts();
        EndView.concertListView(allConcerts);
    }
    
	//특정 콘서트 검색
	public void concertView(String concertName) {
		ConcertInformation concert = null;
		
	    try {
	        concert = service.getConcert(concertName);
	        
	    } catch (NotExistException e) {
	    	EndView.messageView(e.getMessage());
	    }
	    EndView.concertView(concert);
	}

	//새로운 예매내역 저장
	 public void concertInsert(ConcertInformation newReservation) {
	        service.insertConcert(newReservation);
	    }

	//예매내역 삭제
	 public void concertDelete(String concertName, String userId) {
	        service.deleteConcert(concertName, userId);
	    }
	
}
