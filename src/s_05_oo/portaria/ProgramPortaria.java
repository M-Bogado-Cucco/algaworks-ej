package s_05_oo.portaria;

public class ProgramPortaria {

  public static void main(String[] args) {

    Visitante novoVisitante = new Visitante();
    novoVisitante.nome = "João";
    novoVisitante.idade = 19;

    if(novoVisitante.possuiAcessoRestrito()) {
      System.out.printf("Acesso não permitido para " +
              "menores de %d anos\n", Visitante.IDADE_MINIMA_ACESSO);
    }
    else {
      System.out.println("Acesso liberado");
    }
    CadastroPortaria cadastroPortaria = new CadastroPortaria();
    cadastroPortaria.cadastrar(novoVisitante, 10);

    // agora com a sobrecarga pode escolher entre os 2 métodos
    System.out.println("\nOpção 1: ");
    cadastroPortaria.cadastrar(novoVisitante);
    System.out.println("Opção 2: ");
    cadastroPortaria.cadastrar(novoVisitante, 2);
  }

}
