package Set.Pesquisa;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        verificacaoSetVazio();

        for(Tarefa tarefa : listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                listaTarefas.remove(tarefa);
                System.out.println("Tarefa removida!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void exibirTarefa(){
        //verificacaoSetVazio();
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        verificacaoSetVazio();

        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : listaTarefas){
            if(tarefa.isStatus()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        verificacaoSetVazio();

        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : listaTarefas){
            if(!tarefa.isStatus())
                tarefasPendentes.add(tarefa);
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        verificacaoSetVazio();

        for(Tarefa tarefa : listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setStatus(true);
                return;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        verificacaoSetVazio();

        for(Tarefa tarefa : listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setStatus(false);
                return;
            }
        }
    }

    public void limparListaTarefas(){
        verificacaoSetVazio();
        listaTarefas.clear();
    }


    private void verificacaoSetVazio(){
        if(listaTarefas.isEmpty())
            throw new RuntimeException("Set é vazio!");
    }
}
