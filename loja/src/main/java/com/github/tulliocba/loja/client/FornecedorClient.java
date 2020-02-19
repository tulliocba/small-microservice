package com.github.tulliocba.loja.client;

import com.github.tulliocba.loja.dto.CompraItemDTO;
import com.github.tulliocba.loja.dto.InfoFornecedorDTO;
import com.github.tulliocba.loja.dto.InfoPedidoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @GetMapping("/infos/{estado}")
    InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

    @PostMapping("/pedido")
    InfoPedidoDTO realizaCompra(Set<CompraItemDTO> itens);
}
