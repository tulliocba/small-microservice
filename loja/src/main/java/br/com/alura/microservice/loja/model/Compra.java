package br.com.alura.microservice.loja.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "compra")
public class Compra {

	@Id
	@GeneratedValue
	private Long id;
	
	private Long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;
	
	private LocalDate dataParaEntrega;
	
	private Long voucher;
	
	@Enumerated(EnumType.STRING)
	private CompraState state;

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public LocalDate getDataParaEntrega() {
		return dataParaEntrega;
	}

	public void setDataParaEntrega(LocalDate dataParaEntrega) {
		this.dataParaEntrega = dataParaEntrega;
	}

	public Long getVoucher() {
		return voucher;
	}

	public void setVoucher(Long voucher) {
		this.voucher = voucher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompraState getState() {
		return state;
	}

	public void setState(CompraState state) {
		this.state = state;
	}
	
}
