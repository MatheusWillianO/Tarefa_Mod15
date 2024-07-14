package br.com.matheus;

public class SemAlcool extends Barman{
    @Override
    Bebida buscarPedido(String oPedido) {
        if ("A".equals(oPedido)) {
            return new cocaCola(1000, "0%");
        } else {
            return new sucoFruta(800, "0%");
        }
    }
}
