package decorator;

import java.util.HashMap;
import java.util.Map;

public class BaseDecoratorPedido implements IPedido {
    private IPedido componente;

    // Inicializa o mapa no construtor
    public BaseDecoratorPedido(IPedido componente) {
        this.componente = componente;
    }

    @Override
    public void inserirItem(String nome, Double valor) {
        componente.inserirItem(nome, valor);
    }
    
    @Override
    public double getValorTotal() {
        return componente.getValorTotal();
    }

    @Override
    public String getDescricao() {
        return componente.getDescricao();
    }
}