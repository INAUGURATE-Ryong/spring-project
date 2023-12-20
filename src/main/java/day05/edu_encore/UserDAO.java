package day05.edu_encore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class UserDAO {  //추상클래스 - controller

    //DB 연결 관련 메소드
    public abstract Connection getConnection() throws Exception;  // 추상메소드

    //사용 (DML 명령어)
    //insert
    public void insert(UserVO vo) throws Exception {
        Connection conn = getConnection();
        String sql = "INSERT INTO USERS(ID,NAME,PASSWORD) VALUES(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, vo.getId());
        pstmt.setString(2, vo.getName());
        pstmt.setString(3, vo.getPassword());

        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 입력 성공!!!");
        conn.commit();

        pstmt.close();
        conn.close();
    }

    //selectAll
    public List<UserVO> selectAll() throws Exception {
        List<UserVO> list = new ArrayList<>();
        Connection conn = getConnection();
        ResultSet rs;
        String sql = "SELECT ID,NAME,PASSWORD FROM USERS";
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            UserVO vo = new UserVO();
            vo.setId(rs.getString("ID"));
            vo.setName(rs.getString("NAME"));
            vo.setPassword(rs.getString("PASSWORD"));

            list.add(vo);

        }
        rs.close();
        stmt.close();
        conn.close();

        return list;
    }

    //selectById
    public UserVO selectById(String str) throws Exception {
        UserVO vo = null;
        Connection conn = getConnection();
        ResultSet rs;
        String sql = "SELECT ID,NAME,PASSWORD FROM USERS WHERE ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,str);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            vo = new UserVO();
            vo.setId(rs.getString("ID"));
            vo.setName(rs.getString("NAME"));
            vo.setPassword(rs.getString("PASSWORD"));

        }
        rs.close();
        pstmt.close();
        conn.close();

        return vo;

    }


    public void update(UserVO vo) throws Exception {
        Connection conn = getConnection();
        String sql = "UPDATE USERS SET NAME = ?, PASSWORD = ? WHERE ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, vo.getName());
        pstmt.setString(2, vo.getPassword());
        pstmt.setString(3, vo.getId());

        int result = pstmt.executeUpdate();

        System.out.println(result + " 개 수정 성공!!!");
        conn.commit();

        pstmt.close();
        conn.close();
    }

    //update
    public void delete(UserVO vo) throws Exception {
        Connection conn = getConnection();
        String sql = "DELETE FROM USERS WHERE ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getId());

        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 삭제 성공!!!");
        conn.commit();

        pstmt.close();
        conn.close();

    }


    //delete


    //menu
    public void menu() {
        System.out.println("선택하세요 : \n1.Insert");
        System.out.println("2.SelectAll \n3.SelectById \n4.Update \n5.Delete ");
    }
}
