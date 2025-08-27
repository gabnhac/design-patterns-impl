package ex;

import java.util.ArrayList;
import java.util.List;

public class CaixaProdutos extends Item{
    private List<Item> itens = new ArrayList<Item>();
    private double desconto = 0;

    public CaixaProdutos(){

    }

    public void addItem(Item item){
        itens.add(item);
        if(item instanceof Produto) this.desconto += 5;
    }

    public void removeItem(Item item){
        itens.remove(item);
    }

    @Override
    public double getValorTotal() {
        double valorTotal = 0;

        for(Item item: itens){
            if(item instanceof CaixaProdutos){
                valorTotal += item.getValorTotal();
                continue;
            }

            valorTotal += item.getValorTotal() - (item.getValorTotal() * (desconto / 100));
        }

        return valorTotal;
    }
}
