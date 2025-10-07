public class TransacionalProxy implements ITransactional {
    public Conta conta;

    public TransacionalProxy(Conta conta){
        this.conta = conta;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        System.out.println("Iniciando transferência...");

        try {
            this.conta.transferir(valor, contaDestino);
            System.out.println("Transfência concluída");
            System.out.println("Salvando em banco a transação");
        } catch (Exception e) {
            System.out.println("Problema identificado na operação. Executando rollback no banco...");
            System.out.println("Error: %s".formatted(e.getMessage()));
        }
    }
}
