package bridge;

public class Podcast extends Conteudo {
    private String nome;

    public Podcast(String titulo, IDispositivo dispositivo){
        super(dispositivo);
        this.nome = nome;
    }

    @Override
    public void play(){
         System.out.println("Podcast: %s".formatted(nome));
    }
}
