package s_05_oo.companhia_aerea;

public class Aeronave {

  boolean ativo = true;
  int totalAssentos = 120;
  int assentosreservados;

  int calcularAssentosDisponiveis() {
        return totalAssentos - assentosreservados;
  }

  void desativar() {
    ativo = false;
  }

  void ativar() {
    ativo = true;
  }

  void reservarAssentos(int numeroAssentos) {
    if(ativo) {
      assentosreservados += numeroAssentos;
    }
    else {
      System.out.println("Aeronave está desativada" +
              ". Assentos não reservados.");
    }
  }

}
