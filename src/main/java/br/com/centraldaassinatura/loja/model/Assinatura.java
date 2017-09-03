package br.com.centraldaassinatura.loja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Assinatura {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String titulo;
	@Lob//@Lob diz q esse campo pode ter um valor grande de texto
	private String descricao;
	private Double preco;
	private String dataValidade;
	private String dataAnuncio;
	
	public Assinatura(){
		
	}

	public Assinatura(String titulo, String descricao, Double preco, String dataValidade, String dataAnuncio) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.dataAnuncio = dataAnuncio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getDataAnuncio() {
		return dataAnuncio;
	}

	public void setDataAnuncio(String dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", dataValidade="
				+ dataValidade + ", dataAnuncio=" + dataAnuncio;
	}

}
