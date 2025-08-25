package bridge;

public class Musica extends Conteudo {
    private String titulo;

    public Musica(String titulo, IDispositivo dispositivo){
        super(dispositivo);
        this.titulo = titulo;
    }

    @Override
    public void play(){
        System.out.println("Musica: %s".formatted(titulo));
    }
}
