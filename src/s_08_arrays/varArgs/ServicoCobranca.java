package s_08_arrays.varArgs;

import java.util.Objects;

public class ServicoCobranca {

  void pagar(Fatura fatura, String[] emailsCobranca) {
    System.out.printf("Fatura %d, no valor total de R$" +
        "%.2f foi paga!\n",fatura.numero, fatura.valorTotal);

    for (String email : emailsCobranca) {
      System.out.printf("Fatura %d enviada para %s\n",
              fatura.numero, email);
    }
  }

  // varargs é apenas trocar o String[] por String...
  // e tem que ser o último a ser passado
  void pagar2(Fatura fatura, String emailCobranca, String... emailsAdicionais) {

//    if(emailsAdicionais.length == 0) {
//      throw new IllegalArgumentException("Informe ao menos 1 email de cobrança");
//    }

    Objects.requireNonNull(fatura, "Informe a fatura");
    Objects.requireNonNull(emailCobranca, "Informe o email de cobrança");


    System.out.println("\nUsando o varargs: ");
    System.out.printf("Fatura %d, no valor total de R$" +
            "%.2f foi paga!\n",fatura.numero, fatura.valorTotal);

    enviarNotificacao(fatura, emailCobranca);

    for (String email : emailsAdicionais) {
      System.out.printf("Fatura %d enviada para %s\n",
              fatura.numero, email);
    }
  }

  private void enviarNotificacao(Fatura fat, String email) {
    System.out.printf("Fatura %d enviada para %s\n", fat.numero, email);
  }
}
