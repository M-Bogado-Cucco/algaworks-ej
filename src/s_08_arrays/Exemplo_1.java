package s_08_arrays;

public class Exemplo_1 {

  public static void main(String[] args) {

    int[] notas = new int[5];
    int[] pontos = new int[]{8, 5, 4, 9, 10};

    for (int ponto: pontos) {
      System.out.print(ponto + " ");
    }
  }
}
