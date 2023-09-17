package s_08_arrays.arraysDeObjetos.copiando_removendo;

import java.util.Arrays;

public class Program_4 {
  public static void main(String[] args) {
    int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};

    // copyOf (cria um novo objeto)
    int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, 3);

    System.out.println(Arrays.toString(numerosJogo1));
    System.out.println(Arrays.toString(numerosJogo2));  // [25, 11, 8]
  }
}
