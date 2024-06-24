package Map.Pesquisa.ExercicioEstoqueDeProdutos;

public class TesteEstoqueProduto {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(123,"lEITE",5,5);
        estoqueProdutos.adicionarProduto(13,"SUCO",5,8);
        estoqueProdutos.adicionarProduto(1223,"BOLA",2,20);

        estoqueProdutos.exibirProdutos();
        System.out.println( estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
