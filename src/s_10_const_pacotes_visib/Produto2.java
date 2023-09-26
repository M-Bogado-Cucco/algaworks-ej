package s_10_const_pacotes_visib;

// Exemplo com mais de 1 classe no mesmo arquovo
public class Produto2 {

  String nome = "Suco de uva";
  int qtd = 12;

  Produto2(String nome, int qtd ) {
    this.nome = nome;
    this.qtd = qtd;
  }


  public void imprimir() {
    System.out.printf("Nome: %s, Quantidade: %d", nome, qtd);
  }
}

// somente classes não públicas podem ficar no mesmo arquivo de classes públicas
class Fornecedor {

}

class Categoria {

}

class principal {
  public static void main(String[] args) {
    Produto2 p2 = new Produto2("Suco de Uva", 13);
    p2.imprimir();

    String aula = "Aula 10.17";
    aula.toUpperCase(); //mostrando a documentação do java
  }
}


