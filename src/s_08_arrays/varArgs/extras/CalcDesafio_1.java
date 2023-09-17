package s_08_arrays.varArgs.extras;

public class CalcDesafio_1 {

  double calcularMedia(double valor1, double valor2, double... valoresAdicionais) {
    double total = somarValores(valor1 + valor2, valoresAdicionais);
    double media = total / (valoresAdicionais.length + 2);
    imprimirMedia(media);

    return media;
  }

  static double somarValores(double montante, double[] valores) {
    for (double valor : valores) {
      montante += valor;
    }
    return montante;
  }

  void imprimirMedia(double media) {
    System.out.printf("A média é de %.2f\n", media);
  }
}
