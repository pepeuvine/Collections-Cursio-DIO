package Map.Pesquisa.ExercicioContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        verificacaoMapVazio();
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        verificacaoMapVazio();
        System.out.println(contagemMap);
    }

    public String encontrarPalavraMaisFrequente(){
        verificacaoMapVazio();
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemMap.entrySet()){
            if (entry.getValue() < maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    private void verificacaoMapVazio(){
        if(contagemMap.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
