package factory;

public class Pix implements IPaymentCondition {
    @Override
    public int pay() {
        System.out.println("Processando pagamento pix...");
        return 1;
    }
}
