package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.logger;

public class CalculadoraImp {
	private String id = "abc";
	
	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	public double soma(double... nums) {
		logger.info("Somando ... .. . ");
		return opArit.soma(nums);
	}
	
	public String getId() {
		return id;
	}
	


}
