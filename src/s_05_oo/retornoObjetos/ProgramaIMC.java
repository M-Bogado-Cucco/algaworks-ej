package s_05_oo.retornoObjetos;

public class ProgramaIMC {

  public static void main(String[] args) {

    CalculadoraIMC calculadoraIMC;

    calculadoraIMC = new CalculadoraIMC();

    Paciente joao = new Paciente();

    joao.altura = 1.82;
    joao.peso = 125;

    IndiceMassaCorporal imc = calculadoraIMC.calcular(joao);

    if(imc.estaObeso()) {
      System.out.printf("Paciente com altura %.2f" +
              " e peso %.2f está com obesidade\n"
      , imc.altura, imc.peso);
    }

    System.out.printf("IMC: %.2f", imc.resultado);
  }

}
