package com.algaworks.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//Anotação do JPA - Uma entidade é mapeado para uma tabela no banco de dados - Realação tabela e Classe
@Entity
@Data //Anotação lambok - Para codigos bolerplate - Getter, Setter e Hashcode
public class Cliente {
	
	@Id //Chave primaria da Classe em relação a Tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Informa que quem vai gerar o valor de ID é o DB
	private Long id;
	
	@Column(nullable = false) //Campo na tabela não pode ser null
	private String nome;
}
