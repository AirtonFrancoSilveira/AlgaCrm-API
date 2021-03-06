package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired //Injetando uma inatancia de cliente
	private ClienteRepository clienteRepository; //instanciando clienteRepository
	
	@GetMapping //verbo get
	public List<Cliente> hello() {
		return clienteRepository.findAll();
	}
	
	@PostMapping //verbo post
	@ResponseStatus(HttpStatus.CREATED) //Informando o status code 201 - CREATED
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
