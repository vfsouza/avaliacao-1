package Ex8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {
    public static void teste() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();
        int quant = 0;

        System.out.print("Quantos funcionarios deseja cadastrar? ");
        try {
            quant = sc.nextInt();
        } catch (InputMismatchException eme) {
            System.out.println("Nao foi digitado um valor valido. Apenas numeros sao aceitos.");
            eme.printStackTrace();
        } finally {

        }

        for (int i = 0; i < quant; i++) {
            Funcionario f = new Funcionario();
            double salario;

            System.out.print("Nome do funcionario: ");
            f.setNome(sc.next());
            System.out.print("Salario: ");

            try {
                salario = sc.nextDouble();
            } catch (InputMismatchException eme) {
                System.out.println("Nao foi digitado um valor valido. Apenas numeros sao aceitos.");
                eme.printStackTrace();
                salario = 0F;
            } finally {

            }

            f.setSalario(salario);

            lista.add(f);
        }

        for (Funcionario f : lista) {
            System.out.println(f.toString());
        }
    }
}
