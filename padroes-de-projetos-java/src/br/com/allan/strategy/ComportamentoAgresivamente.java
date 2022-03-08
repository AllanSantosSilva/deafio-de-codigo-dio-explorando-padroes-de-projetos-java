package br.com.allan.strategy;

public class ComportamentoAgresivamente implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se agresivamente....");
	}

}
