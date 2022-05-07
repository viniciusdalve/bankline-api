package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovimentaoTipo;

public class NovaMovimentacao {
	private String descricao;
	private Double valor;
	private MovimentaoTipo tipo;
	private Integer idConta;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentaoTipo tipo) {
		this.tipo = tipo;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	

}
