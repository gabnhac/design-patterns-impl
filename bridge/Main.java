package bridge;

public class Main {
    public static void main(String[] args) {
        IDispositivo android = new Smartphone();
        IDispositivo playstation = new Playstation();

        Conteudo musica = new Musica("Just awake", android);
        Conteudo musica2 = new Musica("Paradise", playstation);
        Conteudo podcast = new Podcast("Economia", android);

        musica.play();
    }
}
