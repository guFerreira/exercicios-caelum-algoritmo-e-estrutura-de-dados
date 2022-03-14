package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySet implements IConjunto{
    private List<List<String>> table;
    private int lenght;
    public MySet() {
        this.table = new ArrayList<List<String>>();
        this.lenght = 0;
        for (int i = 0; i < 26; i++) {
            LinkedList<String> lista = new LinkedList<String>();
            table.add(lista);
        }
    }
    private int calcIndexTable(String word){
        return word.toLowerCase().charAt(0) % 26; // cada char tem um valor positivo inteiro
    }


    @Override
    public void add(String word) {
        if(!this.contains(word)){
            int index = calcIndexTable(word);
            table.get(index).add(word);
            lenght++;
        }
    }

    @Override
    public void remove(String word) {
        if(this.contains(word)){
            int index = this.calcIndexTable(word);
            this.table.get(index).remove(word);
            lenght--;
        }
    }

    @Override
    public boolean contains(String word) {
        int index = this.calcIndexTable(word);
        if(this.table.get(index).contains(word)){
            return true;
        }
        return false;
    }

    @Override
    public List<String> getAll() {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < this.table.size(); i++) {
            words.addAll(this.table.get(i));
        }
        return words;
    }

    @Override
    public int size() {
        return lenght;
    }
}
