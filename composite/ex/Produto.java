package ex;

public class Produto extends Item {
    private double precoAssociado;

    public Produto(double precoAssociado){
        this.precoAssociado = precoAssociado;
    }

    public double getPrecoAssociado() {
        return precoAssociado;
    }

    public void setPrecoAssociado(double precoAssociado) {
        this.precoAssociado = precoAssociado;
    }
}
