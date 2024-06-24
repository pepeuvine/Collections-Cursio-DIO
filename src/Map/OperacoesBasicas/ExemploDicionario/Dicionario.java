package Map.OperacoesBasicas.ExemploDicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        verificacaoMapVazio();
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        verificacaoMapVazio();
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        verificacaoMapVazio();
        return dicionarioMap.get(palavra);
    }

    private void verificacaoMapVazio(){
        if(dicionarioMap.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
