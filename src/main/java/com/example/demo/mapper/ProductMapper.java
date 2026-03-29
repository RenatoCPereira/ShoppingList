package com.example.demo.mapper;

import com.example.demo.model.dto.ProductRequestDTO;
import com.example.demo.model.dto.ProductResponseDTO;
import com.example.demo.model.dto.ProductUpdateDTO;
import com.example.demo.model.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {


    private ProductMapper() {}


    public static Product toEntity(ProductRequestDTO request) {
        if (request == null) {
            return null;
        }

        return Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .quantity(request.getQuantity())
                .build();
    }


    public static ProductResponseDTO toResponse(Product product) {
        if (product == null) {
            return null;
        }

        return ProductResponseDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
    }


    public static List<ProductResponseDTO> toResponseList(List<Product> products) {
        return products.stream()
                .map(ProductMapper::toResponse)
                .collect(Collectors.toList());
    }


    public static void updateEntity(ProductUpdateDTO dto, Product product) {

        if (dto == null || product == null) {
            return;
        }

        if (dto.getName() != null) {
            product.setName(dto.getName());
        }

        if (dto.getPrice() != null) {
            product.setPrice(dto.getPrice());
        }

        if (dto.getQuantity() != null) {
            product.setQuantity(dto.getQuantity());
        }
    }
}