package com.eliasneri.apifake.infraestructure;

import com.eliasneri.apifake.apiv1DTO.ProductsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiFeight {

    @GetMapping("/products")
    List<ProductsDTO> findAllProducts();
}
