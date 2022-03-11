package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

import java.util.LinkedList;
import java.util.List;

public class PilhaGenerica {
    //Utiliza uma linkedlist para guardar os dados em memória
    private List<Object> objetos = new LinkedList<Object>();


    public void insere(Object objeto) { //push
        this.objetos.add(objeto);
    }
    public Object remove() { //pop
        return this.objetos.remove(this.objetos.size() - 1);
    }
    public boolean vazia() {
        return this.objetos.isEmpty();
    }
    public Object peek(){
        return this.objetos.get(this.objetos.size()-1);
    }
}
