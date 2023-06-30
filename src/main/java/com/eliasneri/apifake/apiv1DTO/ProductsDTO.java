package com.eliasneri.apifake.apiv1DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ProductsDTO {

    private Long id;
    private String idEntity;
    private String title;
    private BigDecimal price;
    private String category;
    private String description;
    private String image;
}
