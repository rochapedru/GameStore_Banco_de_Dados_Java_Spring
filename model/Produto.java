package com.generation.gamestore.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto") 

public class Produto {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto  incremento
	private Long id;
	
	@Column(length = 100)
	@NotBlank(message = "O atributo titulo é obrigatório")
	@Size(min = 5, max = 100, message="O atributo titulo deve conter entre 5 e 100 letras")
	private String titulo;
	
	@Column(length = 1000)
	@NotBlank(message = "O atributo descrição é obrigatório")
	@Size(min = 10, max = 1000, message="O atributo descrição deve conter entre 10 e 1000 letras")
	private String texto;
	
	private Double preco;
	
	
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@UpdateTimestamp // 
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	
	
	
	
}
	