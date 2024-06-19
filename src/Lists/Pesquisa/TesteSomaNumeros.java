package Lists.Pesquisa;

public class TesteSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros listaSomaNumeros = new SomaNumeros();
        listaSomaNumeros.adicionarNumero(4);
        listaSomaNumeros.adicionarNumero(2);
        listaSomaNumeros.adicionarNumero(-1);
        listaSomaNumeros.adicionarNumero(8);
        listaSomaNumeros.adicionarNumero(5);

        System.out.println(listaSomaNumeros.exibirNumeros());

        System.out.println("MAIOR: " + listaSomaNumeros.encontrarMaiorNumero());
        System.out.println("MENOR: " + listaSomaNumeros.encontrarMenorNumero());
        System.out.println("SOMA: " + listaSomaNumeros.calcularSoma());

    }
}
