package br.com.cod3r.exerciciossb.models;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path="/qualquer")
	public Cliente obterCliente () {
			return new Cliente (28,"Peter" , "123.456.789-10");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int  id ) {
		return new Cliente(id, "Mary", "987.654.321-00");
	}
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name="id", defaultValue = "111") int  id ) {
		return new Cliente(id, "John August", "111.222.333-44");
	}
	
	
}
