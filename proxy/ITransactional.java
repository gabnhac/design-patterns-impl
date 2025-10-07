public interface ITransactional{
    // Método abstrato para transferência bancária
    public void transferir(double valor, Conta contaDestino);
}