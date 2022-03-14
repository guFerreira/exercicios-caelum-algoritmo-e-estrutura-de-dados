package br.com.caelum.ed.conjuntos;

public class Main {
    public static void main(String[] args) {
        /*MySet m = new MySet();
        m.add("Alegrete");
        m.add("Amapá");
        m.add("Brasilia");
        System.out.println(m.getAll().toString());
        System.out.println(m.contains("Alegrete"));
        m.remove("Alegrete");
        System.out.println(m.contains("Alegrete"));
        System.out.println(m.getAll().toString());
        System.out.println(m.size());*/

        /*MySet conjunto = new MySet();
        for (int i = 0; i < 100; i++) {
            conjunto.add("" + i);
        }
        conjunto.imprimeTabela();*/

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

        // -2405 tempo marcado sem as modificações de redimencionar
        // -235 tempo marcado com as modificações de redimencionar
    }
}
