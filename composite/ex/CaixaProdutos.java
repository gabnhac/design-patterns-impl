package ex;

import java.util.ArrayList;
import java.util.List;

public class CaixaProdutos extends Item{
    List<Item> itens = new ArrayList<Item>();

    public void addItens(Item item){
        itens.add(item);
    }

    public void removeItens(Item item){
        itens.remove(item);
    }

    public double valorTotalCaixa(){
        
    }
}
