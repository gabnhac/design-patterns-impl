package decorator;

public class AdicionaisCafe extends BaseDecoratorPedido {

    public AdicionaisCafe(IPedido componente){
        super(componente);
    }

    @Override
    public void inserirItem(String nome, Double valor) {
        super.inserirItem(nome, valor);
        super.inserirItem("Açucar", 0.50);
        super.inserirItem("Chocolate", 3.00);
    }
}
