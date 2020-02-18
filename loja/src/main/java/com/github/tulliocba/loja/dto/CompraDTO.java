package com.github.tulliocba.loja.dto;

import java.util.Set;

public class CompraDTO {

    private Set<CompraItemDTO> itens;
    private EnderecoDTO endereco;

    public Set<CompraItemDTO> getItens() {
        return itens;
    }

    public void setItens(Set<CompraItemDTO> itens) {
        this.itens = itens;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
