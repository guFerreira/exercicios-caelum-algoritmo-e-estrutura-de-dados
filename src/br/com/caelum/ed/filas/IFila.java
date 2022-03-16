package br.com.caelum.ed.filas;

import br.com.caelum.ed.vetores.Aluno;

public interface IFila<T>{

    public void insere(T t);
    public T remove();
    public boolean vazia();
}
