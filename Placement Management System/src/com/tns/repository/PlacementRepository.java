package com.tns.repository;

import com.tns.entities.Placement;

//Defining a interface PlacementRepository
public interface PlacementRepository {
	
	// Declaring abstract methods
	
	public void addPlacement(Placement placement);
	
	public void updatePlacement(Placement placement);
	
	public  Placement searchPlacementById(long id);
	
	public  Placement cancelPlacementById(long id);
 
	public void commitTransaction(); 
	 
 	public void beginTransaction(); 
 

}
