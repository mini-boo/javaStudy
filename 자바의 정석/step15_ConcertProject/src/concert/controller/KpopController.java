package concert.controller;

import java.sql.SQLException;

import concert.dto.ConcertInfoDTO;
import concert.dto.ResrvInfoDTO;
import concert.dto.UserInfoDTO;
import concert.exception.NotExistException;
import concert.model.KpopService;
import concert.view.RunningEndView;
import concert.view.RunningFailView;

public class KpopController {
 private static KpopController instance = new KpopController();
 private KpopService service = KpopService.getInstance();
 
 private KpopController() {}
 
 public static KpopController getInstance() {
	 return instance;
 }

 //예매정보 관련
 	//모든 예매내역 검색
 			public void allResrvs() {
 				try {
 					RunningEndView.resrvListView(service.getAllResrvInfos());
 				} catch (SQLException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
 				}
 			}

 	//ticket no를 통해 예매내역 검색
 			public void getResrv(int ticketno){
 				try {
 					RunningEndView.reservView(service.getResrvInfo(ticketno));
 				} catch (SQLException | NotExistException e) {
 					 RunningFailView.failMessageView("티켓 넘버를 다시 입력해주세요.");
 				}
 			}

 			
 	//ticketno를 통해 좌석 수정 (업데이트)
 			public void updateResrvseat(int ticketno, String resrvseat) {
 				try {
 					if(service.updateResrvseat(ticketno, resrvseat)) {
 						RunningEndView.showError("예매내역이 수정되었습니다.");
 						RunningEndView.reservView(service.getResrvInfo(ticketno));
 					}
 				} catch (SQLException | NotExistException e) {
 					 RunningFailView.failMessageView("올바른 예매 정보를 입력하고 수정해주세요.");
 				}
 			}
				
 		 	//ticket no를 통해 예매내역 삭제
 			public void deleteResrv(int ticketno){
 				try {
 					if (service.deleteResrvInfo(ticketno)) {
                RunningEndView.showError("예매내역이 삭제되었습니다.");
            }
 				} catch (SQLException | NotExistException e) {
 					RunningFailView.failMessageView(e.getMessage());
 				}
 			}
 			
 	//ticketno와 userid 통해 특정 예매자 삭제
 			//user id를 통해 예매내역 삭제
 			public void deleteUserResrv(String userid, int ticketno) {
 			 try {
        if (service.deleteResrvInfo(ticketno) && service.deleteUser(userid)) {
                RunningEndView.showError("예매내역이 삭제되었습니다.");
            }
        } catch (SQLException | NotExistException e) {
          RunningFailView.failMessageView(e.getMessage());
        }
 			}


 			//새로운 이용자의 새 예매내역 생성
 			// 새로 입력한 콘서트가 기존 데이터 내의 콘서트 아이디와 일치하지 않으면, 메시지를 출력하라.
 			public void addResrv(int ticketno, String resrv_seat, String concertid, UserInfoDTO userInfo) {
 		        try {
 		            ConcertInfoDTO concert = service.getConcertInfo(concertid);

 		            if (service.addUserInfo(userInfo) &&
 		                    service.addResrvInfo(new ResrvInfoDTO(ticketno,
 		                            concertid,
 		                            userInfo.getUserid(),
 		                            concert.getConcertdate(),
 		                            resrv_seat))) {
 		                RunningEndView.resrvListView(service.getAllResrvInfos());
 		            }
 		        } catch (SQLException | NotExistException e) {
 		            if (e.getMessage().contains("unique constraint (SCOTT.RESRV_INFO_PK) violated") ) {
 		                RunningFailView.failMessageView("티켓 넘버가 중복됩니다.");
 		            } else if (e.getMessage().contains("unique constraint (SCOTT.USER_INFO_PK) violated")) {
 		                RunningFailView.failMessageView("유저 id가 중복됩니다.");
 		            } else {
 		                RunningFailView.failMessageView(e.getMessage());
 		            }
 		        }
 		    }

 			//기존 이용자의 새 예매내역 생성(오버로딩)
 		    public void addResrv(int ticketno, String resrv_seat, String concertid, String userid) {
 		        try {
 		            ConcertInfoDTO concert = service.getConcertInfo(concertid);
 		            UserInfoDTO user = service.getUserInfo(userid);

 		            if (service.addResrvInfo(new ResrvInfoDTO(ticketno,
 		                    concertid,
 		                    userid,
 		                    concert.getConcertdate(),
 		                    resrv_seat))) {
 		                RunningEndView.resrvListView(service.getAllResrvInfos());
 		            }
 		        } catch (SQLException | NotExistException e) {
 		            if (e.getMessage().contains("unique constraint")) {
 		            	RunningFailView.failMessageView("티켓 넘버가 중복됩니다.");
 		            } else {
 		            	RunningFailView.failMessageView(e.getMessage());
 		            }
 		        }
 		    }
 		    
 		    
 	//예매자 정보 관련	    
 		   //기존 이용자의 배송지 수정
 		    public void updateAddress(String userid, String address) {
 		    	try {
					if(service.updateUser(userid, address)) {
					RunningEndView.showError("배송지가 변경되었습니다.");
					RunningEndView.reservView2(service.getUserInfo(userid));
					}
				} catch (SQLException | NotExistException e) {
 		            if (e.getMessage().contains("unique constraint")) {
 		            	RunningFailView.failMessageView("배송지가 잘못 입력되었습니다.");
 		            } else {
 		            	RunningFailView.failMessageView(e.getMessage());
 		            }
				}
 		    }
 		    
 		    
 		    //기존 이용자 정보 모두 반환
 		    public void getAllUsers() {
 		    	try {
					RunningEndView.userListView(service.getAllUsers());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 		    }
 		    
 	
	//콘서트 정보 관련
 		   //기존 콘서트 정보 모두 반환
 		    public void getAllConcerts() {
 		    	try {
					RunningEndView.concertListView(service.getAllConcerts());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 		    }


}
