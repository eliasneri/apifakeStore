package com.eliasneri.apifake.business.converter;

import com.eliasneri.apifake.apiv1DTO.ProductsDTO;
import com.eliasneri.apifake.infraestructure.entities.ProductEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class ProductConverter {

    public ProductEntity toEntity (ProductsDTO dto){
        return ProductEntity.builder()
                .id(String.valueOf(UUID.randomUUID()))
                .title(dto.getTitle())
                .category(dto.getCategory())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .image(dto.getImage())
                .dateInsert(LocalDateTime.now())
                .build();
    }

    public ProductsDTO toDTO (ProductEntity entity){
        return ProductsDTO.builder()
                .idEntity(entity.getId())
                .title(entity.getTitle())
                .category(entity.getCategory())
                .description(entity.getDescription())
                .image(entity.getImage())
                .build();
    }

    public List<ProductsDTO> toListDTO (List<ProductEntity> entityList) {
        return entityList.stream().map(this::toDTO).toList();
    }
}
