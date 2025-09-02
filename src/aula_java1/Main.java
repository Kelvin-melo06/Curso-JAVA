package aula_java1;

public class Main {
    public static void main(String[] args){
        int resultado = somar(5,7);
    }
    public static int somar(int a ,int b){
        int resultadoConta = a+b;
        System.out.println("O resultado entre " + a + " + " + b + " é de " + resultadoConta);
        return resultadoConta;
    }
}
