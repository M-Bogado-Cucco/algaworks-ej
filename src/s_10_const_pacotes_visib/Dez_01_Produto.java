package s_10_const_pacotes_visib;

import java.util.Objects;

public class Dez_01_Produto {

  static final int QUANTIDADE_ESTOQUE_INICIAL = 10;
  String nome;
  int quantidadeEstoque;

  Dez_01_Produto() {
    System.out.println("Construindo um produto");
  }

  Dez_01_Produto(String nome) {
    Objects.requireNonNull(nome, "Nome é obrigatório");

    this.nome = nome;
    this.quantidadeEstoque =  QUANTIDADE_ESTOQUE_INICIAL;
  }

  public Dez_01_Produto(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "Nome é obrigatório");

    if (quantidadeEstoque < 0) {
      throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
    }
    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
  }
}


















