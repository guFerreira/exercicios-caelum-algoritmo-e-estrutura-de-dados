package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;

import java.util.ArrayList;
import java.util.List;


// 5) (opcional) É possível implementar a nossa Pilha utilizando internamente uma ArrayList em vez de
// LinkedList? Teremos algum ganho ou perda no consumo de tempo de alguma das operações?
public class PilhaComArrayList implements IPilha{
    private List<Peca> pilhaArrayList = new ArrayList<Peca>();

    @Override
    public void insere(Peca peca) {
        this.pilhaArrayList.add(peca);
    }

    @Override
    public Object remove() {
        return this.pilhaArrayList.remove(this.pilhaArrayList.size()-1);
    }

    @Override
    public boolean vazia() {
        return this.pilhaArrayList.isEmpty();
    }

    @Override
    public Object peek() {
        return this.pilhaArrayList.get(this.pilhaArrayList.size()-1);
    }

    @Override
    public int pegarTamanho() {
        return this.pilhaArrayList.size();
    }

    @Override
    public Object pegarElementoPorPosicao(int posicao) {
        return this.pilhaArrayList.get(posicao);
    }
}
