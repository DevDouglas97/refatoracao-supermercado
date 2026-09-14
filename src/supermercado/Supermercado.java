package supermercado;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Cadastro do cliente
        System.out.println("===== DADOS DO CLIENTE =====");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, email);

        // Criação do carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("\n===== PRODUTO =====");

        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço unitário: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(
                nomeProduto,
                quantidade,
                preco
        );

        carrinho.adicionarProduto(produto);

        // Criação do pedido
        Pedido pedido = new Pedido();

        pedido.setNumeroPedido(1);
        pedido.setCliente(cliente);
        pedido.setCarrinho(carrinho);

        // Exibição do pedido
        System.out.println("\n===== PEDIDO =====");

        pedido.fecharPedido();

        scanner.close();
    }
}