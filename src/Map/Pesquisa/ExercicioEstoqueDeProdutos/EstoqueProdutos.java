package Map.Pesquisa.ExercicioEstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long,Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod,new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos(){
        verificacaoMapVazio();
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque(){
        verificacaoMapVazio();
        double valorTotalEstoque = 0;
        for(Produto produto : estoqueProdutos.values()){
            valorTotalEstoque += (produto.getPreco() * produto.getQuantidade());
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        verificacaoMapVazio();
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_NORMAL;
        for(Produto produto: estoqueProdutos.values()){
            if(produto.getPreco() > maiorPreco){
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();

            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        verificacaoMapVazio();
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;
        for(Produto produto : estoqueProdutos.values()){
            if(produto.getPreco() < menorPreco){
                produtoMaisBarato = produto;
                menorPreco = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        verificacaoMapVazio();
        Produto produtoMaiorQuantidadeValorNoEstoque  = null;
        double maiorValorTotalProdutoEstoque = 0d;
        for(Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()){
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque){
                maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    private void verificacaoMapVazio(){
        if(estoqueProdutos.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
