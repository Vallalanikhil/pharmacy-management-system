package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.PatientInvoiceDao;
import model.PatientInvoice;
import service.CostofMedicines;
import utility.ValidateUser;

public class HomePage {
	Scanner sc=new Scanner(System.in);
	public void main() throws Exception {
		boolean flag;
		do {
		System.out.println("******************* Enter the patient choice *************************  "
		+"\n"+"1.Medicines"+"\n"+"2.Ask Doctor "+"\n"+"3.Patient data & invoice");
		int choice=sc.nextInt();
	    flag=true;
		{
		switch(choice) {
		case 1:
			//choosing medicines
		{
			System.out.println("******************* Choose Medicines  ******************************* "
		+"\n"+"1.coronaviruspreventionkit "+"\n"+"2.coughandcold"+"\n"+"3.diabetes"
		+"\n"+"4.immunityboosters"+"\n"+"5.skincare"+"\n"+"6.paediatric"+"\n"+"7.Antibiotics");
          int pick=sc.nextInt();
          CostofMedicines Rs=new CostofMedicines();
          //Nested switch
          switch(pick) {
          //choosing of medicines
          case 1:
        		Rs.coronaviruspreventionkit();
        		break;
          case 2:
        	  Rs.coughandcold();
        	  break;
          case 3:
        	  Rs.diabetes();
        	  break;
          case 4 :
        	  Rs.immunityboosters();
        	  break;
          case 5:
        	  Rs.skincare();
        	  break;
          case 6:
        	  Rs.paediatric();
        	  break;
          case 7:
        	  Rs.Antibiotics();
        	  break;
          }
 		
		}
		break;
				
		
	case 2 :
		//Doctor's appointment
			System.out.println("-----------------------Display Doctors-----------------------------"+ "\n");
			System.out.println("1.GeneralPhyisician"+"\n"+"2.Dermatologist"+ "\n"+"3.Gynaecologist"+"\n"+"4.Paediatrician");
			 int opt=sc.nextInt();
			 DoctorDetails dd=new DoctorDetails();
			 switch(opt) {
			 case 1:{
				 dd.GeneralPhyisician();
				 System.out.println("CONSULTATION FEE : 100");
			 }break;
			 case 2:{
				 dd.Dermatologist();
				 System.out.println("CONSULTATION FEE : 300");
			 }
			 break;
			 case 3:{
				 dd.Gynaecologist();
				 System.out.println("CONSULTATION FEE : 400");
			 }break;
			 case 4:
			 {
				 dd.Paediatrician();
				 System.out.println("CONSULTATION FEE : 200");
			 }
			 break;
				 
			 }
		case 3:{
      //	patient membership details
			
			System.out.println("\n");
			System.out.println("********************Enter the patient choice :**********************************"+
			"\n"+"1.Add"+"\n"+"2.Invoice "+"\n"+"3.Update"+"\n"+"4.Delete");
			int option=sc.nextInt();
			PatientInvoice patientInvoice=new PatientInvoice();
			PatientInvoiceDao patdao=new PatientInvoiceDao();
			
			List<PatientInvoice> invoiceList = new ArrayList<PatientInvoice>();
			
			ValidateUser vs= new ValidateUser();
			switch(option) {
			case 1:
				boolean result;
				System.out.println("------------------- Add --------------------"+ "\n");
				System.out.println("********** New Patient Details: ****************");
				System.out.println("\n");
				System.out.println("Enter patient Id :");
				int patid=sc.nextInt();
				System.out.println("Enter Patient's Name :");
				String patientName=sc.next();
				result = vs.isValidUsername(patientName);
				if(result==true) {
					System.out.println("Validations Successful");
				}
				else {
					System.out.println("please check the given details");
					break;
				}
				System.out.println("Enter age :");
			     int age=sc.nextInt();
			 	System.out.println("Enter Gender:");
			     String gender=sc.next();
				System.out.println("Enter Mobile no :");
				String mobileNo=sc.next();
				vs.validmobileNo(mobileNo);
				System.out.println("Enter address :");
				String address=sc.next();
			    System.out.println("Enter Medicine Name :");
	            String medicine_Name=sc.next();
	            System.out.println("Enter Cost of Medicines :");
	            int cost_of_medicines=sc.nextInt();
	            System.out.println("Enter no of items :");
	            int no_of_items=sc.nextInt();
                System.out.println("Enter Total cost ");
                int total_cost=sc.nextInt();
				
				patientInvoice.setPatientid(patid);
				patientInvoice.setPatientName(patientName);
				patientInvoice.setAge(age);
				patientInvoice.setGender(gender);
				patientInvoice.setMobileNo(mobileNo);
				patientInvoice.setAddress(address);
			    patientInvoice.setMedicineName(medicine_Name);
	            patientInvoice.setCostOfMedicine(cost_of_medicines);
	            patientInvoice.setNoOfItems(no_of_items);
	            patientInvoice.setTotalcost(total_cost);
				int result1=patdao.insertPatient(patientInvoice);
				if(result1!=0) {
					System.out.println("insert successfull");
					
				}
				else
				{
					System.out.println("invalid");
					break;
				}
			break;
			case 2:
				System.out.println("-------------------- VIEW INVOICE --------------------");
				System.out.println();
				
				invoiceList = patdao.getAllDetails();
				
				if(invoiceList!=null) {
                for(PatientInvoice pats:invoiceList) {
               	System.out.println("Patient Id :" +pats.getPatientid() +"   " +"patient Name :"+ pats.getPatientName() + "  " +"patient Age :"+
                pats.getAge() + "  " +"Patient Gender:" +pats.getGender()+ "  " +"Patient MobileNo:"+ pats.getMobileNo() + "  " + "Patient Address :" +
               	pats.getAddress() + "  " +" MedicineName :" + pats.getMedicineName() + "  " +"CostOfMedicines : " + pats.getCostOfMedicine() + "  " +
               "NoOfItems : "+ pats.getNoOfItems() + "   " + "Total Cost :"+pats.getTotalcost());
               	
               	System.out.println("");
               	
                  System.out.println(" !!!!!!!!!!!!!!Thank You Happy Shopping!!!!!!!!!!!!!!!!!!!!!");
                }
                
				}
				else
				{
					System.out.println("Details Doesn't Exit");
				}
				
				break;
			case 3:
				//update doctor details
				System.out.println("-----------------UPADTE---------------");
		        System.out.println("Enter Patient Id :");
		        int patient_id=Integer.parseInt(sc.next());
			   System.out.println("Enter patient Name :");
			   String patient_name=sc.next();
			   System.out.println("Enter age :");
			    int patient_age=Integer.parseInt(sc.next());
			    System.out.println("Enter Gender :");
			    String Gender=sc.next();
			   System.out.println("Enter Mobile no :");
		    	String patient_mobileNo=sc.next();
		    	System.out.println("Enter Address :");
		    	String Address=sc.next();
               System.out.println("Enter Medicine Name :");
               String medicineName=sc.next();
               System.out.println("Enter Cost of Medicines :");
               int costofmedicines=Integer.parseInt(sc.next());
               System.out.println("Enter no of items :");
               int noofitems=Integer.parseInt(sc.next());
               System.out.println("Enter Total cost ");
               int totalcost=Integer.parseInt(sc.next());
				
			   patientInvoice.setPatientName(patient_name);
			   patientInvoice.setAge(patient_age);
			   patientInvoice.setGender(Gender);
			   patientInvoice.setMobileNo(patient_mobileNo);
			   patientInvoice.setAddress(Address);
               patientInvoice.setMedicineName(medicineName);
               patientInvoice.setCostOfMedicine(costofmedicines);
               patientInvoice.setNoOfItems(noofitems);
               patientInvoice.setTotalcost(totalcost);
               
			   patdao.updateDetails(patientInvoice);
			   
			   break;
			   
			   
			case 4:{
				//deleteing patient details
				System.out.println("-------------------Delete Details --------------------");
				System.out.println("Enter Id :");
				int patientid=sc.nextInt();
				patdao.deletePatient(patientid);
			}
				break;
			}
	
			}
//		case 4:
//			//Billing
//			System.out.println("Billing :");
//			
//			System.out.println("Enter bill id :");
//			int billid=sc.nextInt();
//			System.out.println("Enter patient id :");
//			int patientId=sc.nextInt();
//			System.out.println("Enter Doctor id ");
//			int doctorid=sc.nextInt();
//			DoctorDao dd=new DoctorDao();
//			dd.Doctordetails(doctorid);
//			Doctor dc=new Doctor();
//			
//			String doctorname=dc.getDoctorname();
//			String doctorspecialization=dc.getDoctorspecialization();
//			String slot_timings=dc.getslot_timings();
//			String consultation_fees=dc.getConsultation_fees();
//			
//			PatientInvoice pti=new PatientInvoice();
//			String patientName =pti.getPatientName();
//			String mobileNo= pti.getMobileNo();
//		 
//			
//			BillHistory bh=new BillHistory();
//			bh.setBillid(billid);
//			bh.setPatientId(patientId);
//			bh.setPatientName(patientName);
//			bh.setMobileNo(mobileNo);
//			bh.setId(doctorid);
//			bh.setDoctorname(doctorname);
//			bh.setDoctorspecialization(doctorspecialization);
//			bh.setSlot_timings(slot_timings);
//			bh.setConsultation_fees(consultation_fees);
//			
//			
//		System.out.println(bh.getBill());
//		System.out.println(bh.getPatientId());
//		System.out.println(bh.getPatientName());
//		System.out.println(bh.getMobileNo());
//		System.out.println(bh.getDoctorId());
//		System.out.println(bh.getDoctorname());
//		System.out.println(bh.getDoctorspecialization());
//		System.out.println(bh.getSlot_timings());
//		System.out.println(bh.getConsultation_fees());
//		
			 }
	 
	}
		
		
}
while(flag);
		}
		}
	