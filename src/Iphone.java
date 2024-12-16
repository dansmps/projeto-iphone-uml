public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausads");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

  
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
