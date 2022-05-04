package com.tns.service;

import com.tns.repository.*;
import com.tns.entities.*;

public class PlacementServiceImpl implements PlacementService  {

	private PlacementRepository repository; 
	 
 	public PlacementServiceImpl()  
         { 
 	 	repository = new PlacementRepositoryImpl(); 
         }

	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		repository.beginTransaction();  	
		repository.addPlacement(placement);  	
		repository.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		repository.beginTransaction();  	
		repository.updatePlacement(placement);  	
		repository.commitTransaction();
	}

	@Override
	public void cancelPlacement(long id) {
		// TODO Auto-generated method stub
		repository.beginTransaction();  	
		repository.cancelPlacementById(id);  	
		repository.commitTransaction();
	}
	
	//no need of transaction, as it's an read operation
	@Override
	public Placement searchPlacementById(long id) {
		// TODO Auto-generated method stub
		Placement placement  = repository.searchPlacementById(id);  	
 		return placement; 
	}
 	
}
