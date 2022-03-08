package br.com.allan.facade;

import br.com.allan.subSistema.cep.CepApi;
import br.com.allan.subSistema.crm.CrmService;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}
}
