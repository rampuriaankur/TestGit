package com.ank.inventoryServicesdataapi.dao.repo;

import org.springframework.data.repository.CrudRepository;

import com.ank.inventoryServicesdataapi.model.Product;

public interface ProductRepo  extends CrudRepository<Product,Integer>{ 

}
