package s_08_arrays.desafio_8_12;

public class Program_desafio_2 {

  public static void main(String[] args) {

    Cardapio_D cardapio_d = new Cardapio_D();

    ItemCardapio_D item1 = new ItemCardapio_D();
    item1.descricao = "Rib Eye 500g";
    item1.preco = 95;

    ItemCardapio_D item2 = new ItemCardapio_D();
    item2.descricao = "Picanha 400g";
    item2.preco = 102.5;

    ItemCardapio_D item3 = new ItemCardapio_D();
    item3.descricao = "Batata frita 300g";
    item3.preco = 12;

    cardapio_d.adicionarItem(item1);
    cardapio_d.adicionarItem(item2);
    cardapio_d.adicionarItem(item3);

    System.out.println("\n---> Imprimindo a faixa de preços de 80 a 150:");
    cardapio_d.imprimirItensCardapio(80, 150);
    System.out.println("\n---> removendo o item 0");
    cardapio_d.removerItem(0);

    cardapio_d.imprimirItensCardapio(80, 150);
    System.out.println("\n---> Imprimindo a faixa de preços de 0 a 150:");
    cardapio_d.imprimirItensCardapio(0,150);
  }
}
















