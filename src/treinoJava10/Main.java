package treinoJava10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[12];
        int positivos = 0, negativos = 0, zeros = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " numero: ");
            numeros[i] = sc.nextInt();

            if(numeros[i] > 0) positivos++;
            else if(numeros[i] < 0)negativos++;
            else zeros++;
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zero: " + zeros);
    }
}
