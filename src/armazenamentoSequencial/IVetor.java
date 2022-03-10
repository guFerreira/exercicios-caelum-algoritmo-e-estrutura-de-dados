package armazenamentoSequencial;

public interface IVetor {
    public void adiciona(Aluno aluno);
    public void adiciona(int posicao, Aluno aluno);
    public Aluno pega(int posicao);
    public void remove(int posicao);
    public boolean contem(Aluno aluno);
    public int tamanho();
}
