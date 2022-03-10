package br.com.caelum.ed.vetores;

public interface IVetor<T> {
    public void adiciona(T object);
    public void adiciona(int posicao, T object);
    public Object pega(int posicao);
    public void remove(int posicao);
    public boolean contem(T object);
    public int tamanho();
}
