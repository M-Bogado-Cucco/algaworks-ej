package s_06_cod_limpo;

import java.util.Objects;

public class CarrinhoDeCompra {

  static final double TAXA_SERVICO_PADRAO = 0.10;
  int quantidadeItens;
  Produto produto;

  void realizarCompra(String numeroCartao) {
    double valorTotal = calcularValorTotal();

    boolean pagamentoAutorizado = GatewayPagamento
            .autorizarPagamento(numeroCartao, valorTotal);

    if(pagamentoAutorizado) {
      imprimirRecibo(valorTotal);
    }

  }

// métodos com 1 linha somente faz bastante sentido

  static void imprimirRecibo(double valorTotal) {
    System.out.println("RECIBO DE PAGAMENTO");
    System.out.printf("Valor total: R$%.2f\n", valorTotal);
  }

  double calcularValorTotal() {
    double subTotal = calcularSubTotal();
    double taxaServico = subTotal * TAXA_SERVICO_PADRAO;
    double valorTotal = subTotal + taxaServico;
    return valorTotal;
  }

  double calcularSubTotal() {
    return produto.precoUnitario * quantidadeItens;
  }


  void adicionarItem(Produto produto,  int quantidade) {
    Objects.requireNonNull(produto, "Produto deve ser informado");

    if(quantidade <= 0) {
      throw new IllegalArgumentException("Quantidade deve ser maior que 0");
    }

//    if (produto == null) {
//      System.out.println("produto não pode ser nulo");
//    } else {
//      System.out.printf("Produto: %s\n", produto.nome);
//    }


    System.out.printf("Produto? %s%n", produto.nome);
  }

  void gerarPedido(Endereco enderecoEntrega) {
    Objects.requireNonNull(enderecoEntrega, "Endereço deve ser informado");
    criarNovoPedido(enderecoEntrega);
  }
// Não se deve passar null em métodos: exceção se for
//usado na própria classe

  void gerarPedido() {
    criarNovoPedido(null);
  }

  // método interno (private, para não ser usado fora dessa classe)
  private void criarNovoPedido(Endereco enderecoEntrega) {
    //TODO
  }

}
