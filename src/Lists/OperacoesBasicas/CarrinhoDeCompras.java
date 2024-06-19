package Lists.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaCompras = new ArrayList<>();

    public void adicionarItem(String nome, Double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        listaCompras.add(item);
    }

    public void removerItem(String nome){
        if(listaCompras.isEmpty()){
            throw new RuntimeException("Carrinho já está vazio!");
        }

        for(Item item : listaCompras){
            if(item.getNome().equalsIgnoreCase(nome)){
                listaCompras.remove(item);
            }
        }

    }

    public double calcularTotal(){
        double valorTotal = 0.0;
        for(Item item: listaCompras){
            valorTotal = valorTotal + (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listaCompras);
    }
}
