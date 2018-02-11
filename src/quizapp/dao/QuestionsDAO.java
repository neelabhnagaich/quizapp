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
import java.util.ArrayList;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.QuestionStore;
import quizapp.pojo.Questions;


public class QuestionsDAO {
    public static void updateQuestions(QuestionStore qstore) throws SQLException
    {
        String qry = "update questions set question = ? , answer1 = ? , answer2 = ? , answer3 = ? , answer4 = ? , correct_answer = ? where qno= ? AND examid = ?";
        ArrayList<Questions> questionList = qstore.getAllquestion();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        
        
        for(Questions obj: questionList)
        {
            
            ps.setString(1,obj.getQuestion());
            ps.setString(2, obj.getAnswer1());
            ps.setString(3, obj.getAnswer2());
            ps.setString(4, obj.getAnswer3());
            ps.setString(5, obj.getAnswer4());
            ps.setString(6,obj.getCorrectAnswer());

            ps.setInt(7,obj.getQno());
            ps.setString(8,obj.getExamId());

           
            
            ps.executeUpdate();
            

        }
        
    }
    
    public static void addQuestions(QuestionStore qstore) throws SQLException
    {
        String qry = "insert into questions values(?,?,?,?,?,?,?,?,?)";
        ArrayList<Questions> questionList = qstore.getAllquestion();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        
        
        for(Questions obj: questionList)
        {
            ps.setString(1,obj.getExamId());
            ps.setInt(2,obj.getQno());
            ps.setString(3,obj.getQuestion());
            ps.setString(4, obj.getAnswer1());
            ps.setString(5, obj.getAnswer2());
            ps.setString(6, obj.getAnswer3());
            ps.setString(7, obj.getAnswer4());
            ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            
            ps.executeUpdate();
            

        }
        
        
    }
    
    public static ArrayList<Questions> getQuestionsByExamId(String examId) throws SQLException
    {
        String qry = "select * from questions where examid=? order by qno";
        ArrayList<Questions> questionList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, examId);
                ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            String examid = rs.getString(1);
            int qno = rs.getInt(2);
            String question = rs.getString(3);
            String answer1 = rs.getString(4);
            String answer2 = rs.getString(5);
            String answer3 = rs.getString(6);
            String answer4 = rs.getString(7);
            String correctAnswer = rs.getString(8);
            String language = rs.getString(9);
            Questions ques =    new Questions( examId, qno,  language,  answer1, answer2, answer3, answer4, correctAnswer, question) ;
             questionList.add(ques);
            
        }
        return questionList;
                
        
        
    }
    
}
