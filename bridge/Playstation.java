package bridge;

public class Playstation implements IDispositivo {
    @Override
    public void playConteudo(String conteudo) {
        System.out.println("Tocando %s no playstation".formatted(conteudo));
    }
}
