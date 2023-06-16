package br.com.desvgeeknerd.calculadora.classes;

public class Potenciacao extends CalculoMatematico {
    public Potenciacao(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    protected int doCalcular() {
        return (int) Math.pow(numero1, numero2);
    }
}
