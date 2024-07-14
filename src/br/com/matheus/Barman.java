package br.com.matheus;

public abstract class Barman {

    public Bebida criar(String oPedido) {
        Bebida bebida = buscarPedido(oPedido);
        bebida = prepararBebida(bebida);
        return bebida;
    }

    private Bebida prepararBebida(Bebida bebida) {
        bebida.limparCopo();
        bebida.servir();
        return bebida;
    }

    abstract Bebida buscarPedido(String oPedido);
}
