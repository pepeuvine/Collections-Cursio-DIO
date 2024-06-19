package Lists.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {
    private List<Livro> catalogoLivros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogoLivros.add(livro);
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        listaVaziaVerificacao();

        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : catalogoLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        listaVaziaVerificacao();

        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro livro : catalogoLivros){
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public Optional<Livro> pesquisarPorTitulo(String titulo){
        listaVaziaVerificacao();

        for(Livro livro : catalogoLivros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return Optional.of(livro);
            }
        }
        System.out.println("Livro não encontrado!");
        return Optional.empty();
    }

    private void listaVaziaVerificacao(){
        if(catalogoLivros.isEmpty()){
            throw new RuntimeException("Lista vazia!");
        }
    }

}
