package treinoJava1;

public class Eletrodomesticos {
    private String nome;
    private int voltagem;
    private double peso;
    private String cor;

    public Eletrodomesticos(){};

    public Eletrodomesticos(String nome, int voltagem, double peso, String cor){
        this.nome = nome;
        this.voltagem = voltagem;
        this.peso = peso;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getVoltagem(){
        return voltagem;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void imprimirEletrodomestico(){
        System.out.println("Nome do Eletrodomestico: \n" + nome);
        System.out.println("Voltagem do Eletrodomestico: \n" + voltagem);
        System.out.println("Peso do Eletrodomestico: \n" + peso);
        System.out.println("Cor do Eletrodomestico: \n" + cor);
    }
}
