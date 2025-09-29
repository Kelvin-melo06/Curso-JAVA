package treinoJava8;

import treinoJava7.Empregado;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos usuarios voce quer cadastrar? ");
        int quantidadeUsuarios = sc.nextInt();
        sc.nextLine();

        Empregado[] empregados = new Empregado[quantidadeUsuarios];

        for(int i = 0; i < quantidadeUsuarios; i++){
            System.out.println("\nCadastro de empregado:  ");

            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o cargo: ");
            String cargo = sc.nextLine();

            System.out.println("Digite o salario: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            empregados[i] = new Empregado(nome, cargo, salario);
        }

        System.out.println("\n=== Dados dos empregados: ===");
        for(Empregado e : empregados){
            e.imprimirDados();
            System.out.println("--------------------");
        }

        Empregado.totalEmpregados();
        sc.close();
    }
}
