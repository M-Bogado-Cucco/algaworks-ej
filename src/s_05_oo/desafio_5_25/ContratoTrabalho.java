package s_05_oo.desafio_5_25;

public class ContratoTrabalho {

  Funcionario funcionario;
  double valHoraNormal;
  double valHoraExtra;

  boolean possuiAdicionalParaFilhos() {
    return funcionario.temFilhos();
  }
}
