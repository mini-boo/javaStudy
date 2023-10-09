package concert.model;

import concert.dto.UserInfoDTO;
import concert.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserInfoDAO {

    // 새 예매자 정보 추가
    public static boolean addUser(UserInfoDTO user) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBUtil.getConnection();

            pstmt = con.prepareStatement("insert into USER_INFO values(?, ?, ?, ?, ?)");
            pstmt.setString(1, user.getUserid());
            pstmt.setString(2, user.getUsername());
            pstmt.setInt(3, user.getUserage());
            pstmt.setString(4, user.getUsergender());
            pstmt.setString(5, user.getUseraddress());

            int result = pstmt.executeUpdate();

            if (result == 1) {
                return true;
            }
        } finally {
            DBUtil.close(con, pstmt);
        }
        return false;
    }

    // 예매자 정보 수정 (userid로 검색 후 주소 수정) name(String), age(int), gender(String), address(String)
    public static boolean updateUser(String userid, String address) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBUtil.getConnection();

            pstmt = con.prepareStatement("update USER_INFO set USER_ADDRESS = ? where USER_ID = ?");
            pstmt.setString(1, address);
            pstmt.setString(2, userid);

            int result = pstmt.executeUpdate();
            if (result == 1) {
                return true;
            }
        } finally {
            DBUtil.close(con, pstmt);
        }
        return false;
    }

    // 예매자 정보 삭제(userid로 검색 후 정보 삭제)
    public static boolean deleteUser(String userid) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBUtil.getConnection();
            pstmt = con.prepareStatement("delete from USER_INFO where USER_ID = ?");
            pstmt.setString(1, userid);
            int result = pstmt.executeUpdate();
            if (result == 1) {
                return true;
            }
        } finally {
            DBUtil.close(con, pstmt);
        }
        return false;
    }

    // userid로 예매자 검색(정보 반환)
    public static UserInfoDTO getUser(String userid) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        UserInfoDTO User = null;

        try {
            con = DBUtil.getConnection();
            pstmt = con.prepareStatement("select * from USER_INFO where USER_ID = ?");
            pstmt.setString(1, userid);
            rset = pstmt.executeQuery();
            if (rset.next()) {
                User = new UserInfoDTO(rset.getString(1),
                                        rset.getString(2),
                                        rset.getInt(3),
                                        rset.getString(4),
                                        rset.getString(5));
            }
        } finally {
            DBUtil.close(con, pstmt, rset);
        }
        return User;
    }

    // 모든 예매자 반환
    public static ArrayList<UserInfoDTO> getAllUsers() throws SQLException {
        Connection con= null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        ArrayList<UserInfoDTO> list = null;
        try {
            con = DBUtil.getConnection();
            pstmt = con.prepareStatement("select * from USER_INFO");
            rset = pstmt.executeQuery();

            list = new ArrayList<UserInfoDTO>();
            while(rset.next()) {
                list.add(new UserInfoDTO(rset.getString(1),
                                            rset.getString(2),
                                            rset.getInt(3),
                                            rset.getString(4),
                                            rset.getString(5)));
            }
        }finally {
            DBUtil.close(con, pstmt, rset);
        }
        return list;
    }
}