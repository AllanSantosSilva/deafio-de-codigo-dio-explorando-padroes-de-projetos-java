package br.com.allan.gof;

public class Teste {
	 public static void main(String[] args) {
		// testes relacionados ao design pattern singleton
		 SingletonLazy lazy = SingletonLazy.getInstancia();
		 System.out.println(lazy);
		 lazy = SingletonLazy.getInstancia();
		 System.out.println(lazy);
		 
		 
		 SingletonEager eager = SingletonEager.getInstancia();
		 System.out.println(eager);
		 lazy = SingletonLazy.getInstancia();
		 System.out.println(eager);
		 
		 SingletonLazyholder holder = SingletonLazyholder.getInstancia();
		 System.out.println(holder);
		 lazy = SingletonLazy.getInstancia();
		 System.out.println(holder);
		 
		 
		 // funcionou mesmas instancias retornadas
	}
}
