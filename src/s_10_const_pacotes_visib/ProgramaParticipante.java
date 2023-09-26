package s_10_const_pacotes_visib;

public class ProgramaParticipante {

  public static void main(String[] args) {

  Participante participante = new Participante("Pedro", 78);

    System.out.printf("Participante: %s," +
                    " Pontos: %d\n",
            participante.nome, participante.saldoDePontos);

    Participante participante1 = new Participante("André", -5);

    System.out.printf("\nParticipante: %s," +
                    " Pontos: %d",
            participante1.nome, participante1.saldoDePontos);

    participante1.creditarPontos(5);
    System.out.printf("\nSaldo de pontos do André atualizado: %d", participante1.saldoDePontos);
  }
}
