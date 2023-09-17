package s_05_oo.desafio_5_35;

import s_05_oo.retornoObjetos.ProgramaIMC;

public class UtilsAreas {

  static final double PI = 3.14159265358979323846;

  static double calcularAreaQuadrado(double lado) {
    return lado * lado;
  }

  static double calcularAreaCirculo(double raio) {
    return UtilsAreas.PI * raio * raio;
  }

}
