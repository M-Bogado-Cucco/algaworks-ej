package s_08_arrays.desafio_8_10;

import java.util.ArrayList;

public class Program_desafio_1 {

  public static void main(String[] args) {

    Cardapio cardapio = new Cardapio();

    ItemCardapio item1 = new ItemCardapio();
    item1.descricao = "Rib Eye 500g";
    item1.preco = 95;

    ItemCardapio item2 = new ItemCardapio();
    item2.descricao = "Picanha 400g";
    item2.preco = 102.5;

    ItemCardapio item3 = new ItemCardapio();
    item3.descricao = "Batata frita 300g";
    item3.preco = 12;

    cardapio.adicionarItem(item1);
    cardapio.adicionarItem(item2);
    cardapio.adicionarItem(item3);

    // Aula 8.14
    ArrayList<ItemCardapio> itensBaratos = cardapio.
            consultarItensPorPreco(0, 15);

//    cardapio.imprimirItensCardapio(80, 150);
//    cardapio.removerItem(0);
//    System.out.println("---");
//    cardapio.imprimirItensCardapio(0, 150);

    for(ItemCardapio item : itensBaratos) {
      System.out.printf("%s x R$%.2f\n", item.descricao, item.preco);
    }

  }
}




















