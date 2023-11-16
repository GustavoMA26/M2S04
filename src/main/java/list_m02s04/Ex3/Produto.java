package list_m02s04.Ex3;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        return valor + valorImposto;
    }
}
