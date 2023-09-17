package s_05_oo.portaria;

public class Visitante {

   // static : da classe, compartilhada entre todos os objetos criados
   // final: constante
   static final int IDADE_MINIMA_ACESSO = 18;

   String nome;
   int idade;

   boolean possuiAcessoRestrito() {
      return idade < IDADE_MINIMA_ACESSO;
   }

}
