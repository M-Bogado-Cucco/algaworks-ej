package s_05_oo.precificacao;

public class Produto {

  //static faz com que seja uma variável de classe e não de instancia
  static double custoEmbalagem; //fica em itálico
  double precoCusto;
  double precoVenda;

  // método que altera a variável estática (não recomendado)
 //recomendado criar métodos estáticos(que não são de instância) e sim da classe
//  void alterarCustoEmbalagem(double custoEmbalagem) {
//    Produto.custoEmbalagem = custoEmbalagem;
//  }

  // aula 5.34 método estático acessando membro de instância
  // tem que passar uma instância como parâmetro
  static double calcularCustosTotais(Produto produto) {
    return produto.precoCusto + Produto.custoEmbalagem; // variável de instãncia e de classe
  }

  // método estático
  static void alterarCustoEmbalagem(double custoEmbalagem) {
    Produto.custoEmbalagem = custoEmbalagem;
  }

  void alterarPrecoCusto(double precoCusto) {
    this.precoCusto = precoCusto;
  }

  // método estático
  static void imprimirCustoEmbalagem() {
    System.out.printf("Custo com embalagem: %.2f\n", custoEmbalagem);
  }

}
























