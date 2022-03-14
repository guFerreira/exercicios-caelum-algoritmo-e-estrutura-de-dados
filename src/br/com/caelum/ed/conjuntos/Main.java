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

        MySet conjunto = new MySet();
        for (int i = 0; i < 100; i++) {
            conjunto.add("" + i);
        }
        conjunto.imprimeTabela();
    }
}
