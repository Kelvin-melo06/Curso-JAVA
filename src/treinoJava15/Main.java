package treinoJava15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Produtos voce deseja Cadastrar? ");
        int quantidadeDeProdutos = sc.nextInt();
        sc.nextLine();

        Produto[] produtos = new Produto[quantidadeDeProdutos];

        for(int i = 0; i < quantidadeDeProdutos; i++){
            System.out.println("\n===== Cadastro de Produtos =====");

            System.out.println("Digite o nome do Produto: ");
            String nomeProduto = sc.nextLine();

            System.out.println("Digite o valor do Produto: ");
            double valorProduto = Double.parseDouble(sc.nextLine().replace(",", "."));

            System.out.println("Digite a quantidade de produtos: ");
            int quantidadeDosProdutos = sc.nextInt();
            sc.nextLine();

            produtos[i] = new Produto(nomeProduto, valorProduto, quantidadeDosProdutos);

            System.out.println();
        }

        for(Produto p : produtos){
            System.out.println("\n===== Produtos Cadastrados =====" + "\t");
            p.imprimirDados();
            System.out.println();
        }

        double somaPrecoTodosProdutos = 0;
        for(Produto p : produtos){
            somaPrecoTodosProdutos += p.getPrecoProduto();
        }

        double mediaTodosProdutos = somaPrecoTodosProdutos/quantidadeDeProdutos;

        System.out.println("\n===== Dados sobre Produtos Cadastrados: =====");
        System.out.println("O Preço médio de todos os produtos é de: " + mediaTodosProdutos);

        Produto maiorPrecoProduto = produtos[0];
        for(Produto p : produtos){
            if(p.getPrecoProduto() > maiorPrecoProduto.getPrecoProduto()){
                maiorPrecoProduto = p;
            }
        }

        System.out.println("O Produto " + maiorPrecoProduto.getNomeProduto() + " com o preço de " + maiorPrecoProduto.getPrecoProduto() + " é o mais caro.");

        System.out.println("\nDigite o codigo do Produto para adicionar o aumento de preço: ");
        int codigoAumentoProduto = sc.nextInt();

        System.out.println("Digite o percentual de aumento: ");
        double percentualAumento = sc.nextDouble();

        for(Produto p : produtos){
            if(p.getCodigoProduto() == codigoAumentoProduto){
                p.setPrecoProduto(p.getPrecoProduto() * (1 + percentualAumento/100));
                System.out.println("O produto " + p.getNomeProduto() + " tem um novo preço de " + p.getPrecoProduto());
            }
        }

        System.out.println("Total de produtos Cadastrados " + Produto.getTotalProdutos());
        sc.close();
    }
}
