package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

import java.util.LinkedList;
import java.util.List;

public class Pilha implements IPilha{

    private List<Peca> pecas = new LinkedList<Peca>();

    public void insere(Peca peca) {//push
        this.pecas.add(peca);
    }
    public Peca remove() { //pop
        return this.pecas.remove(this.pecas.size() - 1);
    }
    public boolean vazia() {
        return this.pecas.isEmpty();
    }

    public Peca peek(){
        return this.pecas.get(this.pecas.size()-1);
    }

    @Override
    public int pegarTamanho() {
        return this.pecas.size();
    }

    @Override
    public Object pegarElementoPorPosicao(int posicao) {
        return this.pecas.get(posicao);
    }
}
