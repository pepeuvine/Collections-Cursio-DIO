package Map.Ordenacao.ExemploLivrariaOnline;


import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaMap.put(link, new Livro(titulo,autor,preco));
    }

    public void removerLivro(String titulo){
        verificacaoMapVazio();
        for(Map.Entry<String,Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livrariaMap.remove(entry.getKey());
                System.out.println("Livro removido!");
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        verificacaoMapVazio();
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livrosParaOrdenar, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenar){
            livrosOrdenados.put(entry.getKey(),entry.getValue());
        }

        System.out.println(livrosOrdenados);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        verificacaoMapVazio();

        List<Livro> livrosAutor = new ArrayList<>();

        for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosAutor.add(entry.getValue());
            }
        }
        return livrosAutor;
    }

    public Livro obterLivroMaisCaro(){
        verificacaoMapVazio();

        double precoLivro = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()){
            if(entry.getValue().getPreco() > precoLivro){
                livroMaisCaro = entry.getValue();
                precoLivro = entry.getValue().getPreco();
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato(){
        verificacaoMapVazio();

        double precoLivro = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()){
            if(entry.getValue().getPreco() < precoLivro){
                livroMaisBarato = entry.getValue();
                precoLivro = entry.getValue().getPreco();
            }
        }
        return livroMaisBarato;
    }

    private void verificacaoMapVazio(){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("Map é vazio!");
    }
}
