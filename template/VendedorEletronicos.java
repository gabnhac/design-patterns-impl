public class VendedorEletronicos extends ProcessarPedido{
    @Override
    public void validaEntrega() {
        System.out.println("Calculando prazo de entrega...");
    }
    @Override
    public void validaPedido() {
         System.out.println("Validando pedido de eletrônico");
    }
}
