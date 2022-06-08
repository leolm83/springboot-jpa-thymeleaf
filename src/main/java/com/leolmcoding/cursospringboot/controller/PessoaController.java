package com.leolmcoding.cursospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pessoa")
public class PessoaController {
	
	@GetMapping(value="/cadastrarpessoa")
	public String inicio() {
		return "cadastro/cadastrarpesssoa";
	}
}
