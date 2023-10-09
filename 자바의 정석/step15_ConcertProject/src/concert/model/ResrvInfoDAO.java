package concert.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import concert.util.DBUtil;
import concert.dto.ResrvInfoDTO;

public class ResrvInfoDAO {
	
	// 프로젝트 저장
		public static boolean addResrvInfo(ResrvInfoDTO resrvInfo) throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("insert into resrv_info values(?, ?, ?, ?, ?)");
				pstmt.setInt(1, resrvInfo.getTicketno());
				pstmt.setString(2, resrvInfo.getConcertid());
				pstmt.setString(3, resrvInfo.getUserid());
				pstmt.setDate(4, resrvInfo.getResrvdate());
				pstmt.setString(5, resrvInfo.getResrvseat());

				int result = pstmt.executeUpdate();

				if (result == 1) {
					return true;
				}
			} finally {
				DBUtil.close(con, pstmt);
			}
			return false;
		}
	
	// 모든 예매 내역 검색
	public static ArrayList<ResrvInfoDTO> getAllResrvInfos() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ResrvInfoDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from resrv_info");
			rset = pstmt.executeQuery();
			
			// ?
			list = new ArrayList<ResrvInfoDTO>();
			while (rset.next()) {
				list.add(new ResrvInfoDTO(rset.getInt(1),
											rset.getString(2),
											rset.getString(3),
											rset.getDate(4),
											rset.getString(5))); //getString 내장 기능. 인덱스 번호의 칼럼을 가져옴
			}
			
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
		
	}


	// 티켓넘버로 예매 내역 검색
			public static ResrvInfoDTO getResrvInfo(int ticketno) throws SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rset = null;
				ResrvInfoDTO resrv_Info = null;

				try {
					con = DBUtil.getConnection();
					pstmt = con.prepareStatement("select * from resrv_info where ticket_no = ?");
					pstmt.setInt(1, ticketno);
					rset = pstmt.executeQuery();

					if(rset.next()) {
						resrv_Info = new ResrvInfoDTO(rset.getInt(1),
														rset.getString(2),
														rset.getString(3),
														rset.getDate(4),
														rset.getString(5));
					}
					
				} finally {
					DBUtil.close(con, pstmt, rset);
				}
				return resrv_Info;
			}
			
	// 티켓넘버로 예매 좌석 수정
			public static boolean updateResrvseat(int ticketno, String resrvseat) throws SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = DBUtil.getConnection();
					pstmt = con.prepareStatement("update resrv_info set resrv_seat=? where ticket_no = ?");
					pstmt.setString(1, resrvseat);
					pstmt.setInt(2, ticketno);

					int result = pstmt.executeUpdate();
					if (result == 1) {
						return true;
					}
				} finally {
					DBUtil.close(con, pstmt);
				}
				return false;
			}

	// 티켓넘버로 예매 내역 삭제
			public static boolean deleteResrvInfo(int ticketno) throws SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = DBUtil.getConnection();
					pstmt = con.prepareStatement("delete from resrv_info where ticket_no = ?");
					pstmt.setInt(1, ticketno);
					int result = pstmt.executeUpdate();
					if (result == 1) {
						return true;
					}
				} finally {
					DBUtil.close(con, pstmt);
				}
				return false;
			}

}