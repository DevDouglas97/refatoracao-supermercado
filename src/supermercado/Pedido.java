package supermercado;

public class Pedido {
    private int numeroPedido;
    private CarrinhoDeCompras carrinho;
    private String cliente;
    private String cpf;
    private String email;
    
    public int getNumeroPedido() {
        return this.numeroPedido;
    }

    public String getNomeCliente() {
        return this.cliente;
    }

    public String getCpfCliente() {
        return this.cpf;
    }

    public String getEmailCliente() {
        return email;
    }   
    
    public void fecharPedido() {
        System.out.println("Numero do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Total do pedido: " + this.carrinho.calcularTotal());
        System.out.println("=====================================");
    }
    
    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }    
    
    
}

