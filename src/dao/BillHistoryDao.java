//package dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//
//import model.BillHistory;
//import utility.ConnectionManager;
//
//public class BillHistoryDao {
//	
//	public int insertbill(BillHistory bah) throws Exception {
//		Connection cn= ConnectionManager.getConnection();
//		
//		String insert_bill="INSERT INTO BILLHISTORY(billid,patientId,patientName,mobileNo,id,doctorname,doctorspecialization,slot_timings,consultation_fees VALUES(?,?,?,?,?,?,?,?,?)";
//		PreparedStatement ps=ConnectionManager.getConnection().prepareStatement(insert_bill);
//		ps.setInt(1, bah.getBill());
//		ps.setInt(2,bah.getPatientId());
//		ps.setString(3,bah.getPatientName());
//		ps.setString(4,bah.getMobileNo());
//		ps.setInt(5,bah.getDoctorId());
//		ps.setString(6,bah.getDoctorname());
//		ps.setString(7,bah.getDoctorspecialization());
//		ps.setString(8,bah.getSlot_timings());
//		ps.setString(9,bah.getConsultation_fees());
//		int result =ps.executeUpdate();
//		if(result!=0) {
//			System.out.println("inserted successfull");
//		}
//		else {
//			System.out.println("Unsuccessfull ");
//		}
//		return result;
//	}
//
//}
