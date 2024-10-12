package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

public class Usermanagement_impl implements Usermanagement{
	public Connection getconnection() throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection1=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/usermanagement","root","HAri7510@");
		
		return connection1;
		
	}

	
	
	

	@Override
	public int saveuser(source.User user) throws SQLException, ClassNotFoundException {
		Connection connection=getconnection();
		
		String query=" insert into user (username,email,passwords,gender,state) values(?,?,?,?,?)";
		PreparedStatement pst=connection.prepareStatement(query);
	    pst.setString(1, user.getUsername());
	    pst.setString(2, user.getEmail());
	    pst.setString(3, user.getPassword());
	    pst.setString(4, user.getGender());
	    pst.setString(5, user.getState());
	    
	    int exe=pst.executeUpdate();
	    return exe;
		
	}


	@Override
	public source.User fetchuser(String email, String passwords) throws ClassNotFoundException, SQLException {
     source.User u=null;
     Connection connection=getconnection();
     String query="select * from user where email=? and passwords=?";
     PreparedStatement pst=connection.prepareStatement(query);
     pst.setString(1, email);
     pst.setString(2, passwords);
     ResultSet rs=pst.executeQuery();
     while(rs.next()) {
    	 u=new source.User();
     u.setUserid(rs.getInt(1));
     u.setUsername(rs.getString(2));
     u.setEmail(rs.getString(3));
     u.setPassword(rs.getString(4));
     u.setGender(rs.getString(5));
     u.setState(rs.getString(6));
     
    

    	 
     }
	return u;
     
     
	}





	@Override
	public List<source.User> getalluser() throws ClassNotFoundException, SQLException {
		List<source.User> l=new ArrayList();
		source.User u=null;
		Connection connection=getconnection();
		String query="select * from User";
		PreparedStatement pst=connection.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
		 u=new source. User();
		u.setUserid(rs.getInt(1));
		u.setUsername(rs.getString(2));
		u.setEmail(rs.getString(3));
		u.setGender(rs.getString(4));
		u.setState(rs.getString(5));
		
		l.add(u);
			
		}
		
		
		
		
		return l;
	}

}
