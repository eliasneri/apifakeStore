package com.eliasneri.apifake.infraestructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ProductEntity")
@Table(name = "products")
@Getter
@Setter
@RequiredArgsConstructor
@Builder

public class ProductEntity {

    @Id
    @Column(name = "id")
    private String id;
    private String title;
    private BigDecimal price;
    private String category;
    private String description;
    private String image;
    private LocalDateTime dateInsert;

}
