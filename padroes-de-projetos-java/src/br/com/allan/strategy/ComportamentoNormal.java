package br.com.allan.strategy;

public class ComportamentoNormal implements Comportamento{

	@Override
	public void mover() {
		System.out.println("movendo-se normalmente....");
	}

}
