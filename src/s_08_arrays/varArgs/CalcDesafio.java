package s_08_arrays.varArgs;

import java.util.Arrays;

public class CalcDesafio {

  static double calcularMedia(double numA, double numB, double... demaisNumeros) {

    double totalNumeros = numA + numB;

    for (double numero : demaisNumeros) {
      totalNumeros += numero;
    }

    return totalNumeros / (demaisNumeros.length + 2);
  }

  // método antigo
  static double calcularMedia2(double numeroA, double numeroB, double... demaisNumeros) {
    double[] todosNumeros = Arrays.copyOf(demaisNumeros, demaisNumeros.length + 2);
    todosNumeros[todosNumeros.length - 2] = numeroA;
    todosNumeros[todosNumeros.length - 1] = numeroB;

    double soma = 0;

    for (double numero : todosNumeros) {
      soma += numero;
    }

    return soma / todosNumeros.length;
  }
}
