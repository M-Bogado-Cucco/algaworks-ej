package s_05_oo.inicio;

public class Carro {
  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  double precoCompra;

  // carro tem 1 propriet. (composição)
  Pessoa proprietario;

  // aula 5.14 criando métodos
  double calcularValorRevenda() {
//    System.out.printf("""
//            Calcular valor de revenda:
//            Modelo: %s
//            Ano: %d
//            """, modelo, anoFabricacao);
    int tempoDeUsoEmAnos = calcTempoUsoAnos();
    int vidaUtilEmAnos = 20;
    double valRevenda = (precoCompra/ vidaUtilEmAnos)
            * (vidaUtilEmAnos - tempoDeUsoEmAnos);

    if(valRevenda < 0) {
      valRevenda = 0;
    }

    return valRevenda;
  }


  // aula 5.18
  int calcTempoUsoAnos() {
    return 2023 - anoFabricacao;
  }

  void imprimirDepreciacao() {
    double valorRevenda = calcularValorRevenda();
    int tempoDeUsoEmAnos = calcTempoUsoAnos();

    // exemplo usando o return
    if(precoCompra <= 0) {
      System.out.println("Preço de compra zerado não imprimimos" +
              "depreciação");
      return;
    }

    System.out.printf("Tempo de uso (anos): %d\n", tempoDeUsoEmAnos);
    System.out.printf("Valor de revenda: %6.2f\n", valorRevenda);
  }

  // aula 5.18 método calcular ipva
  double calcularIpva() {
    int tempoDeUso = calcTempoUsoAnos();
    if(tempoDeUso >= 10) {
      return 0;
    }
    return calcularValorRevenda() * 0.04;
  }

}

































