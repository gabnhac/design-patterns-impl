package ex;

public abstract class Item {
    private double tamanho;

    public double getTamanho() {
        return tamanho;
    }
    
    public abstract double getValorTotal();
}
