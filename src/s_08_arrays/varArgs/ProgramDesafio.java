package s_08_arrays.varArgs;

public class ProgramDesafio {

  public static void main(String[] args) {

    double media = CalcDesafio.calcularMedia(59.2, 89.2,
            10.2, 104.2, 78);

    System.out.printf("Média vale %.2f\n", media);

    double media2 = CalcDesafio.calcularMedia2(59.2, 89.2,
            10.2, 104.2, 78);

    System.out.printf("Média vale %.2f\n", media2);

  }
}
