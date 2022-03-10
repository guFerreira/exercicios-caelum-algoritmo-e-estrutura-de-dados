package armazenamentoSequencial;

public class Vetor implements IVetor{
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    @Override
    public void adiciona(Aluno aluno) {
        //mais eficiente que a opção comentada, pois não precisa percorrer toda a lista
        //para saber onde inserir
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
        /*for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }*/

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
        return this.totalDeAlunos;
    }


    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.alunos[i]);
            builder.append(", ");
        }
        builder.append(this.alunos[this.totalDeAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }
}
