package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TestePega {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Rafael");


        //primeira implementação do método demonstrado na apostila
        Vetor lista2 = new Vetor();
        lista2.adiciona(a1);
        lista2.pegaInicioCapitulo(0);
        lista2.pegaInicioCapitulo(1); //consegue acessar, mas está vazio
        lista2.pegaInicioCapitulo(100000000); // falha nesse, pois a posição não existe

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.pega(0);
        lista.pega(1); // falha nesse
        lista.pega(100000000);


    }
}
