package s_05_oo.retornoObjetos;

public class CalculadoraIMC {

  IndiceMassaCorporal calcular(Paciente paciente) {
    double imcCalculado = paciente.peso / (paciente.altura*paciente.altura);

    IndiceMassaCorporal imc = new IndiceMassaCorporal();

    imc.resultado = imcCalculado;
    imc.peso = paciente.peso;
    imc.altura = paciente.altura;

    return imc;
  }
}
