package br.com.caelum.ed.listasligadas;

public interface IListaEncadeada <T>{
    public void adiciona(T elemento);
    public void adiciona(int posicao, T elemento);
    public T pega(int posicao);
    public void remove(int posicao);
    public int tamanho();
    public boolean contem(T o);
    public void adicionaNoComeco(T elemento);
    public void removeDoComeco();
    public void removeDoFim();

}
