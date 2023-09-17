package s_05_oo.desafio_5_41;

public class NumeroUtil {

  static int retornaMaior2Num(int num1, int num2) {
    return Math.max(num1, num2);
  }

  static int retornaMaior3Num(int num1, int num2, int num3) {
    return num1 > num2 && num1 > num3 ? num1 :
      num2 > num1 && num2 > num3 ? num2 : num3;

  }

  static double retornaMaior2Decimais(double num1, double num2) {
    return Math.max(num1, num2);
  }

  static double retornaMaior3Decimais(double num1, double num2, double num3) {
    return retornaMaior2Decimais(retornaMaior2Decimais(num1, num2), num3);
  }

}
