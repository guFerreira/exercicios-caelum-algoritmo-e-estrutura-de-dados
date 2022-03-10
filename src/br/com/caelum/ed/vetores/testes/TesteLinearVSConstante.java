package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLinearVSConstante {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        long inicio = System.currentTimeMillis();
        testePrimeiraImplementacao(vetor);
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo em segundos primeira implementação = " + tempo);

        Vetor vetor2 = new Vetor();
        long inicio2 = System.currentTimeMillis();
        testeSegundaImplementacao(vetor2);
        long fim2 = System.currentTimeMillis();
        double tempo2 = (fim - inicio) / 1000.0;
        System.out.println("Tempo em segundos segunda implementação = " + tempo);
    }

    public static void testePrimeiraImplementacao(Vetor vetor){
        for (int i = 1; i < 100000; i++) {
            Aluno aluno = new Aluno();
            vetor.adicionaInicioCapitulo(aluno);
        }
    }

    public static void testeSegundaImplementacao(Vetor vetor){
        for (int i = 1; i < 100000; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
    }
}
