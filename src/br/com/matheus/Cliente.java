package br.com.matheus;

public class Cliente {

    private String pedido;
    private Boolean alcool;

    public Cliente(String pedido, Boolean alcool) {
        this.pedido = pedido;
        this.alcool = alcool;
    }

    public Boolean alcool() {
        return alcool;
    }

    public String pedido() {
        return pedido;
    }
}
