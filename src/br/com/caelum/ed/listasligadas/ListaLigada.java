package br.com.caelum.ed.listasligadas;

public class ListaLigada implements IListaEncadeada<Object>{
    private Nodo primeiro;
    private Nodo ultimo;
    private int numElementos;

    public ListaLigada() {
        this.primeiro = null;
        this.ultimo = null;
        this.numElementos = 0;
    }

    //adiciona no final da lista
    @Override
    public void adiciona(Object elemento) {
        Nodo novo = new Nodo(elemento);

        if(this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        }else{
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
        this.numElementos++;
    }

    @Override
    public void adicionaNoComeco(Object elemento) {
        Nodo nodo = new Nodo(elemento);

        if(this.primeiro == null){
            this.primeiro = nodo;
            this.ultimo = nodo;
        }else{
            nodo.setProximo(this.primeiro);
            this.primeiro.setAnterior(nodo);
            this.primeiro = nodo;
        }
        this.numElementos++;
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.numElementos;
    }

    private Nodo pegaNodo(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição não existe");
        }
        Nodo atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    @Override
    public void adiciona(int posicao, Object elemento) {
        System.out.println(posicao);

        if(posicao == 0){
            this.adicionaNoComeco(elemento);
        }else if (posicao == this.numElementos - 1){
            this.adiciona(elemento);
        }else{
            Nodo novo = new Nodo();
            novo.setElemento(elemento);

            Nodo aux = this.primeiro;  //aux vai ficar na esquerda da posicao
            for(int i =0; i< posicao; i++){
                aux = aux.getProximo();
            }
            novo.setProximo(aux.getProximo());
            aux.setProximo(novo);
            novo.getProximo().setAnterior(novo);
            novo.setAnterior(aux);
            this.numElementos++;

        }
    }

    @Override
    public Nodo pega(int posicao) {
        if(posicao < 0 || posicao > this.numElementos){
            return null;
        }
        Nodo atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;

    }

    @Override
    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.numElementos - 1) {
            this.removeDoFim();
        } else {
            Nodo nodoRemovido = this.primeiro;

            for(int i=0; i < posicao; i++){
                nodoRemovido = nodoRemovido.getProximo();
            }

            nodoRemovido.getProximo().setAnterior(nodoRemovido.getAnterior());
            nodoRemovido.getAnterior().setAnterior(nodoRemovido.getProximo());
            this.numElementos--;
        }
    }

    @Override
    public int tamanho() {
        return this.numElementos;
    }

    @Override
    public boolean contem(Object o) {
        Nodo atual = this.primeiro;
        while(atual != null){
            if(atual.getElemento().equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void removeDoComeco() {

        if(this.primeiro != null){

            if(this.numElementos == 1){
                this.primeiro = null;
                this.ultimo = null;
                this.numElementos--;
            }
            this.primeiro = this.primeiro.getProximo();
            this.numElementos--;
        }

    }

    @Override
    public void removeDoFim() {
        if( this.numElementos == 1){
            this.ultimo = null;
            this.primeiro = null;
        }
        Nodo novoFim = this.ultimo.getAnterior();
        novoFim.setProximo(null);
        this.ultimo = novoFim;
        this.numElementos--;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }


    public String toString() {
        // Verificando se a Lista está vazia
        if(this.numElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Nodo atual = this.primeiro;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.numElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
            System.out.println(atual.getElemento());
        }
        System.out.println(atual.getElemento());
        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }

}
