package decorator;

public class Cliente {
    public static void main(String[] args) {
        IPedido pedido = new PedidoBase();

        pedido = new AdicionaisCafe(pedido);
        pedido.inserirItem("Mel", 1.00);

        pedido = new AdicionaisGerais(pedido);
        pedido.inserirItem("Pão", 1.00);


        System.out.println("TOTAL: %s".formatted(pedido.getValorTotal()));
        System.out.println("PRODUTOS: %s".formatted(pedido.getDescricao()));
    }
}
