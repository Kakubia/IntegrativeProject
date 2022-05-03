package com.generation.projetovida.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//Faz o objeto virar uma table no DB
@Entity

//Dá um nome para a tabela no meu banco de dados
@Table (name = "tb_categoria")

public class Categoria {
	//Define a coluna de id como chave primaria
	@Id
	
	//Equivalente ao auto_increment no mysql
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Define que o campo é obrigatorio
	@NotBlank
	@Size(min = 3, max = 100, message = "O campo deve ter no minimo 3 caracteres e no maximo 100 caracteres")
	//aqui terá os produtos que são provenientes de doações
	private String produtos;
	
	@NotBlank
	@Size(min = 3, max = 100, message = "O campo deve ter no minimo 3 caracteres e no maximo 100 caracteres")
	//aqui terão os cursos ofertados pelos voluntários
	private String cursos;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	// Métodos - O método getter retorna o valor do atributo. 
	//O método setter pega um parâmetro e o atribui ao atributo. 
}
