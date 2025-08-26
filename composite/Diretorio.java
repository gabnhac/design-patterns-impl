import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Diretorio extends Arquivo {
    //Permite a composição de objetos simples e compostos
    //Tipo Arquivo em comum
    private List<Arquivo> arquivos = new ArrayList<Arquivo>();

    public Diretorio(String nome){
        super(nome);
    }

    @Override
    public void mostraEstrutura(String idt) {
        System.out.println("%s Diretorio: %s".formatted(idt, getNome()));
        for(Arquivo arquivo: arquivos){
            arquivo.mostraEstrutura(idt);
        }
    }

    public void add(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void remove(Arquivo arquivo){
        arquivos.remove(arquivo);
    }

    public Arquivo getChild(int indice){
        return arquivos.get(indice);
    }

    public double getTamanho(){
        double tamanho = 0;
        for(Arquivo arquivo: arquivos){
            tamanho += arquivo.getTamanho();
        }

        return tamanho;
    }

}
