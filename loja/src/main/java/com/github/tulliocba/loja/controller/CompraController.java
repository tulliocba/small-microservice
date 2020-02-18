package com.github.tulliocba.loja.controller;

import com.github.tulliocba.loja.dto.CompraDTO;
import com.github.tulliocba.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compraDTO) {
        compraService.realizaCompra(compraDTO);
    }
}
