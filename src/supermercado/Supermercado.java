package supermercado;

public class Supermercado {


public static void main(String[] args) {


CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
carrinho.adicionarProduto("Arroz", 1, 3.99);
carrinho.adicionarProduto("Filé de frango sassami", 2, 21.99);
carrinho.calcularTotal();




Pedido pedido = new Pedido();
pedido.setNumeroPedido(1);
pedido.setCarrinho(c);

pedido.fecharPedido();

}


}
