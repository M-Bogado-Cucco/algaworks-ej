package s_05_oo.precificacao;

public class ServicoDePrecificacao {

  void definirPrecoVenda(Produto produto, double percMargemLucro) {
    double precoVendaCalculado = UtilsMatematica.calcularAcrescimo(
            produto.precoCusto, percMargemLucro
    );

    precoVendaCalculado += Produto.custoEmbalagem;
    produto.precoVenda = precoVendaCalculado;

  }

}
