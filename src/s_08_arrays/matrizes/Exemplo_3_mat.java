package s_08_arrays.matrizes;

import java.util.Arrays;

public class Exemplo_3_mat {

  public static void main(String[] args) {

    String[][] produtos = new String[3][];

    produtos[0] = new String[3];
    produtos[0][0] = "ssd m.2";
    produtos[0][1] = "monitor";
    produtos[0][2] = "cpu";

    produtos[1] = new String[1];
    produtos[1][0] = "teclado";

    produtos[2] = new String[2];
    produtos[2][0] = "mouse";

    // percorrendo as linhas
    for (int i = 0; i < produtos.length; i++) {
//      System.out.println(Arrays.toString(produtos[i]));
      // percorrendo as colunas
      for (int j = 0; j < produtos[i].length; j++) {
//        System.out.println(produtos[i][j]);
        System.out.printf("[%d][%d] = %s\n", i, j, produtos[i][j]);
      }
    }


  }
}
