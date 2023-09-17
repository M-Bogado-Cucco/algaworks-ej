package s_08_arrays.arraysDeObjetos.copiando_removendo;

import java.util.Arrays;

public class Program_5 {

  public static void main(String[] args) {

    int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
    int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

    int indiceExclusao = 4;

    // [25, 11, 8, 46, 37, 14, 55]
    // [0, 0, 0, 0, 0, 0]

  // método antigo System.arraycopy (recebe 5 parâmetros)
    System.arraycopy(numerosJogoAtual, 0,
            numerosNovoJogo, 0, indiceExclusao);

    System.arraycopy(numerosJogoAtual, indiceExclusao+1,
            numerosNovoJogo, indiceExclusao, numerosNovoJogo.length-indiceExclusao);

    // copiando de 7 para 6 posições, excluindo o elemento 8
    System.out.println(Arrays.toString(numerosJogoAtual));
    System.out.println(Arrays.toString(numerosNovoJogo));

  }

}
