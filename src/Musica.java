public class Musica implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void SelecionrMusica() {
        System.out.println("Selecionando música");
    }
}
