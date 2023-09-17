package s_05_oo.precificacao;

public class ProgramPrecif {

  public static void main(String[] args) {

    Produto.custoEmbalagem = 10.0;
    Produto novoProduto = new Produto();
    novoProduto.alterarPrecoCusto(80);

    ServicoDePrecificacao svcoPrecificacao = new ServicoDePrecificacao();
    svcoPrecificacao.definirPrecoVenda(novoProduto, 20);

    System.out.printf("Preço de venda: %.2f\n", novoProduto.precoVenda);
    System.out.printf("Preço de custo: %.2f\n", novoProduto.precoCusto);
  }

}
