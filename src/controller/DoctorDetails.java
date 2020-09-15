package controller;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import model.Doctor;

public class DoctorDetails {

	public void GeneralPhyisician() {
		System.out.println("Doctor Details :");
		String doctorname = null;
		String doctorspecialization = null;
		String experienceinyears = null;
		String doctorFees = null;
		Set<String> set=new LinkedHashSet<String>();
		set.add("Ramu");
		set.add("M.D(general medicine)");
		set.add("8+ years of experience");
		set.add("Timings : 3pm-8pm");
		
		Doctor doc=new Doctor();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String display=iterator.next();
			System.out.println(display);
			
		}
		
	}

	public void Dermatologist() {
		
		System.out.println("Doctor Details :");
		String doctorname = null;
		String doctorspecialization = null;
		String experienceinyears = null;
		String doctorFees = null;
		Set<String> set=new LinkedHashSet<String>();
		//storing doctors details
		set.add("Ramesh");
		set.add("Dermatology");
		set.add("15+ years of experience");
		set.add("Timings : 2pm-8pm");
		
		Doctor doc=new Doctor();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String display=iterator.next();
			System.out.println(display);
			
		}
		
	}

	public void Gynaecologist() {
	
		System.out.println("Doctor Details :");
		String doctorname = null;
		String doctorspecialization = null;
		String experienceinyears = null;
		String doctorFees = null;
		Set<String> set=new LinkedHashSet<String>();
		set.add("Goswami");
		set.add("Gynaecology & Obstetricis");
		set.add("25+ years of experience");
		set.add("Timings : 11am-6pm");
		
		Doctor doc=new Doctor();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String display=iterator.next();
			System.out.println(display);
			
		}
	}

	public void Paediatrician() {
		
		System.out.println("Doctor Details :");
		String doctorname = null;
		String doctorspecialization = null;
		String experienceinyears = null;
		String doctorFees = null;
		Set<String> set=new LinkedHashSet<String>();
		set.add("Aruna");
		set.add("Paediatrics");
		set.add("5+ years of experience");
		set.add("Timings : 3pm-8pm");
		
		Doctor doc=new Doctor();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String display=iterator.next();
			System.out.println(display);
			
		}
	}
	}

	

