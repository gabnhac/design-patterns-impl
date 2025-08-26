public class Binario extends Arquivo { 
    private double tamanho;

    public Binario(String nome, double tamanho){
        super(nome);
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void mostraEstrutura(String idt) {
        System.out.println("Binário".formatted(getNome()));
    }

}
