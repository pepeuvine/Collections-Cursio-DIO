package Set.Ordenacao;

public class TesteListaAlunos {
    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();
        alunos.adicionarAluno("Pedro", 123L,8.0);
        alunos.adicionarAluno("Gustavo", 18432L,8.7);
        alunos.adicionarAluno("Vinicius", 220L,6.0);
        alunos.adicionarAluno("Lucas", 11412L,9.8);
        System.out.println(alunos.exibirAlunos());

        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());
    }
}
