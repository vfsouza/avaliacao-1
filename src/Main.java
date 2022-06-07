import Ex6.Ex6;
import Ex7.Ex7;
import Ex8.Ex8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        // Roda o código até o usuário digitar a opção para sair (0).
        while(true) {
            System.out.println("\n6 - Exercicio 6 (Jogo de perguntas e respostas)");
            System.out.println("7 - Exercicio 7 (Login no sistema)");
            System.out.println("8 - Exercicio 8 (Bonificacao de funcionarios)");
            System.out.println("0 - Sair");
            System.out.print("Qual exercicio deseja testar? ");

            try {
                op = sc.nextInt();
            } catch (InputMismatchException eme) {
                System.out.println("\nNao foi digitado um valor valido. Apenas numeros sao aceitos.\n");
                sc = new Scanner(System.in);
            }

            switch (op) {
                case 6 -> Ex6.teste();
                case 7 -> Ex7.teste();
                case 8 -> Ex8.teste();
                case 0 -> {
                    System.out.println("\nFinalizando programa...\n");
                    return;
                }
                default -> System.out.println("Opcao invalida!");
            }
        }
    }
}