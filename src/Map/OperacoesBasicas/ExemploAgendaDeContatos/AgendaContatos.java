package Map.OperacoesBasicas.ExemploAgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatosMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        verificacaoMapVazio();
        contatosMap.remove(nome);
    }

    public void exibirContatos(){
        verificacaoMapVazio();
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        return contatosMap.get(nome);
    }

    private void verificacaoMapVazio(){
        if(contatosMap.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
