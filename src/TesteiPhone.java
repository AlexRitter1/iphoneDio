public class TesteiPhone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando reprodutor musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando aparelho telefônico
        meuIphone.ligar("+551199999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando navegador de internet
        meuIphone.exibirPagina("www.openai.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}