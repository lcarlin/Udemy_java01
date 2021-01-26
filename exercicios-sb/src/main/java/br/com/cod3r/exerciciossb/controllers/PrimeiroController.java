package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	public PrimeiroController() {
		// TODO Auto-generated constructor stub
	}
	
	// @RequestMapping (method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = {"/ola" , "/saudacao"})
	public String ola() {
		return "Olá Spring booty !";		
	}
	
	@PostMapping(path =  "/saudacao" )
	public String digaOla() {
		return "Olá Spring booty - Agora com POST ";		
	}

}
