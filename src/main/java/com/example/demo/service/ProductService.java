package com.example.demo.service;

import com.example.demo.model.dto.*;

import java.util.List;

public interface ProductService {

    ProductResponseDTO save(ProductRequestDTO request);

    List<ProductResponseDTO> findAll();

    ProductResponseDTO findById(Long id);

    ProductResponseDTO update(Long id, ProductUpdateDTO dto);

    void delete(Long id);
}