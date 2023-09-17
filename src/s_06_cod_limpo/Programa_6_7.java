package s_06_cod_limpo;

public class Programa_6_7 {

  public static void main(String[] args) {
    CarrinhoDeCompra carrinho =
            new CarrinhoDeCompra();

    Produto produto = new Produto();
    produto.nome = "Água";
    produto.precoUnitario = 5;

    carrinho.adicionarItem(produto, 4);

    Endereco endereco = new Endereco();
    endereco.logradouro = "Rua das Amoras";
    endereco.numero = "1000";
    endereco.bairro = "Centro";

    carrinho.gerarPedido(endereco);

  }
}















