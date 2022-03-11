package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

import java.util.LinkedList;

public class PilhaParametrizada<T>{
    private LinkedList<T> pilha = new LinkedList<T>();
    public void insere(T t) {
        this.pilha.add(t);
    }

    public boolean vazia(){
        return this.pilha.isEmpty();

    }

    public T remove(){
        return this.pilha.remove(pilha.size()-1);
    }

    public T peek(){
        return this.pilha.get(pilha.size()-1);
    }

    public int pegarTamanho(){
        return this.pilha.size();
    }

    public T pegarElementoPorPosicao(int posicao){
        return this.pilha.get(posicao);
    }
}
