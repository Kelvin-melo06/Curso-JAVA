package treinoJava3;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private double nota1;
    private double nota2;

    private static int totalAlunos = 0;

    public Aluno(){};
    public Aluno(String nome, int idade, int matricula, double nota1, double nota2) {
        this.nome = nome;
        setIdade(idade);
        this.matricula = matricula;
        setNota1(nota1);
        setNota2(nota2);
        totalAlunos++;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 < 0 || nota2 > 10){
            throw  new IllegalArgumentException("Nota deve ser entre 0 e 10");
        }
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 < 0 || nota1 > 10){
            throw  new IllegalArgumentException("Nota deve ser entre 0 e 10");
        }
        this.nota1 = nota1;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0 || idade > 100){
            throw  new IllegalArgumentException("Idade deve ser entre 0 e 100");
        }
        this.idade = idade;
    }

    public void imprimirAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota1: " + this.nota1);
        System.out.println("Nota2: " + this.nota2);
    }

    public boolean calcularMedia(){
        double media = (this.nota1 + this.nota2) / 2;

        if(media >= 6){
            System.out.println("Sua média é de: " + media);
            System.out.println("Situação do(a) aluno(a) " + getNome() + ": APROVADO");
            return true;
        } else {
            System.out.println("Sua média é de: \n" + media);
            System.out.println("Situação do(a) aluno(a) " + getNome() + ": REPROVADO");
            return false;
        }
    }
}



