package com.zrtech.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @ApiOperation(value = "Método de Demonstração de Recurso de API - Hello World")
    @ApiResponses(value = {
            @ApiResponse( code = 200, message = "Método retornou com sucesso!!!")
    })
    @GetMapping
    public String hello(){
        return "Hello World  -  BookStore Manager - Agora com PR!!!- teste Postman";
    }
}







