package s_05_oo.desafio_5_25;

public class FolhaPagamento {

  Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
    Holerite holerite = new Holerite();
    holerite.funcionario = contrato.funcionario;
    holerite.valorTotalHorasNormais = horasNormais * contrato.valHoraNormal;
    holerite.valorTotalHorasExtras = horasExtras * contrato.valHoraExtra;

    double subtotal = holerite.valorTotalHorasNormais +
            holerite.valorTotalHorasExtras;

    if(contrato.possuiAdicionalParaFilhos()) {
      holerite.adicionalParaFilhos = subtotal * 0.10;
    }

    return holerite;
  }
}
