
package quizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import quizapp.dbutil.DBConnection;
import quizapp.pojo.Users;


public class usersDao {
    public static Users  validateLogin(Users u) throws SQLException
    {
      
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? AND password = ?");
        
        ps.setString(1, u.getUserid());
        ps.setString(2,u.getPassword());
        ResultSet rs = ps.executeQuery();
        Users q = null;
        if(rs.next()!= false)
        {
            q = new Users();
            q.setUserType(rs.getString(3));
        }
        return q;
       
              
        
        
        
    }
    public static void  registerStudent(Users u) throws SQLException
    {
        
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,'student')");
        System.out.println(u.getPassword());
        ps.setString(1,u.getUserid());
        ps.setString(2, u.getPassword());
        ps.executeUpdate();
        
        
    }
    public static boolean updatePassword(Users u) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password  = ? where userid = ? ");
        ps.setString(1, u.getPassword());
        ps.setString(2, u.getUserid());
        
        int ans = ps.executeUpdate();
        if(ans!=1)
            return false;
        return true;
        
    }
}
