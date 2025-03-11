package com.flores.v1.Repository;

import org.springframework.data.repository.CrudRepository;

import com.flores.v1.Model.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel,Long> {
    
}
