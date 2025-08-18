//Estratégia concreta
public class ComDescontoStrategy implements IDesconto{
    @Override
    public double aplicaDesconto(double preco){
        return preco*0.5;
    }
}