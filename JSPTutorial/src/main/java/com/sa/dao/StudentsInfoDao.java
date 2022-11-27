package com.sa.dao;

import com.sa.models.StudentsInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Author : Chittebabu
 * Objective : POJO for Students table --> MySQL
 * Date : 25/11/2022
 */

public class StudentsInfoDao {
    public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
        Connection connect = null;
        // register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // mysql login credentials
        String username = "root";
        String password = "8121000d";

        // path of database
        String dbUrl = "jdbc:mysql://localhost:3306/pfs";

        // establish connection
        connect = DriverManager.getConnection(dbUrl, username, password);
        return connect;
    }

    public static int insert(StudentsInfo student) throws ClassNotFoundException, SQLException {
        Connection connect = getDBConnection();
        String sql = "INSERT INTO Students VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connect.prepareStatement(sql);
        pstmt.setInt(1, student.getStudentId());
        pstmt.setString(2, student.getFirstName());
        pstmt.setString(3, student.getLastName());
        pstmt.setString(4, student.getGender());
        pstmt.setString(5, student.getAddress());
        pstmt.setString(6, student.getPhoneNumber());
        pstmt.setString(7, student.getCourseSelected());

        int rows = pstmt.executeUpdate();
        return rows;
    }

//    public void getData(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
//        Connection connect = getDBConnection();
//        Statement stmt = connect.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM Students;");
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/html;charset=UTF-8");
//        out.println("<p>");
//
//
//    }
}
