package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //testarListMap();
        //testarMapaEspalhamento();
        testarHashMapJava();
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

    public static void testarListMap(){
        ListMap mapaLista = new ListMap();
        mapaLista.add("1234",new Carro("Fiat"));
        mapaLista.add("321",new Carro("chevrolet"));
        mapaLista.add("121212",new Carro("Argo"));

        System.out.println(mapaLista.get("121212").getNome());

        System.out.println(mapaLista.containsKey("1234"));
        System.out.println(mapaLista.containsKey("22222"));
    }

    public static void testarMapaEspalhamento(){
        MapaEspalhamento me = new MapaEspalhamento();
        me.adiciona("12345",new Carro("Fiat"));
        me.adiciona("54321",new Carro("Tesla"));
        System.out.println(me.contemChave("12345"));
        System.out.println(me.contemChave("1111"));
    }

    public static void testarHashMapJava(){
        HashMap<String, Carro> mapa = new HashMap<String, Carro>();
        mapa.put("abc1234", new Carro("a"));
        System.out.println(mapa.toString());
        mapa.put("abc1234", new Carro("b"));
        System.out.println(mapa);
        mapa.put("def1234", new Carro("c"));
        System.out.println(mapa.toString());
        System.out.println(mapa.containsKey("abc1234"));
        System.out.println(mapa.get("abc1234"));
        mapa.remove("abc1234");
        System.out.println(mapa.toString());

    }
}
