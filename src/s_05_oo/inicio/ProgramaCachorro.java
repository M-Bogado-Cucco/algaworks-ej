package s_05_oo.inicio;

public class ProgramaCachorro {

  public static void main(String[] args) {

    Cachorro dog1 = new Cachorro();
    Cachorro dog2 = new Cachorro();

    dog1.nome = "Bradok";
    dog1.raca = "srd";
    dog1.idadeAnos = 2;
    dog1.sexo = 'M';

    dog2.nome = "lili";
    dog2.raca = "labrador";
    dog2.idadeAnos = 4;
    dog2.sexo = 'F';

    System.out.println("Cachorro 1: ");
    System.out.printf("Nome: %s\n", dog1.nome);
    System.out.printf("Sexo: %c\n", dog1.sexo);
    System.out.println("--------------");

    System.out.println("Cachorro 2: ");
    System.out.printf("Nome: %s\n", dog2.nome);
    System.out.printf("Sexo: %c\n", dog2.sexo);
    System.out.println("-------------");
  }
}
