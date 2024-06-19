package Lists.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        listaDeTarefas.add(tarefa);
    }

    public String removerTarefa(String descricao){
        if(listaDeTarefas.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }

        for (Tarefa tarefa: listaDeTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                listaDeTarefas.remove(tarefa);
                return "Tarefa removida.";
            }
        }
        return "Tarefa não existente!";
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaDeTarefas);
    }


}
