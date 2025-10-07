public class Conta implements ITransactional{
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de transferência deve ser maior que 0.");
        }

        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        this.saldo -= valor;
        contaDestino.saldo += valor;
    }

}
