public class Telefone implements AparelhoTelefonico {
    @Override
    public void liga() {
        System.out.println("Ligando telefone");
    }

    @Override
    public void atende() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void enviarCorreioDeVoz() {
        System.out.println("Enviando correio de voz");
    }
}
