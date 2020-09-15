package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Admin;
import utility.ConnectionManager;



public class AdminDao {

	List<Admin> adminlist= new ArrayList<Admin>(); 
	
	public void getAllDetails() throws SQLException, Exception{
		
		Admin ad=new Admin();
		String Patient_data ="SELECT * FROM ADMIN";
		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Patient_data );
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String userid=rs.getString("userid");
			String email=rs.getString("email");
			String password=rs.getString("password");
			
			ad.setUserid(userid);
			ad.setEmail(email);
			ad.setPassword(password);
			
			adminlist.add(ad);
		}
		
	}
}
