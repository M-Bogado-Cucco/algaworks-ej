package s_08_arrays.exemplosIniciais;

import java.util.Arrays;
import java.util.Comparator;

public class Program_2 {

  public static void main(String[] args) {

    int[] notas = {8, 5, 4, 9, 10};

    double media = Calculadora.calcularMedia(notas);
    System.out.println(media);


    // Aula 8.4, importando o objeto Array
    String notasEmString = Arrays.toString(notas);
    System.out.println(notasEmString);// [8,5,4,9,10]

    // Ordenando
    //sort -> altera o próprio array, não cria um novo array
    Arrays.sort(notas);
    System.out.println(Arrays.toString(notas));

    //ordem inversa
    Integer[] points = {8, 5, 4, 10, 9};
    Arrays.sort(points, Comparator.reverseOrder());
    System.out.println(Arrays.toString(points));
  }
}

















