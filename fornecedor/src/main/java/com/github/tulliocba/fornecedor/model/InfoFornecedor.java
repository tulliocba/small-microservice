package com.github.tulliocba.fornecedor.model;

import javax.persistence.*;

@Entity
@Table(name = "info_fornecedor")
public class InfoFornecedor {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String estado;
	
	private String endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
