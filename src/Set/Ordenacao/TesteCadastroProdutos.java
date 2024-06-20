package Set.Ordenacao;

public class TesteCadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(223,"Escova",8.70,2);
        produtos.adicionarProduto(120,"Chinelo",17.99,1);
        produtos.adicionarProduto(115,"Bola",40.0,1);
        produtos.adicionarProduto(223,"Escova teste",8.70,1);

        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
