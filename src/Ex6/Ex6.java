package Ex6;

import java.util.*;

public class Ex6 {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<String> perguntas = new ArrayList<>();
    private static final ArrayList<String> respostas = new ArrayList<>();

    public static void teste() {
        Usuario user = new Usuario();

        System.out.print("Digite seu nome: ");
        user.setUserName(sc.nextLine());

        System.out.println("CADASTRO DE PERGUNTAS\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Pergunta " + (i + 1) + ": ");
            perguntas.add(sc.nextLine());
            System.out.print("Resposta " + (i + 1) + ": ");
            respostas.add(sc.nextLine());
        }

        for (int i = 0; i < 10; i++) {
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
