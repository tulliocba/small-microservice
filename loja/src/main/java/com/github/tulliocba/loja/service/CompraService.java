package com.github.tulliocba.loja.service;

import com.github.tulliocba.loja.client.FornecedorClient;
import com.github.tulliocba.loja.dto.CompraDTO;
import com.github.tulliocba.loja.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient client;

    public void realizaCompra(CompraDTO compraDTO) {
        final InfoFornecedorDTO info = client.getInfoPorEstado(compraDTO.getEndereco().getEstado());

        System.out.println(info.getEndereco());
    }
}
