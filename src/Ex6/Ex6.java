package Ex6;

import java.util.*;

public class Ex6 {
    private static final ArrayList<String> perguntas = new ArrayList<>();
    private static final ArrayList<String> respostas = new ArrayList<>();

    /**
     * Teste da atividade prática 6.
     */
    public static void teste() {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        int quant = 0;

        System.out.print("Digite seu nome: ");
        user.setUserName(sc.nextLine());

        System.out.print("Quantas perguntas deseja cadastrar? ");
        try {
            quant = sc.nextInt();
        } catch (InputMismatchException eme) {
            System.out.println("Nao foi digitado um valor valido. Apenas numeros sao aceitos.");
            sc = new Scanner(System.in);
        }

        System.out.println("CADASTRO DE PERGUNTAS\n");
        sc = new Scanner(System.in);

        // Loop para cadastro de perguntas.
        for (int i = 0; i < quant; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            perguntas.add(sc.nextLine());
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas.add(sc.nextLine());
        }

        // Loop para responder as perguntas.
        for (int i = 0; i < quant; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            System.out.println(perguntas.get(i));
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();
            if (resposta.equals(respostas.get(i))) {
                user.setAcertos(user.getAcertos() + 1);
            } else {
                user.setErros(user.getErros() + 1);
            }
        }
        System.out.println("\n" + user);
    }
}
