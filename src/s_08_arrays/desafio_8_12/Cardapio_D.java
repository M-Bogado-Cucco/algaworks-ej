package s_08_arrays.desafio_8_12;

import java.util.ArrayList;

public class Cardapio_D {

  ArrayList<ItemCardapio_D> itens = new ArrayList<>();

  void adicionarItem(ItemCardapio_D item) {
    itens.add(item);
  }

  void removerItem(int indice) {
    itens.remove(indice);
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio_D item : itens) {
      if(item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
        item.imprimir();
      }
    }
  }

}









