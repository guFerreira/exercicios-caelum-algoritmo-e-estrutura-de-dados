package br.com.caelum.ed.listasligadas;

//exercicio 1
public class Nodo {
    private Nodo proximo;
    private Nodo anterior;
    private Object elemento;

    public Nodo() {
    }

    public Nodo(Object elemento) {
        this.elemento = elemento;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
