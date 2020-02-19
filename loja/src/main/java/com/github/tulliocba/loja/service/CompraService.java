package com.github.tulliocba.loja.service;

import com.github.tulliocba.loja.client.FornecedorClient;
import com.github.tulliocba.loja.dto.CompraDTO;
import com.github.tulliocba.loja.dto.InfoFornecedorDTO;
import com.github.tulliocba.loja.dto.InfoPedidoDTO;
import com.github.tulliocba.loja.model.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient client;

    public Compra realizaCompra(CompraDTO compraDTO) {
        final InfoFornecedorDTO info = client.getInfoPorEstado(compraDTO.getEndereco().getEstado());

        InfoPedidoDTO infoPedidoDTO = client.realizaCompra(compraDTO.getItens());

        Compra compra = new Compra();
        compra.setPedidoId(infoPedidoDTO.getId());
        compra.setTempoDePreparo(infoPedidoDTO.getTempoDePreparo());
        compra.setEnderecoDestino(compraDTO.getEndereco().toString());

        return compra;
    }
}
