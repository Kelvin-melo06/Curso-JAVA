package treinoJava6;

public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;

    public Pessoa(){};
    public Pessoa(String nome, String cpf, String rg, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        if(cpf.length() != 11){return false;}

        if(cpf.matches("(\\d)\\1{10}")) return false;

        // Calcula os dígitos verificadores
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int dig1 = 11 - (soma % 11);
        if (dig1 >= 10) dig1 = 0;

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int dig2 = 11 - (soma % 11);
        if (dig2 >= 10) dig2 = 0;

        return dig1 == Character.getNumericValue(cpf.charAt(9)) &&
                dig2 == Character.getNumericValue(cpf.charAt(10));
    }

    public String getRg() {
        return rg;
    }

    public boolean getRg(String rg) {
        rg = rg.replace(".", " ").replace("-", " ");

        if(rg.length() < 7 || rg.length() > 9){return false;}
        return rg.matches("\\d+");
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
    }
}
