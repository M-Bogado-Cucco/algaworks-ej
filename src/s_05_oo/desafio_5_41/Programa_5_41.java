package s_05_oo.desafio_5_41;

public class Programa_5_41 {

  public static void main(String[] args) {

    int maior2 = NumeroUtil.retornaMaior2Num(3, 14);

    int maior3 = NumeroUtil.retornaMaior3Num(5, 4, 21);

    double maior2Dec = NumeroUtil.retornaMaior2Decimais(4.46, 2.47);
    double maior3Dec = NumeroUtil.retornaMaior3Decimais(4.46, 2.47, 7.89);

    System.out.println("Maior de 2: " + maior2);
    System.out.println("Maior de 3: " + maior3);
    System.out.println("Maior de 2 decimais: " + maior2Dec);
    System.out.println("Maior de 3 decimais: " + maior3Dec);

  }

}
