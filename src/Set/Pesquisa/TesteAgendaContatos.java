package Set.Pesquisa;

public class TesteAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("Pedro Prado",2115);
        contatos.adicionarContato("Vinicius",3443);
        contatos.adicionarContato("Harry",222);
        contatos.adicionarContato("Malone",123);
        contatos.adicionarContato("Pedro Fake",157);

        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("Malone"));
        contatos.atualizarNumeroContato("Harry",453);
        System.out.println(contatos.pesquisarPorNome("Pedro"));

    }
}
