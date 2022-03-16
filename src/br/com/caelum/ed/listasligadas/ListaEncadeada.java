package br.com.caelum.ed.listasligadas;

public class ListaEncadeada {
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public void adicionar(Object objeto){
        if(tamanho == 0){
            Nodo nodo = new Nodo();
            nodo.setElemento(objeto);

            this.inicio = nodo;
            this.fim = nodo;
            this.tamanho++;
        }else{
            Nodo nodo = new Nodo();
            nodo.setElemento(objeto);
            nodo.setAnterior(this.fim);
            this.fim.setProximo(nodo);
            this.fim = nodo;
        }
    }

    public void adicionarPorPosicao(int posicao, Object objeto){

    }
}
