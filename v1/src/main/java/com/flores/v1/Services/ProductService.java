package com.flores.v1.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flores.v1.Model.ProductModel;

@Service
public interface ProductService {
    ProductModel saveProduct(ProductModel producto);
    List<ProductModel> listAllProduct();
}
