package s_10_const_pacotes_visib;

import java.util.Objects;
import java.util.UUID;

public class ProdutoS7 {

  static final int QUANTIDADE_ESTOQUE_INICIAL = 10;

  // aqui precisa inicializar
  final String codigo;
  String nome;
  int quantidadeEstoque;


  ProdutoS7() {

    this("Sem nome");

  }

  ProdutoS7(String nome) {
    this(nome, QUANTIDADE_ESTOQUE_INICIAL);
  }

  ProdutoS7(String nome, int quantidadeEstoque) {
    Objects.requireNonNull(nome, "Nome é obrigatório");

    if (quantidadeEstoque < 0) {
      throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
    }

    this.nome = nome;
    this.quantidadeEstoque = quantidadeEstoque;
    //this.codigo = "xyz";
    this.codigo = UUID.randomUUID().toString(); // gera um número aleatório e converte para string
  }
}


















