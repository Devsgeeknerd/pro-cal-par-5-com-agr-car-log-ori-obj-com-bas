package br.com.devsgeeknrd.calculadora.app;

import br.com.devsgeeknerd.calculadora.fabricas.FabbricaCalculosMatematico;
import br.com.devsgeeknerd.calculadora.fabricas.FabricaCalculosMatematicos;
import br.com.devsgeeknerd.interfaces.CalculadorMatematico;

public class Programa {
    public static void main(String[] args) {
        String calculo = "+";
        int numero1 = 2;
        int numero2 = 2;

        FabricaCalculosMatematicos fabrica = new FabricaCalculosMatematicos();
        CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);

        if (calculador != null) {
            System.out.println(calculador.calcular());
        } else {
            System.out.println("Calculo invalido");
        }
    }
}
