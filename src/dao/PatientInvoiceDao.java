package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.PatientInvoice;
import utility.ConnectionManager;

public class PatientInvoiceDao {

	List<PatientInvoice> invoiceList= new ArrayList<PatientInvoice>(); 
	
public int insertPatient(PatientInvoice pat) throws Exception {
	
	//INSERTION OF PATIENT DETAILS AND NEEDS USING INSERT QUERRY
	Connection cn= ConnectionManager.getConnection();
	String sql="INSERT INTO INVOICEDATA (patientId,patientName,age,gender,mobileNo,address,MedicineName,costOfMedicine,no_of_items,TotalCost) VALUES(?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(sql);
	ps.setInt(1,pat.getPatientid());
	ps.setString(2,pat.getPatientName());
	ps.setInt(3,pat.getAge());
	ps.setString(4,pat.getGender());
	ps.setString(5,pat.getMobileNo());
	ps.setString(6,pat.getAddress());
    ps.setString(7,pat.getMedicineName());
    ps.setInt(8,pat.getCostOfMedicine());
    ps.setInt(9,pat.getNoOfItems());
    ps.setInt(10,pat.getTotalcost());
    
    int result=ps.executeUpdate();
	cn.close();
	return result;
	
}

public List<PatientInvoice> getAllDetails() throws SQLException, Exception {
	//Retrieve the details using insert Querry
	PatientInvoice patientInvoice=new PatientInvoice();
	String Patient_data ="SELECT * FROM INVOICEDATA";
	PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Patient_data );
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		int patientid=rs.getInt("patientid");
	    String patientName=rs.getString("patientName");
	    int age=rs.getInt("age");
	    String gender=rs.getString("gender");
	    String mobileNo=rs.getString("mobileNo");
		String address=rs.getString("address");
		String medicineName=rs.getString("medicineName");
		int costOfMedicine=rs.getInt("costOfMedicine");
		int no_of_items=rs.getInt("no_of_items");
		int totalcost=rs.getInt("totalcost");

		
		patientInvoice.setPatientid(patientid);
		patientInvoice.setPatientName(patientName);
		patientInvoice.setAge(age);
		patientInvoice.setGender(gender);
		patientInvoice.setMobileNo(mobileNo);
		patientInvoice.setAddress(address);
		patientInvoice.setMedicineName(medicineName);
		patientInvoice.setCostOfMedicine(costOfMedicine);
		patientInvoice.setNoOfItems(no_of_items);
		patientInvoice.setTotalcost(totalcost);
		
   
		invoiceList.add(patientInvoice);
		
	}
	
	return invoiceList;
}
//update method to update patient details
public void updateDetails(PatientInvoice patientInvoice) throws SQLException, Exception {
	
	String update_patient="UPDATE INVOICEDATA SET PATIENTNAME = ?,AGE = ?,GENDER =?,MOBILENO = ?,ADDRESS =?,MEDICINENAME = ?,COSTOFMEDICINE =?,NO_OF_ITEMS=?,TOTALCOST=?  WHERE PATIENTID = ?";
	PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(update_patient);
	ps.setString(1,patientInvoice.getPatientName());
	ps.setInt(2, patientInvoice.getAge());
    ps.setString(3, patientInvoice.getGender());
	ps.setString(4,patientInvoice.getMobileNo());
	ps.setString(5,patientInvoice.getAddress());
	ps.setString(6,patientInvoice.getMedicineName());
	ps.setInt(7,patientInvoice.getCostOfMedicine());
	ps.setInt(8,patientInvoice.getNoOfItems());
	ps.setInt(9,patientInvoice.getTotalcost());
	ps.setInt(10,patientInvoice.getPatientid());
  
   boolean rowUpdated = ps.executeUpdate() > 0;
	if(rowUpdated)
	{
		System.out.println("Updated Patient invoice Details");
	}
	else
	{
		System.out.println("Please check");
	}
}

//Deleting details of the patient
public void deletePatient(int patientid) throws Exception {

	String delete_patient= "DELETE FROM INVOICEDATA WHERE PATIENTID =? ";

	Connection con = ConnectionManager.getConnection();
	PreparedStatement statement = con.prepareStatement(delete_patient);

	statement.setInt(1,patientid);
     int rowDeleted = statement.executeUpdate() ;
     if(rowDeleted!=0) {
			System.out.println("Patient invoice details deleted");
	}
		else {
			System.out.println("No patient with the given id");
		}
	}

//public List<PatientInvoice> getAllDetails() throws SQLException, Exception {
//	// TODO Auto-generated method stub
//	PatientInvoice patientInvoice=new PatientInvoice();
//	String Patient_data ="SELECT * FROM INVOICEDATA";
//	PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(Patient_data );
//	ResultSet rs = ps.executeQuery();
//	
//	while(rs.next()) {
//		int patientid=rs.getInt("patientid");
//	    String patientName=rs.getString("patientName");
//	    int age=rs.getInt("age");
//	    String gender=rs.getString("gender");
//	    String mobileNo=rs.getString("mobileNo");
//		String address=rs.getString("address");
//		String medicineName=rs.getString("medicineName");
//		int costOfMedicine=rs.getInt("costOfMedicine");
//		int no_of_items=rs.getInt("no_of_items");
//		int totalcost=rs.getInt("totalcost");
//
//		
//		patientInvoice.setPatientid(patientid);
//		patientInvoice.setPatientName(patientName);
//		patientInvoice.setAge(age);
//		patientInvoice.setGender(gender);
//		patientInvoice.setMobileNo(mobileNo);
//		patientInvoice.setAddress(address);
//		patientInvoice.setMedicineName(medicineName);
//		patientInvoice.setCostOfMedicine(costOfMedicine);
//		patientInvoice.setNoOfItems(no_of_items);
//		patientInvoice.setTotalcost(totalcost);
//		
//   
//		invoiceList.add(patientInvoice);
//		
//	}
//	
//	return invoiceList;
}











