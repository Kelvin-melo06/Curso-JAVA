package treinoJava3;

public class Main {
    public static void main(String[] args) {
        Aluno testaAluno = new Aluno();
        Aluno testaAluno2 = new Aluno("Ana Souza", 31, 1234, 7.0, 3.0);
        Aluno testaAluno3 = new Aluno("Bia Nunes", 25, 5678, 3.0, 9.0);
        Aluno testaAluno4 = new Aluno("Paulo Santos", 45, 9876, 6.0, 8.0);

        testaAluno2.imprimirAluno();
        testaAluno2.calcularMedia();
        testaAluno3.imprimirAluno();
        testaAluno3.calcularMedia();
        testaAluno4.imprimirAluno();
        testaAluno4.calcularMedia();
    }
}
