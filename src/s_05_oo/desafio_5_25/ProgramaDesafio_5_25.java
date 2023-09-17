package s_05_oo.desafio_5_25;

public class ProgramaDesafio_5_25 {

  public static void main(String[] args) {
    Funcionario func = new Funcionario();
    func.nome = "João Pedro";
    func.qtdFilhos = 2;

    ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
    contratoTrabalho.funcionario = func;
    contratoTrabalho.valHoraNormal = 51.8;
    contratoTrabalho.valHoraExtra = 60.5;

    FolhaPagamento folhaPagamento = new FolhaPagamento();

    Holerite holerite = folhaPagamento.calcularSalario(160, 10, contratoTrabalho);
    holerite.imprimir();
  }
}
