package br.com.tutorial.padroes.facade;

import br.com.tutorial.subsistemas.ss1.CrmService;
import br.com.tutorial.subsistemas.ss2.CepApi;

public class Facade {

    public void testeFacade(){
        System.out.printf("Exemplo de uso do padrão Facade\n");
        this.migrarCliente("Venilton", "14801788");
    }

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

