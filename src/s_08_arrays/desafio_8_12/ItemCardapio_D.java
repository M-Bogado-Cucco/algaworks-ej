package s_08_arrays.desafio_8_12;

public class ItemCardapio_D {

  String descricao;
  double preco;

  boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
    return preco >= precoMinimo && preco <= precoMaximo;
  }

  void imprimir() {
    System.out.printf("%s x R$%.2f\n", descricao, preco);
  }
}
