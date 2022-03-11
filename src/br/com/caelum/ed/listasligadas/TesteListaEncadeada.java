package br.com.caelum.ed.listasligadas;

public class TesteListaEncadeada {
    public static void main(String[]args){
        //testeAdicionaNoFim();
        //testeAdicionaPorPosicao();
        //testePegaPorPosicao();
        testeRemovePorPosicao();
        /*testeTamanho();
        testeContemElemento();
        testeAdicionaNoComeco();
        testeRemoveDoComeco();
        testeRemoveDoFim();*/
    }
    public static void testeAdicionaNoFim(){
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Gustavo");
        lista.adiciona("Rodrigo");
        System.out.println(lista.getPrimeiro().getElemento());
        System.out.println(lista.getUltimo().getElemento());
    }

    public static void testeAdicionaPorPosicao() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        System.out.println("rafael adicionado");
        lista.adiciona(0, "Paulo");
        System.out.println("rafael adicionado"+lista.pega(0));
        lista.adiciona(1, "Camila");
        System.out.println(lista.pega(1));
        System.out.println(lista);
    }

    public static void testePegaPorPosicao() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
    }

    public static void testeRemovePorPosicao() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.adiciona("Camila");
        lista.remove(1);
        System.out.println(lista);
    }
    public static void testeTamanho() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(lista.tamanho());
        lista.adiciona("Camila");
        System.out.println(lista.tamanho());

    }

    public static void testeContemElemento() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        System.out.println(lista.contem("Rafael"));
        System.out.println(lista.contem("Camila"));
    }

    public static void testeAdicionaNoComeco() {
        ListaLigada lista = new ListaLigada();
        lista.adicionaNoComeco("Rafael");
        lista.adicionaNoComeco("Paulo");
        System.out.println(lista);
    }



    public static void testeRemoveDoComeco() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.removeDoComeco();
        System.out.println(lista);
    }

    public static void testeRemoveDoFim() {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Rafael");
        lista.adiciona("Paulo");
        lista.removeDoFim();
        System.out.println(lista);
    }

}
