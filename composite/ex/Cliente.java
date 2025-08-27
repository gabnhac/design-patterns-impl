package ex;

public class Cliente {
    public static void main(String[] args) {
        Item p1 = new Produto(20);
        Item p2 = new Produto(40);
        Item p3 = new Produto(60);
        Item c1 = new CaixaProdutos();
        Item c2 = new CaixaProdutos();


        if(c1 instanceof CaixaProdutos && c2 instanceof CaixaProdutos){
            CaixaProdutos c1Parsed = (CaixaProdutos) c1;
            c1Parsed.addItem(p1);
            c1Parsed.addItem(p2);

            CaixaProdutos c2Parsed = (CaixaProdutos) c2;
            c2Parsed.addItem(p3);

            c1Parsed.addItem(c2Parsed);

            System.out.println("Valor total caixa 1: %s".formatted(c1.getValorTotal()));
            System.out.println("Valor total caixa 2: %s".formatted(c2.getValorTotal()));
        }

    }
}
