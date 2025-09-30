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

        double somaSalario = 0;
        for(Empregado e : empregados){
            somaSalario += e.getSalarioEmpregado();
        }

        double salarioMedio = somaSalario / quantidadeUsuarios;
        System.out.println("Salário médio: " + salarioMedio);


        Empregado maiorSalario = empregados[0];
        for(Empregado e : empregados){
            if(e.getSalarioEmpregado() > maiorSalario.getSalarioEmpregado()){
                maiorSalario = e;
            }
        }

        System.out.println("\n=== Empregado com maior salário ===");
        maiorSalario.imprimirDados();

        System.out.println("\nDigite o codigo de empregado para aumentar o salário: ");
        int codigoEmpregadoAumentoSalario = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o percentual de aumento: ");
        double percentualAumentoSalario = sc.nextDouble();

        for(Empregado e : empregados){
            if(e.getCodigoEmpregado() == codigoEmpregadoAumentoSalario){
                e.setSalarioEmpregado(e.getSalarioEmpregado() * (1 + percentualAumentoSalario/100));
                System.out.println("Novo Salário de " + e.getNomeEmpregado() + ": " + e.getSalarioEmpregado());
                break;
            }
        }

        Empregado.totalEmpregados();
        sc.close();
    }
}
