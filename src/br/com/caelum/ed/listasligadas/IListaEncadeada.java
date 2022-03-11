package br.com.caelum.ed.listasligadas;

public interface IListaEncadeada {
    public void adiciona(Object elemento);
    public void adiciona(int posicao, Object elemento);
    public Object pega(int posicao);
    public void remove(int posicao);
    public int tamanho();
    public boolean contem(Object o);
    public void adicionaNoComeco(Object elemento);
    public void removeDoComeco();
    public void removeDoFim();

}
