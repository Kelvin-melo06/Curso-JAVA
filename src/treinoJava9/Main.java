package treinoJava9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayNumeros = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            arrayNumeros[i] = sc.nextInt();
        }

        System.out.println("Digite o numero que voce quer procurar: ");
        int numeroProcurado = sc.nextInt();

        int indice = buscarNumero(arrayNumeros, numeroProcurado);
        if(indice == -1){
            System.out.println("Número " + numeroProcurado + " encontrado com sucesso na posição " + indice + "!");
        } else{
            System.out.println("Número " + numeroProcurado + "Não encontrado!");
        }
        sc.close();
    }
    public static int buscarNumero(int[] arrayNumeros, int numeroProcurado){
        for(int i = 0; i < arrayNumeros.length; i++){
          if(numeroProcurado == arrayNumeros[i]){
              return i;
          }
        }
        return -1;
    }
}

