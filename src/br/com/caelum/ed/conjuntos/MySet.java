package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySet<T> implements IConjunto<T>{
    private List<List<T>> table;
    private int lenght;
    public MySet() {
        this.table = new ArrayList<List<T>>();
        this.lenght = 0;

        for (int i = 0; i < 26; i++) {
            LinkedList<T> lista = new LinkedList<T>();
            table.add(lista);
        }
    }

    private int calcIndexTable(T object){
        //return word.toLowerCase().charAt(0) % 26; // implementação sem espalhamento

        int code = object.hashCode();
        code = Math.abs(code);
        return code % this.table.size();
    }

    private void redimensionaTabela(int novaCapacidade){
        this.lenght = 0;
        List<T> objects = this.getAll();
        this.table.clear();
        for (int i = 0; i < novaCapacidade; i++) {
            this.table.add(new LinkedList<T>());
        }
        for (T object : objects) {
            this.add(object);
        }
    }
    private void verificaCarga() {
        int capacidade = this.table.size();
        double carga = (double) this.size() / capacidade;
        if (carga > 0.75) {
            this.redimensionaTabela(capacidade * 2);
        } else if (carga < 0.25) {
            this.redimensionaTabela(Math.max(capacidade / 2, 10));
        }
    }

    public void imprimeTabela(){
        for (List<T> list: this.table) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

    @Override
    public void add(T object) {
        if(!this.contains(object)){
            this.verificaCarga();
            int index = calcIndexTable(object);
            table.get(index).add(object);
            lenght++;
        }
    }

    @Override
    public void remove(T object) {
        if(this.contains(object)){
            int index = this.calcIndexTable(object);
            this.table.get(index).remove(object);
            this.lenght--;
            this.verificaCarga();
        }
    }

    @Override
    public boolean contains(T t) {
        int index = this.calcIndexTable(t);
        if(this.table.get(index).contains(t)){
            return true;
        }
        return false;
    }

    @Override
    public List<T> getAll() {
        List<T> objects = new ArrayList<T>();
        for (int i = 0; i < this.table.size(); i++) {
            objects.addAll(this.table.get(i));
        }
        return objects;
    }

    @Override
    public int size() {
        return lenght;
    }
}
