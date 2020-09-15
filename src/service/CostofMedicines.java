package service;

import java.util.Scanner;

public class CostofMedicines {
	Scanner cs=new Scanner(System.in);
	 public boolean coronaviruspreventionkit() {
		 int Cost_of_item=300;
		 System.out.println("Enter no of kits : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
	 
		 
		return true; 
	 }
	public void coughandcold() {
		 int Cost_of_item=100;
		 System.out.println("Enter no of Strips : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
		
	}
	public void diabetes() {
		
		 int Cost_of_item=500;
		 System.out.println("Enter no of Strips : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
	}
	public void immunityboosters() {
		 int Cost_of_item=400;
		 System.out.println("Enter no of Strips : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
		
	}
	public void skincare() {
		 int Cost_of_item=300;
		 System.out.println("Enter no of Creams : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
		
	}
	public void paediatric() {
		 int Cost_of_item=200;
		 System.out.println("Enter no of Syrups : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
		
	}
	public void Antibiotics() {
		
		 int Cost_of_item=200;
		 System.out.println("Enter no of Strips : ");
		 int wanted_items=cs.nextInt();
		 int Cost=Cost_of_item*wanted_items;
		 
		 System.out.println("Total Cost :"+Cost);
	}	 

}
