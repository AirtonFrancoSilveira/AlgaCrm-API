package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.crm.model.Cliente;

//A camada repository é responsavel por interagir com o DB
//A respository é uma classe responsavel por interagir com o db e uma determinada entidade

@Repository //Anotation informa que essa classe é do tipo repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
