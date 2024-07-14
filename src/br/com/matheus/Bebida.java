package br.com.matheus;

public abstract class Bebida {
   private int mililitros;
   private String alcoolPorcentagem;

   public  Bebida(int mililitros, String alcoolPorcentagem) {
        this.mililitros = mililitros;
        this.alcoolPorcentagem = alcoolPorcentagem;
    }

    public void limparCopo() {
        System.out.println(getClass().getSimpleName());
        System.out.println("O copo está limpo.");
    }
    public void servir() {
        System.out.println("O copo está servido");
    }
}
