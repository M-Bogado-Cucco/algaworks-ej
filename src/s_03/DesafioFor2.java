package s_03;

import java.util.Scanner;

public class DesafioFor2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe quantos números deseja verificar se é primo: ");

    int total = scanner.nextInt();

    int divisor = 0;
    for(int i = 0; i < total; i++) {

      System.out.printf("Informe o %d° número: ", (i+1));
      int x = scanner.nextInt();

      for(int j = 1; j <= x; j++) {

        if(x % j == 0) {
          divisor++;
        }

      }
      if(divisor == 2) {
        System.out.println(x + " é primo");
      }
      else {
        System.out.println(x + " não é primo");
      }
      divisor = 0;
    }

    System.out.println("\n --> Fim !");

    scanner.close();
  }
}
