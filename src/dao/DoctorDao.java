package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Doctor;
import utility.ConnectionManager;

public class DoctorDao {
	
	List<Doctor> doctor_details=new ArrayList<Doctor>();
	
     public void Doctordetails(int doctorid) throws Exception{
    	 
    	 String ssl="SELECT * FROM DOCTORDETAILS WHERE ID=?";
    	   Doctor doctor=new Doctor();
    		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(ssl);
    		 ps.setInt(1,doctorid);
    		ResultSet rs = ps.executeQuery();
    
    		while(rs.next()) {
    		
    	 String doctorname =rs.getString("doctorname");
    	 String doctorspecialization=rs.getString("doctorspecialization");
    	 String experienceinyears=rs.getString("experienceinyears");
    	 String slot_timings=rs.getString("slot_timings");
    	 String consultation_fees=rs.getString("consultation_fees");
    	 
    	 doctor.setDoctorname(doctorname);
    	 doctor.setDoctorspecialization(doctorspecialization);
    	 doctor.setExperienceinyears(experienceinyears);
    	 doctor.setslot_timings(slot_timings);
    	 doctor.setDoctorfees(consultation_fees);

    	 
     }

	
     }
     
     public List<Doctor>  getalldoctors() throws SQLException, Exception{
    	 
    	 Doctor dc= new Doctor();
    	 String doctor_list="SELECT * FROM DOCTORDETAILS";
    	 
    	 PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(doctor_list);
    		ResultSet rs = ps.executeQuery();
    		
    		while(rs.next()) {
    			
    		
    			String doctorname=rs.getString("doctorname");
    			String doctorspecialization=rs.getString("doctorspecialization");
    			String experienceinyears=rs.getString("experienceinyears");
    			String slot_timings=rs.getString("slot_timings");
    			String consultation_fees=rs.getString("consultation_fees");
    		
    			
    			
    			dc.setDoctorname(doctorname);
    			dc.setDoctorspecialization(doctorspecialization);
    			dc.setExperienceinyears(experienceinyears);
    			dc.setslot_timings(slot_timings);
    			dc.setConsultation_fees(consultation_fees);
    			
    			doctor_details.add(dc);
    		}
    	 

    	return  doctor_details;
    	 
     }
}
