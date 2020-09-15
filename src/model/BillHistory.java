package model;

public class BillHistory {
	private int billid;
	private int patientId;
	private String patientName;
	private String mobileNo;
	private int doctorid;
	private String doctorname;
	private String doctorspecialization;
	private String slot_timings;
	private String consultation_fees;
	
	
	public int getBill() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getDoctorId() {
		return doctorid;
	}
	public void setId(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDoctorspecialization() {
		return doctorspecialization;
	}
	public void setDoctorspecialization(String doctorspecialization) {
		this.doctorspecialization = doctorspecialization;
	}
	public String getSlot_timings() {
		return slot_timings;
	}
	public void setSlot_timings(String slot_timings) {
		this.slot_timings = slot_timings;
	}
	public String getConsultation_fees() {
		return consultation_fees;
	}
	public void setConsultation_fees(String consultation_fees) {
		this.consultation_fees = consultation_fees;
	}
	
	

}
