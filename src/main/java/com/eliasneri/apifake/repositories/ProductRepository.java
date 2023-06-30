package com.eliasneri.apifake.repositories;

import com.eliasneri.apifake.infraestructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String>  {
}
