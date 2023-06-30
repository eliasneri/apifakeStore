package com.eliasneri.apifake.business.services;

import com.eliasneri.apifake.apiv1DTO.ProductsDTO;
import com.eliasneri.apifake.infraestructure.entities.ProductEntity;
import com.eliasneri.apifake.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public ProductEntity saveProducts (ProductEntity entity) {
      try {
          return repository.save(entity);
        } catch (Exception e) {
          throw new RuntimeException("Erro ao Salvar Produto! " + e);
        }
    }

    public List<ProductEntity> findAllProducts(){
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar products! " + e);
        }
    }
}
