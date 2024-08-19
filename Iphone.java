package default;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música...");
    }

    @Override
    public void stop() {
        System.out.println("Parando reprodução...");
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada...");
    }

    // Implementação de NavegadorWeb
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a URL: " + url);
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Recarregando página...");
    }
}
