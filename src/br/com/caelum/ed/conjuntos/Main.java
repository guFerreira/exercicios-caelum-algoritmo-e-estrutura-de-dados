package br.com.caelum.ed.conjuntos;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        testarFuncionalidadesSet();
        testarConjuntoGenerico();
        /*MySet conjunto = new MySet();
        for (int i = 0; i < 100; i++) {
            conjunto.add("" + i);
        }
        conjunto.imprimeTabela();

        /*
        long inicio = System.currentTimeMillis();
        MySet conjunto = new MySet();
        for (int i = 0; i < 50000; i++) {
            conjunto.add("palavra" + i);
        }
        for (int i = 0; i < 50000; i++) {
            conjunto.contains("palavra" + i);
        }
        long fim = System.currentTimeMillis();
        System.out.println(inicio - fim);
        conjunto.imprimeTabela();
        */
        // -2405 tempo marcado sem as modificações de redimencionar
        // -235 tempo marcado com as modificações de redimencionar
    }

    public static void testarFuncionalidadesSet(){
        MySet<String> m = new MySet();
        m.add("Alegrete");
        m.add("Amapá");
        m.add("Brasilia");
        System.out.println(m.getAll().toString());
        System.out.println(m.contains("Alegrete"));
        System.out.println(m.size());
        m.remove("Alegrete");
        System.out.println(m.contains("Alegrete"));
        System.out.println(m.getAll().toString());
        System.out.println(m.size());
    }
    public static void testarConjuntoGenerico(){
        MySet conjunto = new MySet();
        conjunto.add("Rafael");
        conjunto.add("Rafael");
        conjunto.add("Ana");
        conjunto.add("Paulo");
        System.out.println(conjunto.getAll());

       HashSet conjuntoHashSet = new HashSet();
        conjuntoHashSet.add("Rafael");
        conjuntoHashSet.add("Rafael");
        conjuntoHashSet.add("Ana");
        conjuntoHashSet.add("Paulo");
        System.out.println(conjuntoHashSet);

    }
}
