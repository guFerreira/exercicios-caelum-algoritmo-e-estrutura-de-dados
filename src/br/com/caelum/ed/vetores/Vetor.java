package br.com.caelum.ed.vetores;

public class Vetor implements IVetor<Aluno>{
    private Aluno[] alunos = new Aluno[100000];
    private int totalDeAlunos = 0;

    @Override
    public void adiciona(Aluno aluno) {
        this.alocarEspaco();
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

    public void adicionaInicioCapitulo(Aluno aluno) {
        this.alocarEspaco();
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }

    }

    @Override
    public void adiciona(int posicao, Aluno aluno) {
        this.alocarEspaco();
        if (this.posicaoValida(posicao)){
            //realoco todos à direita da posição especificada
            for(int i = this.totalDeAlunos - 1 ; i >= posicao ; i--){
                this.alunos[i+1] = this.alunos[i];
            }
            this.alunos[posicao] = aluno;
            this.totalDeAlunos++;
        }else{
            new IllegalArgumentException("Posicao inserida é inválida");

        }
    }

    private boolean posicaoValida(int posicao){
        if(posicao >= 0 && posicao <= this.totalDeAlunos){
            return true;
        }
        throw new IllegalArgumentException("Posicao informada não é válida");

    }

    private boolean posicaoOcupada(int posicao){
        if(posicao >= 0 && posicao < this.totalDeAlunos){
            return true;
        }
        throw new IllegalArgumentException("Posicao informada não é válida");

    }

    @Override
    public Aluno pega(int posicao) {
        if(this.posicaoOcupada(posicao)){
            return this.alunos[posicao];
        }
        return null;
    }

    public Aluno pegaInicioCapitulo(int posicao) {
        return this.alunos[posicao];
    }

    @Override
    public void remove(int posicao) {
        if(this.posicaoValida(posicao) ){
            for(int i = posicao; i < this.totalDeAlunos -1; i++){
                this.alunos[i] = this.alunos[i+1];
            }
        }
        this.totalDeAlunos--;
    }

    public boolean contemInicioCapitulo(Aluno aluno){
        for(int i =0; i< this.alunos.length;i++){
            if (this.alunos[i] == aluno){
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean contem(Aluno object) {
        for(int i =0; i < totalDeAlunos; i++) {
            if (object.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int tamanho() {
        return this.totalDeAlunos;
    }

    private void alocarEspaco(){
        if(this.totalDeAlunos == this.alunos.length){
            Aluno[] aux = new Aluno[this.totalDeAlunos * 2];
            for(int i =0; i< this.totalDeAlunos; i++) {
                aux[i] = this.alunos[i];
            }
            this.alunos = aux;

        }
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
