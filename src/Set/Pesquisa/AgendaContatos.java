package Set.Pesquisa;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        verificacaoSetVazio();
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        verificacaoSetVazio();

        Set<Contato> contatosEncontrados = new HashSet<>();
        for (Contato contato : contatos){
            if(contato.getNome().startsWith(nome)){
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        verificacaoSetVazio();

        for (Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroDeTelefone(novoNumero);
            }
        }
    }

    private void verificacaoSetVazio(){
        if(contatos.isEmpty())
            throw new RuntimeException("Set é vazio!");
    }
}
