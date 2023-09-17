package s_08_arrays.exemplosIniciais;

public class Calculadora {

  static double calcularMedia(int[] numeros) {
    int soma = 0;
    double media = 0;

    for(int num: numeros) {
      soma += num;
      media = (double) soma / numeros.length;
    }
    return media;
  }
}

// se digitar ' numeros.fori ' ou
// ' numeros.for ', a ide já
// autocompleta o for
