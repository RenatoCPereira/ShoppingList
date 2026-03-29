package com.example.demo.service;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.dto.*;
import com.example.demo.model.entity.Product;
import com.example.demo.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }


    @Override
    @Transactional
    public ProductResponseDTO save(ProductRequestDTO request) {

        Product product = ProductMapper.toEntity(request);
        product = repository.save(product);

        return ProductMapper.toResponse(product);
    }


    @Override
    public List<ProductResponseDTO> findAll() {
        return ProductMapper.toResponseList(repository.findAll());
    }

    @Override
    public ProductResponseDTO findById(Long id) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        return ProductMapper.toResponse(product);
    }


    @Override
    @Transactional
    public ProductResponseDTO update(Long id, ProductUpdateDTO dto) {

        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        ProductMapper.updateEntity(dto, product);

        product = repository.save(product);

        return ProductMapper.toResponse(product);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Produto não encontrado");
        }

        repository.deleteById(id);
    }
}