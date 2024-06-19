package Lists.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        verificacaoListaVazia();

        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        verificacaoListaVazia();

        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new OrdernarPorAltura());
        return pessoasPorAltura;
    }

    public List<Pessoa> exibirLista(){
        verificacaoListaVazia();
        return listaPessoas;
    }

    private void verificacaoListaVazia(){
        if(listaPessoas.isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
    }

}