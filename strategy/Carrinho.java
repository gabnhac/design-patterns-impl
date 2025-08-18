public class Carrinho{
    private IDesconto estrategiaDesconto;

    public void setEstrategiaDesconto(IDesconto estrategia){
        this.estrategiaDesconto = estrategia;
    }

    public double getPrecoFinal(double precoSemDesconto){
        return estrategiaDesconto.aplicaDesconto(precoSemDesconto);
    }
}