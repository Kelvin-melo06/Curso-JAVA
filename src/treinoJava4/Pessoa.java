package treinoJava4;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){};
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
