package decorator;

public class AdicionaisGerais extends BaseDecoratorPedido{
    public AdicionaisGerais(IPedido componente){
        super(componente);
    }

    @Override
    public void inserirItem(String nome, Double valor) {
        super.inserirItem(nome, valor);
        super.inserirItem("Biscoito", 4.00);
        super.inserirItem("Bolo", 10.00);
    }
}
