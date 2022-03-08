package br.com.allan.strategy;

public class Teste {
	
	public static void main(String[] args) {
		
		Comportamento normal = new  ComportamentoNormal();
		Comportamento defensivo = new  ComportamentoDefensivo();
		Comportamento agresivo = new  ComportamentoAgresivamente();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agresivo);
		robo.mover();
		robo.mover();
	}

}
