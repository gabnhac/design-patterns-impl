public class VendedorRoupas extends ProcessarPedido {
    @Override
    public void validaEntrega() {
        System.out.println("Validando prazo de entrega...");
    }
    @Override
    public void validaPedido() {
        System.out.println("Validando pedido de roupas");
    }
}
