package treinoJava14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz3x3 = new int[3][3];

        // 1️⃣ Leitura da matriz
        for(int linha = 0; linha < 3; linha++){
            System.out.println("Digite os números da linha " + (linha + 1) + ":");
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Número " + (coluna + 1) + ": ");
                matriz3x3[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println("\n2️⃣ Matriz 3x3:");
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print(matriz3x3[linha][coluna] + "\t"); // print na mesma linha
            }
            System.out.println(); // quebra de linha no final da linha
        }

        // 3️⃣ Soma de cada linha
        System.out.println("\n3️⃣ Soma das linhas:");
        for(int linha = 0; linha < 3; linha++){
            int somaLinha = 0;
            for(int coluna = 0; coluna < 3; coluna++){
                somaLinha += matriz3x3[linha][coluna];
            }
            System.out.println("Linha " + (linha + 1) + ": " + somaLinha);
        }

        // 4️⃣ Soma de cada coluna
        System.out.println("\n4️⃣ Soma das colunas:");
        for(int coluna = 0; coluna < 3; coluna++){
            int somaColuna = 0;
            for(int linha = 0; linha < 3; linha++){
                somaColuna += matriz3x3[linha][coluna];
            }
            System.out.println("Coluna " + (coluna + 1) + ": " + somaColuna);
        }
    }
}
