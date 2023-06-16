package br.com.devsgeeknerd.calculadora.classes;

public class Multiplicacao extends CalculoMatematico {
    public Multiplicacao(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    protected int doCalcular() {
        return numero1 * numero2;
    }
}
