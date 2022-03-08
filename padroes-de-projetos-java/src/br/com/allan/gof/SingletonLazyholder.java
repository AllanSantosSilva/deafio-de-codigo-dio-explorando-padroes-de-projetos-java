package br.com.allan.gof;

public class SingletonLazyholder {

	private static class InstanceHolder {
		public static SingletonLazyholder instancia = new SingletonLazyholder();
	}

	private SingletonLazyholder() {
		super();
	}

	public static SingletonLazyholder getInstancia() {

		return InstanceHolder.instancia;
	}

}
