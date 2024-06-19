package Set.Pesquisa;

import java.sql.SQLOutput;
import java.util.List;

public class TesteListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("QUANTIDADE TAREFAS: ");
        listaTarefas.contarTarefas();
        System.out.println("-----------------------");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Dormir");
        listaTarefas.adicionarTarefa("Academia");
        listaTarefas.adicionarTarefa("Jogar");
        listaTarefas.adicionarTarefa("Assistir");
        listaTarefas.adicionarTarefa("Banhar");


        System.out.println("QUANTIDADE TAREFAS: ");
        listaTarefas.contarTarefas();
        System.out.println("-----------------------");
        System.out.println("TAREFAS: ");
        listaTarefas.exibirTarefa();
        System.out.println("-----------------------");
        listaTarefas.marcarTarefaConcluida("estudar");
        listaTarefas.marcarTarefaConcluida("academia");
        System.out.println("TAREFAS CONCLUIDAS:");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println("-----------------------");
        System.out.println("TAREFAS PENDENTES:");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println("-----------------------");

        listaTarefas.removerTarefa("JOGAR");
        System.out.println("TAREFAS: ");
        listaTarefas.exibirTarefa();
        System.out.println("-----------------------");

        System.out.println("MARCANDO PENDENTE");
        listaTarefas.marcarTarefaPendente("academia");
        System.out.println("-----------------------");

        listaTarefas.limparListaTarefas();
        System.out.println("TAREFAS: ");
        listaTarefas.exibirTarefa();
        System.out.println("-----------------------");
    }
}
