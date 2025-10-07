package decorator;

import java.util.HashMap;
import java.util.Map;

public class PedidoBase implements IPedido {
    private Map<String, Double> produtos;

    // Inicializa o mapa no construtor
    public PedidoBase() {
        this.produtos = new HashMap<>();
    }

    @Override
    public void inserirItem(String nome, Double valor) {
        if(produtos.isEmpty()) {
            this.produtos = new HashMap<>();
            produtos.put("Café", 5.50);
        }

        this.produtos.put(nome, valor);
    }
    
    @Override
    public double getValorTotal() {
        return produtos.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String getDescricao() {
        return "Itens: " + produtos.keySet().toString();
    }
}