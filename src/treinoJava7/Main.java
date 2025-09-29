package treinoJava7;

public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado(
                "Paulo Silva",
                "Gerente financeiro",
                14.400
        );
        e1.imprimirDados();


        Empregado e2 = new Empregado();
        e2.setNomeEmpregado("Ana Silva");
        e2.setCargoEmpregado("Analista de Sistemas");
        e2.setSalarioEmpregado(10.700);
        e2.imprimirDados();

        Empregado.totalEmpregados();
    }
}
