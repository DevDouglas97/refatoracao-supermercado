package supermercado;

public class Pedido {

    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private Cliente cliente;

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void fecharPedido() {
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Total do pedido: " + carrinho.calcularTotal());
        System.out.println("=====================================");
    }
}