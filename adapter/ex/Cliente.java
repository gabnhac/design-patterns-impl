package ex;

public class Cliente {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        INovoPagamento novoPagamento = new NovoPagamento(pagamento);

        novoPagamento.realizarPagamento(1347.7845);
    }
}
