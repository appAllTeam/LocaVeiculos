package com.faculdadedelta.modelo;

public class Produto {
	
	long id;
	String modelo;
	String tipo;
	String cor;
	double valorDiaria;
	
	
	public Produto(long id, String modelo, String tipo, String cor, double valorDiaria) {
		this.id = id;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	
	
	
	
}
