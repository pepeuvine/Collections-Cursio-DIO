package Map.Ordenacao.ExemploLivrariaOnline;

public class TesteLivariaOnline {
    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = getLivrariaOnline();

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));

        System.out.println("Livros ordenados por preço:");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("Livro mais barato:");
        System.out.println(livrariaOnline.exibirLivroMaisBarato());
        System.out.println("Livro mais caro:");
        System.out.println(livrariaOnline.obterLivroMaisCaro());

        livrariaOnline.removerLivro(livrariaOnline.obterLivroMaisCaro().getTitulo());
        System.out.println("Novo livro mais caro:");
        System.out.println(livrariaOnline.obterLivroMaisCaro());

    }

    private static LivrariaOnline getLivrariaOnline() {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6","Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 49d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);
        return livrariaOnline;
    }
}
