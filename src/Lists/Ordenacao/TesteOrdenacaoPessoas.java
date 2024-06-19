package Lists.Ordenacao;

import java.sql.SQLOutput;

public class TesteOrdenacaoPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
        listaPessoas.adicionarPessoa("Pedro", 20, 1.70);
        listaPessoas.adicionarPessoa("Sandra", 50, 1.54);
        listaPessoas.adicionarPessoa("Leticia", 24, 1.62);

        System.out.println("ORIGINAL:");
        System.out.println(listaPessoas.exibirLista());
        System.out.println("\n\nORDENAÇÃO IDADE:");
        System.out.println(listaPessoas.ordenarPorIdade());
        System.out.println("\n\nDEPOIS ORDENAÇÃO IDADE:");
        System.out.println(listaPessoas.exibirLista());
        System.out.println("\n\nORDENAÇÃO ALTURA:");
        System.out.println(listaPessoas.ordenarPorAltura());
        System.out.println("\n\nDEPOIS ORDENAÇÃO ALTURA:");
        System.out.println(listaPessoas.exibirLista());
    }
}
