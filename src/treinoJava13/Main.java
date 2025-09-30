package treinoJava13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int segundoMaiorNumero = Integer.MIN_VALUE;
        int maiorNumero = Integer.MIN_VALUE;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " numero: ");
            numeros[i] = sc.nextInt();


            if(numeros[i] > maiorNumero){
                segundoMaiorNumero = maiorNumero;
                maiorNumero = numeros[i];
            } else if(numeros[i] > segundoMaiorNumero){
                segundoMaiorNumero = numeros[i];
            }
        }

    System.out.println("O maior número é: " + maiorNumero);
    System.out.println("O segundo maior número é: " + segundoMaiorNumero);    }
}
