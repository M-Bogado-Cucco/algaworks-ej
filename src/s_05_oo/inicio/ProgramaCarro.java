package s_05_oo.inicio;

public class ProgramaCarro {

  public static void main(String[] args) {

    Pessoa eu = new Pessoa(); // não armazena objeto, faz referência ao objeto
    eu.nome = "Marcelo Bogado";
    eu.cpf = "111.222.333-44";
    eu.anoNascimento = 1980;

    Carro meuCarro = new Carro(); // não armazena objeto, faz referência ao objeto

    meuCarro.anoFabricacao = 2021;
    meuCarro.cor = "Preto";
    meuCarro.fabricante = "BMW";
    meuCarro.modelo = "Mercedes";
    meuCarro.proprietario = eu; // mesmo objeto, não gasta mais memória
    meuCarro.precoCompra = 120000;

    double ipva = meuCarro.calcularIpva();
    System.out.println(ipva);

    meuCarro.imprimirDepreciacao();

    //proprietário
//    meuCarro.proprietario = new Pessoa();
//    meuCarro.proprietario.nome = "Marcelo Bogado";
//    meuCarro.proprietario.cpf = "111.222.333-44";
//    meuCarro.proprietario.anoNascimento = 1980;

//    System.out.println("Meu carro");
//    System.out.println("-----------");
//    System.out.printf("Modelo: %s\n", meuCarro.modelo);
//    System.out.printf("Ano: %d\n", meuCarro.anoFabricacao);
//    System.out.printf("Proprietário: %s\n", meuCarro.proprietario.nome);
//
    Pessoa voce = new Pessoa();
    voce.nome = "João das Couves";
    voce.anoNascimento = 1992;
    voce.cpf = "999.888.777-65";
//
    Carro seuCarro = new Carro();
    seuCarro.anoFabricacao = 2022;
    seuCarro.cor = "Branco";
    seuCarro.fabricante = "BMW";
    seuCarro.modelo = "X6";
    seuCarro.proprietario = voce;
    seuCarro.precoCompra = 980000;

    seuCarro.calcularValorRevenda();

//    System.out.println("\nSeu carro");
//    System.out.println("-----------");
//    System.out.printf("Modelo: %s\n", seuCarro.modelo);
//    System.out.printf("Ano: %d\n", seuCarro.anoFabricacao);
//    System.out.printf("Proprietário: %s\n", seuCarro.proprietario.nome);

      seuCarro.imprimirDepreciacao();

  }

}














































