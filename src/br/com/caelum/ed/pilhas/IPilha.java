package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

public interface IPilha {
    public void insere(Peca peca);
    public Object remove();
    public boolean vazia();
    public Object peek();
    public int pegarTamanho();
    public Object pegarElementoPorPosicao(int posicao);
}
