package Ex7;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
    private static final ArrayList<Usuario> users = new ArrayList<>();

    public static void teste() {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {
            System.out.println("\n1 - Cadastrar novo usuario.");
            System.out.println("2 - Fazer login.");
            System.out.println("0 - Sair");
            System.out.print("O que voce deseja? ");

            try {
                op = sc.nextInt();
            } catch (InputMismatchException eme) {
                System.out.println("Nao foi digitado um valor valido. Apenas numeros sao aceitos.");
                sc = new Scanner(System.in);
            }

            switch (op) {
                case 1:
                    if (cadastro()) {
                        System.out.println("Usuario cadastrado com sucesso!");
                    } else {
                        System.out.println("Algo deu errado. Tente novamente...");
                    }
                    break;

                case 2:
                    int time = Integer.parseInt(Date.from(Instant.now()).getHours() + "" + Date.from(Instant.now()).getMinutes());
                    boolean resp = login();
                    if (resp) {
                        if (time < 599) {
                            System.out.println("\nBoa madrugada, voce se logou ao nosso sistema.");
                        } else if (time < 1159) {
                            System.out.println("\nBom dia, voce se logou ao nosso sistema.");
                        } else if (time < 1759) {
                            System.out.println("\nBoa tarde, voce se logou ao nosso sistema.");
                        } else {
                            System.out.println("\nBoa noite, voce se logou ao nosso sistema.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nSaindo...\n");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    private static boolean login() {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();
        boolean resp = false;

        System.out.print("Nome de usuario: ");
        user.setUserName(sc.nextLine());
        System.out.print("Senha: ");
        user.setSenha(sc.nextLine());

        for (Usuario usuario : users) {
            resp = usuario.getUserName().equals(user.getUserName()) && usuario.getSenha().equals(user.getSenha());
        }
        return resp;
    }

    private static boolean cadastro() {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();

        System.out.println("\nCADASTRO DE USUARIO");
        System.out.print("Nome de usuario: ");
        user.setUserName(sc.nextLine());
        System.out.print("Senha: ");
        user.setSenha(sc.nextLine());

        System.out.print("Repita a senha: ");
        if (user.getSenha().equals(sc.nextLine())) {
            users.add(user);
            return true;
        } else {
            System.out.println("As senha nao sao iguais!");
            return false;
        }
    }
}
