package com.eliasneri.apifake.business.services;

import com.eliasneri.apifake.apiv1DTO.ProductsDTO;
import com.eliasneri.apifake.business.converter.ProductConverter;
import com.eliasneri.apifake.infraestructure.FakeApiFeight;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiFeight products;
    private final ProductConverter converter;
    private final ProductService service;

    public List<ProductsDTO> findAllProducts(){
        List<ProductsDTO> dto = products.findAllProducts();
        dto.forEach(
                product -> {service.saveProducts(converter.toEntity(product)); }
        );
        return converter.toListDTO(service.findAllProducts());
    }
}
