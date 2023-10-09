package concert.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import concert.dto.ConcertInfoDTO;
import concert.util.DBUtil;

public class ConcertInfoDAO {
	public static boolean addConcert(ConcertInfoDTO concertinfo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into concert_info values(?, ?, ?, ?, ?)");
			pstmt.setString(1, concertinfo.getConcertid());
			pstmt.setString(2, concertinfo.getConcertname());
			pstmt.setDate(3, concertinfo.getConcertdate());
			pstmt.setString(4, concertinfo.getConcerthall());
			pstmt.setInt(5, concertinfo.getConcertprice());
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				return true;
			}
		}finally {
				DBUtil.close(con, pstmt);
			}
		return false;
	}
	
	//모든 콘서트 검색해서 반환
	// sql - select * from concertinfo
	public static ArrayList<ConcertInfoDTO> getAllConcerts() throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ConcertInfoDTO> list = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from concert_info");
			rset = pstmt.executeQuery();
			
			list = new ArrayList<ConcertInfoDTO> ();
			while(rset.next()) {
				list.add(new ConcertInfoDTO(rset.getString(1), rset.getString(2), rset.getDate(3), rset.getString(4), rset.getInt(5)));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
	
	//콘서트 id로 해당 콘서트의 모든 정보 반환
	//sql - select * from concertinfo where concert_id = ?
	public static ConcertInfoDTO getConcert(String concertid) throws SQLException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ConcertInfoDTO Concertinfo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from concert_info Where concert_id = ?");
			pstmt.setString(1, concertid);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				Concertinfo = new ConcertInfoDTO(rset.getString(1), rset.getString(2), rset.getDate(3), rset.getString(4), rset.getInt(5));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return Concertinfo;
	}
	
	
	
	//콘서트 정보 수정
	//콘서트 id로 콘서트 장소 수정하기
	// sql - update concertinfo set concert_hall = ? where concert_id=?
	public static boolean updateConcert(String concertid, String concerthall) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement("update concert_info set concert_hall = ? where concert_id = ?");
			pstmt.setString(1, concerthall);
			pstmt.setString(2, concertid);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				return true;
			}
		}finally {
				DBUtil.close(con, pstmt);
			}
		return false;
	}
	
	
	//콘서트 정보 삭제
	//sql - delete from concertinfo where concert_id = ?
	
	public static boolean deleteConcert(String concertid) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement("delete from concert_info where concert_id = ?");
			pstmt.setString(1, concertid);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				return true;
			}
		}finally {
				DBUtil.close(con, pstmt);
			}
		return false;
	}	
	
}
