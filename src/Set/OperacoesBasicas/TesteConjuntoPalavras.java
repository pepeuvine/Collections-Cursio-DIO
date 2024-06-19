package Set.OperacoesBasicas;

public class TesteConjuntoPalavras {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("carro");
        conjuntoPalavrasUnicas.adicionarPalavra("avião");
        conjuntoPalavrasUnicas.adicionarPalavra("estojo");
        conjuntoPalavrasUnicas.adicionarPalavra("bola");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Bola"));

        conjuntoPalavrasUnicas.removerPalavra("BOLA");

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("bola"));
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
