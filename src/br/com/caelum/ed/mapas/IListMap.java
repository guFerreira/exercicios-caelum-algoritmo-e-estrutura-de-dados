package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public interface IListMap {
    public void add(String placa, Carro carro);
    public Carro get(String placa);
    public void remove(String placa);
    public boolean containsKey(String placa);
    public int size();
}
