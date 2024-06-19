package Lists.Pesquisa;

import java.util.Optional;

public class TesteCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Titulo 1", "Pedro", 2002);
        catalogoLivros.adicionarLivro("Titulo 1", "Vinicius", 2009);
        catalogoLivros.adicionarLivro("Titulo 3", "Pedro", 2019);

        System.out.println(catalogoLivros.pesquisaPorAutor("pedro"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2121,2522));
        catalogoLivros.pesquisarPorTitulo("titulo 1").ifPresent(System.out::println);
    }
}
