package br.com.tutorial.padroes.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

}