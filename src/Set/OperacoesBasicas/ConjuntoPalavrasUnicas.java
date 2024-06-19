package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        verificacaoSetVazio();

        for(String p: palavrasSet){
            if(p.equalsIgnoreCase(palavra)){
                palavrasSet.remove(p);
                System.out.println("Removido!");
                return;
            }
        }
        System.out.println("Palavra não existente!");
    }

    public boolean verificarPalavra(String palavra){
        verificacaoSetVazio();

        for(String p: palavrasSet){
            if(p.equalsIgnoreCase(palavra)){
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        verificacaoSetVazio();
        System.out.println(palavrasSet);
    }


    private void verificacaoSetVazio(){
        if(palavrasSet.isEmpty())
            throw new RuntimeException("Set é vazio!");
    }
}
