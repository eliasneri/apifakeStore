package com.eliasneri.apifake.controllers;

import com.eliasneri.apifake.apiv1DTO.ProductsDTO;
import com.eliasneri.apifake.business.services.FakeApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Tag(name = "Fake API")
public class FakeApiController {

    private final FakeApiService service;

    @GetMapping("")
    @Operation(summary = "Busca todos os produtos", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Busca Realizada com Sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro ao realizar busca de dados"),
    })
    public ResponseEntity<List<ProductsDTO>> findAllProducts(){
        return ResponseEntity.ok(service.findAllProducts());

    }



}
