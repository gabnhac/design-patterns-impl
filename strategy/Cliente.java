public class Cliente {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        
        double precoOriginal = 100;

        carrinho.setEstrategiaDesconto(new DescontoNatalStrategy());

        var precoComDesconto = carrinho.getPrecoFinal(precoOriginal);
        System.out.println("Preco final: %s".format(Double.toString(precoComDesconto)));
    }
}
