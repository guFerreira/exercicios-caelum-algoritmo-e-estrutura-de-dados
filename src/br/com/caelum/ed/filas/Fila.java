package br.com.caelum.ed.filas;

import br.com.caelum.ed.listasligadas.ListaLigada;
import br.com.caelum.ed.vetores.Aluno;

import java.util.LinkedList;

public class Fila <T> implements IFila<Aluno>{
    ListaLigada lista = new <Aluno>ListaLigada();

    @Override
    public void insere(Aluno aluno) {
        lista.adiciona(aluno);
    }

    @Override
    public Aluno remove() {
        Aluno aluno = (Aluno) lista.getPrimeiro().getElemento();
        lista.remove(0);
        return aluno;
    }

    @Override
    public boolean vazia() {
        return lista.tamanho() > 0;
    }
}
