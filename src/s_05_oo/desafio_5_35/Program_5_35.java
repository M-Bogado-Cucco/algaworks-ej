package s_05_oo.desafio_5_35;

public class Program_5_35 {

  public static void main(String[] args) {

    double areaQuadrado = UtilsAreas.calcularAreaQuadrado(10.0);
    double areaCirculo = UtilsAreas.calcularAreaCirculo(5.00);

    System.out.printf("Área do quadrado: %.2f m²\n", areaQuadrado);
    System.out.printf("Área do círculo: %.2f m²\n", areaCirculo);
  }

}
