**Sistema de Supermercado — Refatoração**  
Projeto desenvolvido como exercício durante o curso Técnico em Desenvolvimento de Sistemas.  
O objetivo da atividade foi analisar um código Java existente, identificar problemas de organização e relacionamento entre classes e realizar refatorações para melhorar a estrutura, legibilidade e integração do sistema.  
**Objetivo**  
Refatorar uma aplicação simples de supermercado, estabelecendo corretamente o relacionamento entre as classes:  
- Supermercado  
- Cliente  
- Produto  
- CarrinhoDeCompras  
- Pedido  
Ao final da refatoração, a classe principal passou a utilizar as demais classes de forma integrada, simulando o fluxo básico de uma compra.  
**Estrutura do projeto**  
src/  
 └── supermercado/  
     ├── Cliente.java  
     ├── Produto.java  
     ├── CarrinhoDeCompras.java  
     ├── Pedido.java  
     └── Supermercado.java  
   
**Responsabilidade das classes**  
**Cliente**  
Representa o cliente da compra e armazena:  
- Nome  
- CPF  
- E-mail  
**Produto**  
Representa um produto e armazena:  
- Nome  
- Quantidade  
- Preço unitário  
**CarrinhoDeCompras**  
Responsável por armazenar os produtos e calcular o valor total da compra.  
**Pedido**  
Relaciona o cliente ao carrinho de compras e apresenta as informações do pedido.  
**Supermercado**  
Classe principal responsável por executar o programa, receber os dados através do console e realizar a integração entre os objetos.  
**Refatorações realizadas**  
**1. Remoção de métodos duplicados em **Cliente  
Foram identificados métodos que realizavam a mesma operação:  
getNome()  
 getNomeCliente()  
   
e:  
setNome()  
 setNomeCliente()  
   
Foi mantida uma única representação:  
getNome()  
 setNome()  
   
Essa alteração reduziu a duplicação e tornou a interface da classe mais consistente.

**2**. **Correção do relacionamento entre** **Pedido** e **Cliente**  
Inicialmente, a classe Pedido possuía declarações incorretas para CPF e e-mail:  
private int cpf;  
 private string email;  
   
A estrutura foi corrigida para que Pedido mantenha uma referência para um objeto Cliente:  
private Cliente cliente;  
   
Os dados do cliente passaram a ser acessados através do objeto:  
cliente.getNome();  
 cliente.getCpf();  
 cliente.getEmail();  
   
**3. Padronização da formatação**  
Foram corrigidos problemas de:  
- Indentação  
- Espaçamento  
- Organização dos blocos de código  
A alteração melhora a legibilidade e facilita a manutenção do projeto.  
**4. Melhoria dos nomes das variáveis**  
Variáveis com nomes genéricos, como:  
CarrinhoDeCompras c;  
 Pedido p;  
   
foram substituídas por nomes mais descritivos:  
CarrinhoDeCompras carrinho;  
 Pedido pedido;  
   
Isso torna o código mais fácil de compreender.  
**5. Integração entre **Produto ** e **CarrinhoDeCompras  
O método adicionarProduto() foi alterado para receber um objeto Produto:  
public void adicionarProduto(Produto produto) {  
     this.produtos.add(produto);  
 }  
   
Dessa forma, o objeto Produto é criado na aplicação e posteriormente associado ao carrinho.  
**6. Integração das classes**  
A classe Supermercado passou a coordenar o fluxo da aplicação:  
Cliente  
    │  
    ▼  
 Pedido ───────► CarrinhoDeCompras  
                       │  
                       ▼  
                    Produto  
   
O programa passou a permitir a entrada de dados pelo console e utiliza esses dados para criar e relacionar os objetos.
 
**Funcionamento**  
A aplicação é executada através da classe:  
Supermercado.java  
   
Durante a execução, o usuário informa:  
1. Nome do cliente  
2. CPF  
3. E-mail  
4. Nome do produto  
5. Quantidade  
6. Preço unitário  
Exemplo:  
===== DADOS DO CLIENTE =====  
 Nome: Douglas  
 CPF: 12345678900  
 E-mail: douglas@email.com  
   
 ===== PRODUTO =====  
 Nome do produto: Arroz  
 Quantidade: 2  
 Preço unitário: 3,99  
   
Após o preenchimento dos dados, o programa cria os objetos, associa o cliente ao pedido, adiciona o produto ao carrinho e calcula o total da compra.
  
**Conceitos praticados**  
Durante a atividade foram trabalhados conceitos de:  
- Programação Orientada a Objetos (POO)  
- Classes e objetos  
- Encapsulamento  
- Associação entre objetos  
- Responsabilidade das classes  
- Refatoração  
- Remoção de código duplicado  
- Padronização de código  
- Nomenclatura de variáveis  
- Collections (List e ArrayList)  
- Entrada de dados com Scanner  
**Tecnologias**  
- Java  
- NetBeans  
- Git  
- GitHub  
**Contexto acadêmico**  
Este projeto foi desenvolvido como parte das atividades do curso Técnico em Desenvolvimento de Sistemas.  
O foco principal não é a implementação de um sistema comercial completo, mas o exercício de análise, refatoração e integração de classes utilizando conceitos de Programação Orientada a Objetos.  
