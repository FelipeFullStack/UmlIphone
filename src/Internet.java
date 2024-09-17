public class Internet implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void abrirPagina() {
        System.out.println("Abrindo página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}