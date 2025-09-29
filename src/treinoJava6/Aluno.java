package treinoJava6;

public class Aluno extends Pessoa {
    private static double mediaAprovacao = 7.0;
    private static double mediaReprovacao = 3.0;


    private String codigoMatricula;
    private double nota1;
    private double nota2;
    private int quantidadeFaltas;

    public Aluno() {};
    public Aluno(String nome, String cpf, String rg,String endereco, String codigoMatricula, double nota1, double nota2, int quantidadeFaltas) {
        super(nome,endereco,cpf,rg);
        this.codigoMatricula = codigoMatricula;
        setNota1(nota1);
        setNota2(nota2);
        this.quantidadeFaltas = quantidadeFaltas;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if(nota1 <= 0 || nota1 > 10) {throw new IllegalArgumentException("Nota invalida!");}
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if(nota2 <= 0 || nota2 > 10) {throw new IllegalArgumentException("Nota invalida!");}
        this.nota2 = nota2;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public void setQuantidadeFaltas(int quantidadeFaltas) {
        this.quantidadeFaltas = quantidadeFaltas;
    }


    public double mediaAluno(double nota1, double nota2){
        return (this.nota1 + this.nota2)/2;
    }

    public void resultado(){
        double media =  mediaAluno(nota1,nota2);
        String situacao;

        if(media >= mediaAprovacao){
            situacao = "Aprovado";
        } else if(media < mediaReprovacao){
            situacao = "Reprovado";
        } else{
            situacao = "Em reavaliação(Exame)";
        }

        System.out.println("Situação: "+ situacao);
    }


    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("codigo matricula: " + getCodigoMatricula());
        System.out.println("nota1: " + getNota1());
        System.out.println("nota2: " + getNota2());
        System.out.println("media: " +  mediaAluno(getNota1(), getNota2()));
    }

    public void imprimirFaltas() {
        System.out.println("Quantidade faltas: " + getQuantidadeFaltas());
    }
}
