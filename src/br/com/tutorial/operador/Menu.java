package br.com.tutorial.operador;

import br.com.tutorial.padroes.facade.Facade;
import br.com.tutorial.padroes.singleton.Singleton;
import br.com.tutorial.padroes.strategy.Strategy;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private void singleton() {
        Singleton singleton = new Singleton();
        singleton.testeSingleton();
    }

    private void strategy() {
        Strategy strategy = new Strategy();
        strategy.testeStrategy();
    }

    private void facade() {
        Facade facade = new Facade();
        facade.testeFacade();
    }

    public void menu(){
        Integer opcao = 0;
        do{
            System.out.println(formatRow("!---------!-------------------------------------#"));
            System.out.println(formatRow("|  Opção  | Descrição                           |"));
            System.out.println(formatRow("$---------*-------------------------------------("));
            System.out.println(formatRow("|    1    | Teste o uso do padrão Singleton     |"));
            System.out.println(formatRow("|    2    | Teste o uso do padrão Strategy      |"));
            System.out.println(formatRow("|    3    | Teste o uso do padrão Facade        |"));
            System.out.println(formatRow("|    0    | Sair                                |"));
            System.out.println(formatRow(")---------+-------------------------------------^"));
            System.out.println("\033[3mDigite o número correspondente a opção desejada:\033[0m");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: singleton(); break;
                case 2: strategy(); break;
                case 3: facade(); break;
                case 0:
                    System.out.println(formatRow("-------------------------------------------------"));
                    System.out.println(formatRow("\033[3m Obrigado por utilizar nosso software, até logo \033[0m"));
                    break;
                default:System.out.printf("Opção inválida;\n");
            }
            System.out.printf("\033[0;1m" +"\n\n\t\t\t\t\t\033[3mPressione ENTER para prosseguir\033[0m");
            scanner.nextLine();

        } while (opcao!=0);
    }

    public static String formatRow(String str) {
        return str
                .replace('|', '\u2502')
                .replace('!', '\u250c')
                .replace('@', '\u252c')
                .replace('#', '\u2510')
                .replace('$', '\u251c')
                .replace('*', '\u253c')
                .replace('(', '\u2524')
                .replace(')', '\u2514')
                .replace('+', '\u2534')
                .replace('^', '\u2518')
                .replace('-', '\u2500');
    }

}