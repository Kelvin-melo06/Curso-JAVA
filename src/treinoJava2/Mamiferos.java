package treinoJava2;

import org.w3c.dom.ls.LSOutput;

public class Mamiferos {
    private static int totalMamiferos = 0;

    private String nome;
    private int idade;
    private double peso;
    private String habitat;

    public Mamiferos() {};

    public Mamiferos(String nome, int idade, double peso, String habitat) {
        this.nome = nome;;
        setIdade(idade);
        setPeso(peso);
        this.habitat = habitat;
        totalMamiferos++;
    }

    public static int getTotalMamiferos() {
        return totalMamiferos;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0 || peso > 150) {
            throw new IllegalArgumentException("peso invalido");
        } else {
            this.peso = peso;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirMamiferos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Habitat: " + habitat);
    }
}
