package concert.model;

import java.sql.SQLException;
import java.util.ArrayList;

import concert.dto.ConcertInfoDTO;
import concert.dto.ResrvInfoDTO;
import concert.dto.UserInfoDTO;
import concert.exception.NotExistException;


public class KpopService {

	private static KpopService instance = new KpopService();
	
	private KpopService() {}
	
	public static KpopService getInstance() {
		return instance;
	}
	
	
    //Resrv - CRUD
		public void notExistResrvInfo(int ticketno) throws NotExistException, SQLException{
			ResrvInfoDTO resrvInfo = ResrvInfoDAO.getResrvInfo(ticketno);
			if(resrvInfo == null){
				throw new NotExistException("검색하신 예매 정보가 없습니다.");				
			}	
		}
		
		
	//모든 예매내역 정보 반환
		public ArrayList<ResrvInfoDTO> getAllResrvInfos() throws SQLException {
			return ResrvInfoDAO.getAllResrvInfos();
		}
		
		
	//티켓 넘버로 예매 내역 검색
		public ResrvInfoDTO getResrvInfo(int ticketno) throws SQLException, NotExistException {
			notExistResrvInfo(ticketno);
			return ResrvInfoDAO.getResrvInfo(ticketno);
		}
		
	//티켓 넘버로 예매 내역 추가
		public boolean addResrvInfo(ResrvInfoDTO resrvInfo) throws SQLException {
			return ResrvInfoDAO.addResrvInfo(resrvInfo);
		}
	
		
	//기존 예매 내역에서 좌석 수정
		public boolean updateResrvseat(int ticketno, String resrvseat) throws SQLException, NotExistException{
			notExistResrvInfo(ticketno);
					return ResrvInfoDAO.updateResrvseat(ticketno, resrvseat);
		}
		
		
	// 티켓넘버로 예매 내역 삭제
		public boolean deleteResrvInfo(int ticketno) throws SQLException, NotExistException {
			notExistResrvInfo(ticketno);
			return ResrvInfoDAO.deleteResrvInfo(ticketno);
		}
		

	
		
		
		
	//Concert - CRUD
	public void notExistConcertInfo(String concertid) throws SQLException, NotExistException {
		ConcertInfoDTO concertinfo = ConcertInfoDAO.getConcert(concertid);
		if(concertinfo == null) {
			throw new NotExistException("검색하신 콘서트 정보가 없습니다.");
		}
	}
	
	//모든 콘서트 정보 반환
	public ArrayList<ConcertInfoDTO> getAllConcerts() throws SQLException{
		return ConcertInfoDAO.getAllConcerts();
	}
	
	  // concert_id로 콘서트 정보 검색
    public ConcertInfoDTO getConcertInfo(String concertid) throws SQLException, NotExistException {
        notExistConcertInfo(concertid);
        return ConcertInfoDAO.getConcert(concertid);
    }

    // 새 콘서트 저장
    public boolean addConcertInfo(ConcertInfoDTO concertInfo) throws SQLException {
        return ConcertInfoDAO.addConcert(concertInfo);
    }
	
	//콘서트 정보 수정
	
	//콘서트 id로 콘서트 정보 삭제
	public boolean deleteConcert(String concertid) throws SQLException {
		return ConcertInfoDAO.deleteConcert(concertid);
	}
	
	
	
	
	
	
	
	// User - CRUD
    public void notExistUserInfo(String userid) throws SQLException, NotExistException {
    	UserInfoDTO userInfo = UserInfoDAO.getUser(userid);
        if (userInfo == null) {
            throw new NotExistException("검색하신 예매자 정보가 없습니다.");
        }
    }
    
    //모든 예매자 정보 반환
    public ArrayList<UserInfoDTO> getAllUsers()throws SQLException{
    	return UserInfoDAO.getAllUsers();
    }
    
    // user_id로 예매자 정보 검색
    	public UserInfoDTO getUserInfo(String userid) throws SQLException, NotExistException {
    		notExistUserInfo(userid);
    		return UserInfoDAO.getUser(userid);
    	}

    //새 예매자 저장
    	public boolean addUserInfo(UserInfoDTO userInfo) throws SQLException {
    		return UserInfoDAO.addUser(userInfo);
    	}
    
    //예매자 정보 추가
    
    //예매자 배송지 수정
    	public boolean updateUser(String userid, String address) throws SQLException, NotExistException {
    		notExistUserInfo(userid);
    		return UserInfoDAO.updateUser(userid, address);
    	}
    
    //예매자 id로 예매자 정보 삭제
    	public boolean deleteUser(String userid) throws SQLException {
    		return UserInfoDAO.deleteUser(userid);
    	}
    
    
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
