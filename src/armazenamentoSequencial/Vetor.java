package armazenamentoSequencial;

public class Vetor implements IVetor{
    private Aluno[] alunos = new Aluno[100];

    @Override
    public void adiciona(Aluno aluno) {
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }

    }

    @Override
    public void adiciona(int posicao, Aluno aluno) {
        
    }

    @Override
    public Aluno pega(int posicao) {
        return null;
    }

    @Override
    public void remove(int posicao) {

    }

    @Override
    public boolean contem(Aluno aluno) {
        return false;
    }

    @Override
    public int tamanho() {
        return 0;
    }
}
