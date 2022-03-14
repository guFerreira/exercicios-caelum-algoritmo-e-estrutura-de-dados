package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public class Main {
    public static void main(String[] args) {
        ListMap mapaLista = new ListMap();
        mapaLista.add("1234",new Carro("Fiat"));
        mapaLista.add("321",new Carro("chevrolet"));
        mapaLista.add("121212",new Carro("Argo"));

        System.out.println(mapaLista.get("121212").getNome());

        System.out.println(mapaLista.containsKey("1234"));
        System.out.println(mapaLista.containsKey("22222"));

        /*
        int numeroDeElementos = 15000;
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < numeroDeElementos; i++) {
            mapaLista.add("" + i, new Carro("c" + i));
        }
        for (int i = 0; i < numeroDeElementos; i++) {
            mapaLista.get("" + i);
        }
        for (int i = 0; i < numeroDeElementos; i++) {
            mapaLista.containsKey("" + i);
        }
        for (int i = 0; i < numeroDeElementos-1; i++) {
            mapaLista.remove("" + i);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio)/1000.0);

         */
    }
}
