package br.com.caelum.ed.conjuntos;

import java.util.List;

public interface IConjunto {

    public void add(String word);
    public void remove(String word);
    public boolean contains(String word);
    public List<String> getAll();
    public int size();
}
