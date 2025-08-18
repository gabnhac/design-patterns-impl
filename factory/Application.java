package factory;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        HashMap<String, IPaymentCondition> paymentConditions = new HashMap<>();
        paymentConditions.put("Boleto", AbstractFactory.factoryMethod(new BoletoFactory()));
        paymentConditions.put("Pix", AbstractFactory.factoryMethod(new PixFactory()));
        paymentConditions.put("Paypal", AbstractFactory.factoryMethod(new PaypalFactory()));

        for (var entry : paymentConditions.entrySet()) {
            System.out.print(entry.getKey() + " - Resultado: ");
            entry.getValue().pay();
        }
    }
}
