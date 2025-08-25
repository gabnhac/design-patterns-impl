package ex;

public class NovoPagamento implements INovoPagamento{
    private Pagamento pagamento;

    public NovoPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    //Recebe novo valor com 4 casas decimais
    @Override
    public void realizarPagamento(double montante) {
        var roundedValue = Math.round((montante * 100)) / 100;
        //Arredonda e passa para o método antigo com 2 casas decimais
        System.out.println("Arredondando valor...");
        this.pagamento.processarPagamento(roundedValue);
    } 
}
