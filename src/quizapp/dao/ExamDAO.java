
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Exam;


public class ExamDAO {
    public static String getExamId() throws SQLException
    {
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs  = st.executeQuery("select count(*) as totalrows from exam");
        int rowCount = 0;
        if(rs.next())
            rowCount = rs.getInt("totalrows");
        String newId = "EX-"+(rowCount+1);
        return newId;
    }
    
    public static void addExam(Exam newExam) throws SQLException
    {
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1,newExam.getExamId());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3,newExam.getTotalQuestions());
        ps.executeUpdate();
        
        
    }
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
    {
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from Exam where language = ?");
        ArrayList<String> exid = new ArrayList<>();
        
        ps.setString(1,subject);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            exid.add(rs.getString(1));
        }
        return exid;
        
    }
    public static int getQuestionCountByExam(String examId)throws SQLException
    {
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select total_question from exam where examid = ?");
        ps.setString(1,examId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return rs.getInt(1);
        
    }
}
