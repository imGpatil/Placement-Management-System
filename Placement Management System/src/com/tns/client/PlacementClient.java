package com.tns.client;

import com.tns.entities.*;
import java.time.*;
import com.tns.service.*;
public class PlacementClient{		//add update search cancel

	public static void main(String[] args) {
		
		//Debug this program as Debug -> Debug as Java Application 

		PlacementService service = new PlacementServiceImpl();
 	 	Placement placement = new Placement();
 	 	
 	 	 // Add Operation  	 	
 	 	/*placement.setId(103);  	 	
 	 	placement.setName("Trump"); 
 	 	placement.setCollege("IIT");
 	 	placement.setLocalDate("23/09//2022");
 	 	placement.setQualification("Masters");
 	 	placement.setYear(2022);
 	 	service.addPlacement(placement);*/
 	 	
 	 	 // Update Operation
 	 	/*placement = service.searchPlacementById(100);  	 	
 	 	placement.setName("Vladimir Putin"); 
 	 	placement.setCollege("IIT");
 	 	placement.setLocalDate("23/09/2022");
 	 	placement.setQualification("Masters");
 	 	placement.setYear(2022);
 	 	service.updatePlacement(placement);*/
 	 	
 	 	// Search Operation
 	 	placement = service.searchPlacementById(102);
 	 	System.out.println("Id---> "+placement.getId());
 	 	System.out.println("Name---> "+placement.getName());
 	 	System.out.println("College---> "+placement.getCollege());
 	 	System.out.println("Date---> "+placement.getLocalDate());
 	 	System.out.println("Qualification---> "+placement.getQualification());
 	 	System.out.println("Year---> "+placement.getYear());
 	 	
 	 	// Cancel Operation
 	 	/*placement = service.searchPlacementById(103); 	 	
 	 	service.cancelPlacement(103);
 	 	System.out.print("End of program/ Life cycle completed...");*/
 	 	
	}
}
