package br.com.matheus;

public class ComAlcool extends Barman{
    @Override
    Bebida buscarPedido(String oPedido) {
        if ("A".equals(oPedido)) {
            return new cerveja(350, "5%");
        } else {
            return new whisky(500, "45%");
        }
    }
}
