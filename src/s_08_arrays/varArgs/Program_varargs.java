package s_08_arrays.varArgs;

public class Program_varargs {

  public static void main(String[] args) {

    Fatura fatura = new Fatura();
    fatura.numero = 123;
    fatura.valorTotal = 1_293.55;

    ServicoCobranca svcoCobranca = new ServicoCobranca();

    String[] emailsCobranca = {"joao@algaworks.com",
    "maria@algaworks.com"};

    svcoCobranca.pagar(fatura, emailsCobranca);

    // pagando, sem enviar notificações
    svcoCobranca.pagar(fatura, new String[0]);// assim
    svcoCobranca.pagar(fatura, new String[]{}); // ou assim

    // usando o varargs
    svcoCobranca.pagar2(fatura, "joao2@algaworks.com",
            "maria2@algaworks.com", "jose@alga.com");
//    svcoCobranca.pagar2(fatura, "joao3@alga.com");
  }

}
