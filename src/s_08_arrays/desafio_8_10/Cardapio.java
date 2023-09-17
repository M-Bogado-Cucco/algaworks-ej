package s_08_arrays.desafio_8_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Cardapio {

  ItemCardapio[] itens = new ItemCardapio[0];

  void adicionarItem(ItemCardapio item) {
    this.itens = Arrays.copyOf(itens, itens.length + 1);
    itens[itens.length - 1] = item;
  }

  void removerItem(int indice) {
    ItemCardapio[] novosItens = new ItemCardapio[itens.length-1];

    // método antigo System.arraycopy (recebe 5 parâmetros)
    System.arraycopy(itens, 0, novosItens, 0, indice);
    System.arraycopy(itens, indice + 1, novosItens,
            indice, novosItens.length - indice);
    itens = novosItens;
  }

  void imprimirItensCardapio(double precoMinimo,
                             double precoMaximo) {
    for(ItemCardapio item : itens) {
      if(item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
        item.imprimir();
      }
    }
  }

  // Aula 8.14
  ArrayList<ItemCardapio> consultarItensPorPreco(
          double precoMinimo, double precoMaximo
  ) {
    ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

    for (ItemCardapio item : itens) {
      if(item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
        itensEncontrados.add(item);
      }
    }

    // errado (má prática)
    // return itensEncontrados.isEmpty() ? null : itensEncontrados;

    return itensEncontrados;

  }

}












