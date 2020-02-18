package com.github.tulliocba.loja.client;

import com.github.tulliocba.loja.dto.InfoFornecedorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @GetMapping("/infos/{estado}")
    InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);

}
