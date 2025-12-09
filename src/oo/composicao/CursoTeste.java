package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Elson");
        Aluno aluno2 = new Aluno("Samara");
        Aluno aluno3 = new Aluno("Nayla");

        Curso curso1 = new Curso("ingles");
        Curso curso2 = new Curso("Matematica");
        Curso curso3 = new Curso("portugues");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno1);

        for(Aluno aluno: curso1.alunos){
            System.out.println("Curso: " + curso1.nome );
            System.out.println("Aluno matriculado: " + aluno.nome);
            System.out.println();
        }
    }
}
