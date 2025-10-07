public abstract class ProcessarPedido{

    public void processaPedido(){
        this.login();
        this.validaPedido();
        this.pagamento();
        this.validaEntrega();
    }

    public abstract void validaEntrega();
    public abstract void validaPedido();

    public void login(){
        System.out.println("Entrando na conta...");
    }
    
    public void pagamento(){
        System.out.println("Efetuando pagamento...");
    }
}