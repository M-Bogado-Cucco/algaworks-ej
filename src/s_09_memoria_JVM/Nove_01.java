package s_09_memoria_JVM;

import java.util.Scanner;

public class Nove_01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();

    System.out.println("Olá, " + nome);

    sc.close();
  }
}
