package com.faculdadedelta.modelo;

import java.util.Date;

public class PedidoItens {
	
	private Produto produto;
	
	int quantidade;
	Date dataInicioLocacao;
	Date dataDevolucao;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataInicioLocacao() {
		return dataInicioLocacao;
	}

	public void setDataInicioLocacao(Date dataInicioLocacao) {
		this.dataInicioLocacao = dataInicioLocacao;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
	
	
	

}
