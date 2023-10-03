package concert.service;

import java.util.ArrayList;

import concert.dto.ConcertInformation;
import concert.exception.NotExistException;
import concert.model.ConcertVirtualDB;

public class concertService {
	private static concertService instance = new concertService();
	private ConcertVirtualDB concertData = ConcertVirtualDB.getInstance();

	public static concertService getInstance() {
		return instance;
	}
	
	
	//콘서트 검색
	public ConcertInformation getConcert(String concertName) throws NotExistException {
	    ArrayList<ConcertInformation> concertList = concertData.getProjectList();
	    
	    for (ConcertInformation concert : concertList) {
	        if (concert.getConcertName().equals(concertName)) {
	            return concert;
	        }
	    }
	    throw new NotExistException("검색하신 콘서트 정보는 존재하지 않습니다.");
	}
	
	//모든 콘서트 겁색
	public ArrayList<ConcertInformation> getAllConcerts(){
		return concertData.getProjectList();
	}	

	
	//예매내역 추가
	public void insertConcert(ConcertInformation newReservation) {
		concertData.insertConcert(newReservation);
	}
	
	//예매내역 삭제
	public void deleteConcert (String concertName, String userId) {
	    ArrayList<ConcertInformation> concertList = concertData.getProjectList();
	    
	    concertList.removeIf(c -> c.getConcertName().equals(concertName) && c.getCustomer().getUserId().equals(userId));
	}

}
