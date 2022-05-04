package com.tns.repository;

import javax.persistence.*;
import com.tns.entities.*;

public class PlacementRepositoryImpl implements PlacementRepository
{
	
	private EntityManager entityManager; 
	 
 	public PlacementRepositoryImpl() { 
 	 	entityManager = JPAUtil.getEntityManager(); 
 	}

	@Override
	public Placement searchPlacementById(long id) {
		// TODO Auto-generated method stub
		Placement placement = entityManager.find(Placement.class, id);  	
	 	return placement;
	}

	@Override
	public void addPlacement(Placement placement) {
		// TODO Auto-generated method stub
		entityManager.persist(placement);
	}

	@Override
	public void updatePlacement(Placement placement) {
		// TODO Auto-generated method stub
		entityManager.merge(placement);
	}
	
	@Override
	public Placement cancelPlacementById(long id) {
		// TODO Auto-generated method stub
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
		return placement;
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit(); 
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}
 	
}
