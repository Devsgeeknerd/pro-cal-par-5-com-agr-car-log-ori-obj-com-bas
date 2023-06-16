package br.com.devsgeeknerd.calculadora.fabricas;

import br.com.devsgeeknerd.calculadora.classes.Adicao;
import br.com.devsgeeknerd.calculadora.classes.Divisao;
import br.com.devsgeeknerd.calculadora.classes.Multiplicacao;
import br.com.devsgeeknerd.calculadora.classes.Potenciacao;
import br.com.devsgeeknerd.calculadora.classes.Subtracao;
import br.com.devsgeeknerd.interfaces.CalculadorMatematico;

public class FabricaCalculosMatematicos {
    public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo) {
        if (calculo.equals("+")) {
            return new Adicao(numero1, numero2);
        } else if (calculo.equals("-")) {
            return new Subtracao(numero1, numero2);
        } else if (calculo.equals("*")) {
            return new Multiplicacao(numero1, numero2);
        } else if (calculo.equals("/")) {
            return new Divisao(numero1, numero2);
        } else if (calculo.equals("^")) {
            return new Potenciacao(numero1, numero2);
        } else {
            return null;
        }
    }
}
