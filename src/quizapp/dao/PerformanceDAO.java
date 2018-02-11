/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.swing.UIManager.getString;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Performance;
import quizapp.pojo.StudentScore;


public class PerformanceDAO {
    
    public static ArrayList<String> getAllStudentId() throws SQLException {
        String qry = "select distinct userid from performance";
        ArrayList<String> studentList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(qry);
        
        while(rs.next())
        {
            String id = rs.getString("userid");
            
            studentList.add(id);
        }
        
           return studentList;
    }
    public static ArrayList<String> getAllExamId(String studentId) throws SQLException
    {
        String qry = "select examid from performance where userid = ?";
        ArrayList<String> examId = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,studentId);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            examId.add(rs.getString(1));
            
        }
        System.out.println(examId);
        return examId;
        
        

    }
    public static StudentScore  getScore(String studentId , String examId ) throws SQLException
    {
        String qry = "select language,per from performance where userid = ? and examid = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,studentId);
        ps.setString(2,examId);
        ResultSet rs = ps.executeQuery();
        
        rs.next();
        
        StudentScore scoreObj = new  StudentScore();
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;
        
    }
    public static ArrayList<Performance>getAllData() throws SQLException
    {
         String qry = "select * from performance ";
          ArrayList<Performance> studentList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery(qry);
        
        while(rs.next())
        {
            String userid = rs.getString(1);
            String examId = rs.getString(2);
            int right = rs.getInt(3);
            int wrong = rs.getInt(4);
            int unattempted = rs.getInt(5);
            double per = rs.getDouble(6);
            String language = rs.getString(7);
            
            Performance pr = new Performance(userid,examId,right,wrong,unattempted,per,language);
            studentList.add(pr);
            
            
            
        }
        return studentList;
                  
        
        
    }
    public static void addPerformance(Performance performance) throws SQLException
    {
        String qry = "insert into performance values(?,?,?,?,?,?,?) ";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1,performance.getUserid());
        ps.setString(2,performance.getExamid());
                ps.setInt(3,performance.getRight());
                ps.setInt(4,performance.getWrong());
                ps.setInt(5,performance.getUnattempted());
        ps.setDouble(6,performance.getPer());
        ps.setString(7,performance.getLanguage());
        ps.executeUpdate();
                

        

                




        
        
        
        //String userid, String examid, int right, int wrong, int unattempted, double per, String language
        
        
    }
        
}
