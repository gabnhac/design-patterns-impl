public class Main {
    public static void main(String[] args) {
        Conta contaA = new Conta(1000);
        Conta contaB = new Conta(500);

        TransacionalProxy proxy = new TransacionalProxy(contaA);

        System.out.println("Saldo inicial da contaA: %s".formatted(contaA.getSaldo()));
        System.out.println("Saldo inicial da contaB: %s".formatted(contaB.getSaldo()));

        proxy.transferir(1001, contaB);

        System.out.println("Saldo inicial da contaA: %s".formatted(contaA.getSaldo()));
        System.out.println("Saldo inicial da contaB: %s".formatted(contaB.getSaldo()));
    }
}
