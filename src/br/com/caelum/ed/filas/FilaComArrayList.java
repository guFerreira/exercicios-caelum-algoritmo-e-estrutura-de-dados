package br.com.caelum.ed.filas;

import java.util.ArrayList;

public class FilaComArrayList implements IFila<Object>{
    ArrayList<Object> lista = new ArrayList();
    @Override
    public void insere(Object o) {
        this.lista.add(0);
    }

    @Override
    public Object remove() {
        return this.lista.remove(0);
    }

    @Override
    public boolean vazia() {
        return this.lista.isEmpty();
    }
}
