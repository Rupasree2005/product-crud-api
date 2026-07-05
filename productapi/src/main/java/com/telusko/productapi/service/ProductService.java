package com.telusko.productapi.service;

import com.telusko.productapi.dto.ProductRequestDTO;
import com.telusko.productapi.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {

    ProductResponseDTO createProduct(ProductRequestDTO requestDTO);

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getProductById(Long id);

    ProductResponseDTO updateProduct(Long id, ProductRequestDTO requestDTO);

    void deleteProduct(Long id);

}