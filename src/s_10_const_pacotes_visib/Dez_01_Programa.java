package s_10_const_pacotes_visib;

public class Dez_01_Programa {

  public static void main(String[] args) {

    Dez_01_Produto produto1 = new Dez_01_Produto(null, -35);
    Dez_01_Produto produto2 = new Dez_01_Produto("picanha", 50);
    System.out.printf("Nome: %s\n", produto2.nome);
    System.out.printf("Estoque: %d", produto2.quantidadeEstoque);
  }
}
