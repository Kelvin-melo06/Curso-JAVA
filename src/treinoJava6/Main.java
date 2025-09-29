package treinoJava6;

public class Main {
    public static void main(String[] args)
    {
    /*
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa(
                "Kelvin",
                "Rua tal de tal",
                "567657655",
                "76467444"
        );
        p2.imprimirDados();
    */
    /*
        Pessoa jose = new Pessoa(
            "José",
            "Rua Antonio Marques, 30",
            "568.234.981-15",
            "3.698.22-8"
        );
        jose.imprimirDados();
    */

        Aluno pedro = new Aluno(
                "Pedro",
                "Rua almeida, 20",
                "456.876.123-12",
                "4.687.098-2",
                "59751",
                4.5,
                8.0,
                10
        );
        pedro.imprimirDados();
        pedro.imprimirFaltas();

    }
}
