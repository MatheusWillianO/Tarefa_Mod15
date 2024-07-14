package br.com.matheus;

public class Demo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", true);
        Barman barman = getBarman(cliente);
        Bebida bebida = barman.criar(cliente.pedido());
    }

    private static Barman getBarman(Cliente cliente) {
        if (cliente.alcool()) {
            return new ComAlcool();
        } else {
            return new SemAlcool();
        }
    }
}
