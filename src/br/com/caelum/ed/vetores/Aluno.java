package br.com.caelum.ed.vetores;

public class Aluno {
    private String nome;


    public Aluno() {
    }
    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
