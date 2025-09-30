package treinoJava15;

public class Produto {
    private static int totalProdutos = 0;
    private int codigoProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeDeProdutos;

    public Produto() {};
    public Produto(String nomeProduto, double precoProduto, int quantidadeDeProdutos) {
        totalProdutos++;
        this.codigoProduto = totalProdutos;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public static int getTotalProdutos() {
        return totalProdutos;
    }

    public static void setTotalProdutos(int totalProdutos) {
        Produto.totalProdutos = totalProdutos;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos = quantidadeDeProdutos;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nomeProduto);
        System.out.println("Preço: " + this.precoProduto);
        System.out.println("Codigo produto: " + this.codigoProduto);
    }
}
