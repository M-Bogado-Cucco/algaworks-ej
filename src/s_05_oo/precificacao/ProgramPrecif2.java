package s_05_oo.precificacao;

public class ProgramPrecif2 {

  public static void main(String[] args) {
    Produto prod1 = new Produto();
    Produto prod2 = new Produto();

    // variável de classe deve ser acessada pela classe
    //prod1.custoEmbalagem = 10; // errado,
//    Produto.custoEmbalagem = 12;


//    prod2.alterarCustoEmbalagem(20);
    Produto.alterarCustoEmbalagem(20); // usando o método estático

//    prod2.imprimirCustoEmbalagem(); // 12
    Produto.imprimirCustoEmbalagem(); // usando o método estático
  }
}
