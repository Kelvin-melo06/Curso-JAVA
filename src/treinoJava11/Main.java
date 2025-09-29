package treinoJava11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] numerosTabuada = new float[10];

        System.out.println("Digite o numero da tabuada que deseja: ");
        int numeroPedidoTabuada = sc.nextInt();

        for(int i = 0; i < numerosTabuada.length; i++){
            numerosTabuada[i] = numeroPedidoTabuada * (i + 1);
        }

        System.out.println("\nTabuada do " + numeroPedidoTabuada);

        for(int i = 0; i < numerosTabuada.length; i++){
            System.out.println(numeroPedidoTabuada + " x " + (i+1) + " = " + numerosTabuada[i]);
        }
    }
}
