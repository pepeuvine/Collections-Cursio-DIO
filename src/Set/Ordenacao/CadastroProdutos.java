package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(nome,cod,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        verificacaoSetVazio();

        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        verificacaoSetVazio();

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }

    private void verificacaoSetVazio(){
        if(produtos.isEmpty())
            throw new RuntimeException("Set vazio!");
    }
}
