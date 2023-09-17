package s_05_oo.precificacao;

public class ProgramPrecif3 {

  public static void main(String[] args) {
    Produto.alterarCustoEmbalagem(10.00);

    Produto prod3 = new Produto();
    prod3.alterarPrecoCusto(100.25);

    System.out.printf("Total de custos: %.2f\n",
            Produto.calcularCustosTotais(prod3));
  }
}
