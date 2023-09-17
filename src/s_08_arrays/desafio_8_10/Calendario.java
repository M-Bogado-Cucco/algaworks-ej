package s_08_arrays.desafio_8_10;

public class Calendario {


//  static String obterNomeMes(int numeroMes) {
//    return switch (numeroMes) {
//      case 1 -> "Janeiro";
//      case 3 -> "Março";
//      case 6 -> "Junho";
//      case 9 -> "Setembro";
//      case 12 -> "Dezembro";
//      default -> null;
//    };
//  }

  static final String[] NOMES_MESES = {"Janeiro", "Fevereiro", "Marco", "Abril",
  "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

  static String obterNomeMes(int numeroMes) {
    if(numeroMes < 1 || numeroMes > 12) {
      return null;
    }
    return NOMES_MESES[numeroMes-1];
  }

  public static void main(String[] args) {
    String mes = Calendario.obterNomeMes(1);
    System.out.println(mes);
  }
}
