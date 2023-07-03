package com.eliasneri.apifake.infraestructure.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "ProductEntity")
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
