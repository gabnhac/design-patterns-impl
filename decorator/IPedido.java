package decorator;

public interface IPedido {
    void inserirItem(String nome, Double valor);
    double getValorTotal();
    String getDescricao();
}
