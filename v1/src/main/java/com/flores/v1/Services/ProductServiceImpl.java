package com.flores.v1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flores.v1.Model.ProductModel;
import com.flores.v1.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductModel saveProduct(ProductModel producto) {
       return productRepository.save(producto);

    }

    @Override
    public List<ProductModel> listAllProduct() {
       return (List<ProductModel>) productRepository.findAll();
    }
    
}
