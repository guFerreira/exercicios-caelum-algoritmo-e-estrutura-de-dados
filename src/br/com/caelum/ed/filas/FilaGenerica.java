package br.com.caelum.ed.filas;

import br.com.caelum.ed.listasligadas.ListaLigada;
import br.com.caelum.ed.vetores.Aluno;

import java.util.LinkedList;

public class FilaGenerica <Object> implements IFila<Object>{
    LinkedList<Object> lista = new LinkedList<Object>();

    @Override
    public void insere(Object object) {
        this.lista.add(object);
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
