package s_10_const_pacotes_visib;

import java.util.Objects;

public class Participante {

  public String nome;
  protected int saldoDePontos;

  Participante(String nome) {
    this(nome, 0);
  }

  Participante(String nome, int saldoDePontos) {

    Objects.requireNonNull(nome, "Nome é obrigatório");
//    if(saldoDePontos < 0) {
//      throw new IllegalArgumentException("Saldo inicial de pontos não " +
//              "pode ser negativo.");
//    }
    this.nome = nome;
    this.saldoDePontos = saldoDePontos;
  }

  public void creditarPontos(int pontos) {
    this.saldoDePontos += pontos;
  }
}
