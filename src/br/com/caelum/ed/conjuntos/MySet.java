package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySet implements IConjunto<Object>{
    private List<List<Object>> table;
    private int lenght;
    public MySet() {
        this.table = new ArrayList<List<Object>>();
        this.lenght = 0;
        for (int i = 0; i < 26; i++) {
            LinkedList<Object> lista = new LinkedList<Object>();
            table.add(lista);
        }
    }
    private int calcIndexTable(Object object){
        //return word.toLowerCase().charAt(0) % 26; // implementação sem espalhamento

        int code = object.hashCode();
        code = Math.abs(code);
        return code % this.table.size();
    }

    private void redimensionaTabela(int novaCapacidade){
        List<Object> objects = this.getAll();
        this.table.clear();
        for (int i = 0; i < novaCapacidade; i++) {
            this.table.add(new LinkedList<Object>());
        }
        for (Object object : objects) {
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
        for (List<Object> list: this.table) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print("*");
            }
            System.out.println("]");
        }
    }

    @Override
    public void add(Object object) {
        if(!this.contains(object)){
            this.verificaCarga();
            int index = calcIndexTable(object);
            table.get(index).add(object);
            lenght++;
        }
    }

    @Override
    public void remove(Object object) {
        if(this.contains(object)){
            int index = this.calcIndexTable(object);
            this.table.get(index).remove(object);
            lenght--;
            this.verificaCarga();
        }
    }

    @Override
    public boolean contains(Object object) {
        int index = this.calcIndexTable(object);
        if(this.table.get(index).contains(object)){
            return true;
        }
        return false;
    }

    @Override
    public List<Object> getAll() {
        List<Object> objects = new ArrayList<Object>();
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
