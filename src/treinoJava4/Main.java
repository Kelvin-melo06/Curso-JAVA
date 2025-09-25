package treinoJava4;

public class Main {
    public static void main(String[] args){
        Aluno a = new Aluno("Ana Souza", 31, 1234);
        Aluno b = new Aluno("Bia Nunes", 25, 5678);
        Aluno c = new Aluno("Paulo Santos", 45, 9876);

        a.imprimirAluno();
        b.imprimirAluno();
        c.imprimirAluno();
    }
}
