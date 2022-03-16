package br.com.caelum.ed.filas;

import br.com.caelum.ed.listasligadas.ListaLigada;

public class FilaParametrizada<T> implements IFila <T>{
    ListaLigada lista = new ListaLigada();
    @Override
    public void insere(T t) {
        this.lista.adiciona(t);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean vazia() {
        return false;
    }
}
