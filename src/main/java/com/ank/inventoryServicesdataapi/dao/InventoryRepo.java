package com.ank.inventoryServicesdataapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ank.inventoryServicesdataapi.dao.repo.CompanyRepo;
import com.ank.inventoryServicesdataapi.dao.repo.ProductRepo;
import com.ank.inventoryServicesdataapi.dao.repo.SubProductRepo;

@Service
public class InventoryRepo {

	@Autowired
	private CompanyRepo compRepo;
	@Autowired
	private ProductRepo prodRepo;
	@Autowired
	private SubProductRepo subProdRepo;
	
	
	
	
	
	
	
}
