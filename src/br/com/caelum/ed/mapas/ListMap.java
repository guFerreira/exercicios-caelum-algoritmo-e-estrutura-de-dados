package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

import java.util.ArrayList;
import java.util.List;

public class ListMap implements IListMap{

    private List<Associacao> associacoes = new ArrayList<Associacao>();
    @Override
    public void add(String placa, Carro carro) {
        if (!this.containsKey(placa)){
            this.associacoes.add(new Associacao(placa, carro));
        }
    }

    @Override
    public Carro get(String placa) {
        for (int i =0; i < this.associacoes.size(); i++){
            if (placa.equals(this.associacoes.get(i).getPlaca())){
                return this.associacoes.get(i).getCarro();
            }
        }
        throw new IllegalArgumentException("Placa não encontrada");

    }

    @Override
    public void remove(String placa) {
        if(this.containsKey(placa)){
            for (int i = 0; i < this.associacoes.size(); i++){
                if (this.associacoes.get(i).getPlaca().equals(placa)){
                    this.associacoes.remove(i);
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Placa não encontrada");
    }

    @Override
    public boolean containsKey(String placa) {
        for (int i = 0; i < this.associacoes.size(); i++){
            if (this.associacoes.get(i).getPlaca().equals(placa)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.associacoes.size();
    }
}
