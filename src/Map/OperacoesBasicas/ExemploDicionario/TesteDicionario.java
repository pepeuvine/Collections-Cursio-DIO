package Map.OperacoesBasicas.ExemploDicionario;

public class TesteDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("caneta", "Utensílio que contém um depósito de tinta, usado para escrever, desenhar ou rabiscar");
        dicionario.adicionarPalavra("lápis", "Artefacto , geralmente de madeira, cilíndrico, comprido e fino, cujo interior contém uma barra de grafite para escrever ou desenhar");
        dicionario.adicionarPalavra("borracha", "substância elástica obtida pela coagulação do látex");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("caneta");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("borracha"));
    }
}
