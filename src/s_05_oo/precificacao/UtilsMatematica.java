package s_05_oo.precificacao;

public class UtilsMatematica {

  static double calcularAcrescimo(double valor, double percentual) {

    return valor * ((percentual / 100) +1);
  }

}
// obs: ao final da aula 5.33
// métodos estáticos nos aproximam
// da programação procedural, atenção com isso,
// usar em exceções