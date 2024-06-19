package Set.OperacoesBasicas;

public class TesteConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Pedro",0);
        convidados.adicionarConvidado("Vinicius",1);
        convidados.adicionarConvidado("Sandra",2);
        convidados.adicionarConvidado("Barney",3);
        convidados.adicionarConvidado("Leticia",4);
        convidados.adicionarConvidado("Gabi",5);
        convidados.adicionarConvidado("Maria",5);

        convidados.exibirConvidados();
        convidados.contarConvidados();
        convidados.removerConvidadoPorCodigoConvite(9);
        convidados.contarConvidados();
    }
}
