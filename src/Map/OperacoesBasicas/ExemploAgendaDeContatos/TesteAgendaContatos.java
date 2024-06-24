package Map.OperacoesBasicas.ExemploAgendaDeContatos;

public class TesteAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Pedro",9875);
        agendaContatos.adicionarContato("Vinicius",43242);
        agendaContatos.adicionarContato("Sandra",1003);
        agendaContatos.adicionarContato("Leticia",112);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Vinicius");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Leticia"));

    }
}
