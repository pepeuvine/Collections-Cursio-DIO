package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        verificacaoSetVazio();

        for (Convidado convidado : convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidados.remove(convidado);
                System.out.println("Convidado removido!");
                return;
            }
        }
        System.out.println("Convidado não encontrado!");
    }

    public void contarConvidados(){
        System.out.println(convidados.size());
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    private void verificacaoSetVazio(){
        if(convidados.isEmpty())
            throw new RuntimeException("Set é vazio!");
    }
}
