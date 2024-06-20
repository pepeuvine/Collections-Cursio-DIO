package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        verificacaoSetVazio();

        for(Aluno aluno: alunosSet){
            if(aluno.getMatricula() == matricula){
                alunosSet.remove(aluno);
                System.out.println("Aluno removido!");
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }

    public Set<Aluno> exibirAlunosPorNome(){
        verificacaoSetVazio();

        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        verificacaoSetVazio();

        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunosPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        verificacaoSetVazio();
        return alunosSet;
    }

    private void verificacaoSetVazio(){
        if(alunosSet.isEmpty())
            throw new RuntimeException("Set vazio!");
    }
}
