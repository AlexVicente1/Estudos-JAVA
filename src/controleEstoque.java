import java.util.Scanner;

// Classe Produto
class Produto {
    String nome;
    int quantidade;

    public Produto(String nome) {
        this.nome = nome;
        this.quantidade = 0;
    }

    public void adicionarEstoque(int quantidadeAdicionada) {
        quantidade += quantidadeAdicionada;
        System.out.printf("Adicionados %d unidades de %s ao estoque.\n", quantidadeAdicionada, nome);
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.printf("Venda de %d unidades de %s realizada.\n", quantidadeVendida, nome);
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }

    public void exibirEstoque() {
        System.out.printf("Produto: %s\n", nome);
        System.out.printf("Quantidade em estoque: %d\n", quantidade);
    }
}

// Classe principal com main
public class controleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = {
            new Produto("Camisa Java"),
            new Produto("Bermuda Java"),
            new Produto("Cueca Java"),
            new Produto("Meia Java"),
            new Produto("Blusa Java")
        };

        System.out.println("=== Sistema de Controle de Estoque ===");
        boolean executando = true;

        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Consultar estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirProdutos(produtos);
                    System.out.print("Escolha o produto (número): ");
                    int idxAdd = scanner.nextInt();
                    if (idxAdd >= 0 && idxAdd < produtos.length) {
                        System.out.print("Quantidade para adicionar: ");
                        int qtdAdd = scanner.nextInt();
                        produtos[idxAdd].adicionarEstoque(qtdAdd);
                    } else {
                        System.out.println("Produto inválido!");
                    }
                    break;

                case 2:
                    exibirProdutos(produtos);
                    System.out.print("Escolha o produto (número): ");
                    int idxVenda = scanner.nextInt();
                    if (idxVenda >= 0 && idxVenda < produtos.length) {
                        System.out.print("Quantidade para vender: ");
                        int qtdVenda = scanner.nextInt();
                        produtos[idxVenda].vender(qtdVenda);
                    } else {
                        System.out.println("Produto inválido!");
                    }
                    break;

                case 3:
                    for (Produto p : produtos) {
                        p.exibirEstoque();
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Saindo do sistema de estoque...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirProdutos(Produto[] produtos) {
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%d - %s\n", i, produtos[i].nome);
        }
    }
}




