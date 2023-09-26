package s_10_const_pacotes_visib;

public class Dez_01_Programa {

  public static void main(String[] args) {

    ProdutoS7 p1 = new ProdutoS7("Sorvete", 35);
    ProdutoS7 produto2 = new ProdutoS7("picanha", 50);
    ProdutoS7 p3 = new ProdutoS7();

    System.out.println(p1.codigo);
    System.out.println(p1.nome);
    System.out.println(p1.quantidadeEstoque);

    System.out.printf("\n2\nNome: %s\n", produto2.nome);
    System.out.printf("Estoque: %d\n", produto2.quantidadeEstoque);

    System.out.println("\n3\n"+p3.codigo);
    System.out.println(p3.nome);
    System.out.println(p3.quantidadeEstoque);

  }
}
