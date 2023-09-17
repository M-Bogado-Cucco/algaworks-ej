package s_08_arrays.arraysDeObjetos;

import java.util.Arrays;

public class Turma {
  String identificacao;
  String nomeProfessora;
//  Aluno[] alunos;
  Aluno[] alunos = new Aluno[0];

  // método para aumentar 1 posição do array
  // copyOf (cria um novo objeto)
  void adicionarAluno(Aluno aluno) {
    this.alunos = Arrays.copyOf(this.alunos,
            this.alunos.length + 1);
    alunos[alunos.length - 1] = aluno;
  }

  void imprimirListaDeAlunos() {
    for (Aluno aluno : alunos) {
      if(aluno != null) {
        System.out.printf("%s (%d anos)\n", aluno.nome, aluno.idade);
      }
      else {
        System.out.println("vago");
      }
    }
  }

}
