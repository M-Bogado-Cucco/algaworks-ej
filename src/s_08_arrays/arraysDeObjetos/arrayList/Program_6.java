package s_08_arrays.arraysDeObjetos.arrayList;

import java.util.ArrayList;

public class Program_6 {
// ArrayList não suporta tipos primitivos
  public static void main(String[] args) {
    ArrayList<String> alunos = new ArrayList<>();
    alunos.add("João");
    alunos.add("Maria");

    // auto complete, digitar 'alunos.fori'
    // foreach, digitar 'alunos.for'
    for (int i = 0; i < alunos.size(); i++) {
      String aluno = alunos.get(i);
      System.out.println(aluno);
    }

  }
}
