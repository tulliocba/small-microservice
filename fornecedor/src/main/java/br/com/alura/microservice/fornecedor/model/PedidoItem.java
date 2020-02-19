package br.com.alura.microservice.fornecedor.model;

import javax.persistence.*;

@Entity
@Table(name = "pedido_item")
public class PedidoItem {

	@Id
	@GeneratedValue
	private Long id;
	
	private Integer quantidade;
	
	@ManyToOne @JoinColumn(name = "produtoId")
	private Produto produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
