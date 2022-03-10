package br.com.caelum.ed.vetores;

public class VetorGenerico implements IVetor{
    private Object[] objects = new Object[50];
    private int totalDeAlunos = 0;

    @Override
    public void adiciona(Object aluno) {
        this.alocarEspaco();
        //mais eficiente que a opção comentada, pois não precisa percorrer toda a lista
        //para saber onde inserir
        this.objects[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
        /*for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }*/

    }

    @Override
    public void adiciona(int posicao, Object aluno) {
        this.alocarEspaco();
        if (this.posicaoValida(posicao)){
            //realoco todos à direita da posição especificada
            for(int i = this.totalDeAlunos - 1 ; i >= posicao ; i--){
                this.objects[i+1] = this.objects[i];
            }
            this.objects[posicao] = aluno;
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
    public Object pega(int posicao) {
        if(this.posicaoOcupada(posicao)){
            return this.objects[posicao];
        }
        return null;
    }

    @Override
    public void remove(int posicao) {
        if(this.posicaoValida(posicao) ){
            for(int i = posicao; i < this.totalDeAlunos -1; i++){
                this.objects[i] = this.objects[i+1];
            }
        }
        this.totalDeAlunos--;
    }

    @Override
    public boolean contem(Object aluno) {
        for(int i =0; i < totalDeAlunos; i++) {
            if (aluno.equals(this.objects[i])) {
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
        if(this.totalDeAlunos == this.objects.length){
            Object[] aux = new Object[this.totalDeAlunos * 2];
            for(int i =0; i< this.totalDeAlunos; i++) {
                aux[i] = this.objects[i];
            }
            this.objects = aux;

        }
    }

    public String toString() {
        if (this.totalDeAlunos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < this.totalDeAlunos - 1; i++) {
            builder.append(this.objects[i]);
            builder.append(", ");
        }
        builder.append(this.objects[this.totalDeAlunos - 1]);
        builder.append("]");
        return builder.toString();
    }
}
