package br.com.caelum.ed.conjuntos;

import java.util.List;

public interface IConjunto<T>{

    public void add(T t);
    public void remove(T t);
    public boolean contains(T t);
    public List<T> getAll();
    public int size();
}
