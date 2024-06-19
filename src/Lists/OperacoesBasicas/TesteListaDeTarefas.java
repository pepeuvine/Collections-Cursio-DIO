package Lists.OperacoesBasicas;

public class TesteListaDeTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Assistir");
        listaTarefas.adicionarTarefa("Dormir");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();


        listaTarefas.removerTarefa("assistir");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
