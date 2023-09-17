package s_03;

import java.util.Enumeration;
import java.util.Scanner;

public class DesafioFor {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int soma = 0;

    System.out.print("Deseja digitar quantos números pares: ");
    int pares = sc.nextInt();

    for (int i = 1; i <= pares; i++) {
      System.out.printf("Digite apenas pares -> %d/%d: ", i, pares);
      int num = sc.nextInt();
      if(num % 2 != 0) {
        System.out.println("Vocẽ digitou um ímpar, não valeu!");
        i--;
      }
      else {
        soma += num;
      }
    }

    System.out.printf("A soma dos pares vale %d", soma);

    sc.close();
  }

}
