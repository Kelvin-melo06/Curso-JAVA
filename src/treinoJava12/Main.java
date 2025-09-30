package treinoJava12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] notasAlunos = new float[5][3];

        // Entrada das notas
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                // Substitui vírgula por ponto e converte para float
                notasAlunos[i][j] = Float.parseFloat(sc.next().replace(',', '.'));
            }
        }

        System.out.println("\n=== Resultados ===");

        // Cálculo das médias e situação
        for (int i = 0; i < 5; i++) {
            float soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notasAlunos[i][j];
            }
            float media = soma / 3;

            String situacao = (media >= 6) ? "✅ Aprovado" : "❌ Reprovado";
            System.out.println("Aluno " + (i + 1) + " - Média: " + media + " - " + situacao);
        }
        sc.close();
    }
}
