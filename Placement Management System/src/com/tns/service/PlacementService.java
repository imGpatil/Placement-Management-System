package com.tns.service;

import com.tns.entities.*;

//Defining a interface PlacementService
public interface PlacementService {

	// Declaring abstract methods
	
	public abstract void addPlacement(Placement placement); 
	 
 	public abstract void updatePlacement(Placement placement); 
 
 	public abstract Placement searchPlacementById(long id);
 	
 	public abstract void cancelPlacement(long id); 
}
