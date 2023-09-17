package s_05_oo.retornoObjetos;

public class IndiceMassaCorporal {

  double resultado;
  double peso;
  double altura;

  boolean estaObeso() {
    return resultado >= 30;
  }

  boolean abaixoPesoideal() {
    return resultado < 18.5;
  }
}
