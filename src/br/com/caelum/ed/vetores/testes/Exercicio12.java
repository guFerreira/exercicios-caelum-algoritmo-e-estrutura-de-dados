package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

import java.util.ArrayList;

public class Exercicio12 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        System.out.println("tamanho do vetor antes de adicionar 1000 alunos:" +vetor.tamanho());
        for(int i=0; i < 1000;i++){
            vetor.adiciona(new Aluno());
        }
        System.out.println("tamanho do vetor depois de adicionar 1000 alunos:" +vetor.tamanho());

        //12.3 - passar os dados de um vetor pro outro e imprimir o tamanho antes de depois
        Vetor novoVetor = new Vetor();
        System.out.println("tamanho do novo vetor antes de adicionar 1000 alunos:" + novoVetor.tamanho());
        for(int i=0; i < 1000; i++){
            novoVetor.adiciona(vetor.pega(i));
        }
        System.out.println("tamanho do novo vetor depois de adicionar 1000 alunos:" +novoVetor.tamanho());

        //12.4 - passar os dados agora para um arraylist e executar os msm passos anteriores

        ArrayList<Aluno> arrayListAlunos = new ArrayList<Aluno>();
        System.out.println("tamanho do arraylist antes de adicionar 1000 alunos:" + arrayListAlunos.size());
        for(int i=0; i < 1000; i++){
            arrayListAlunos.add(novoVetor.pega(i));
        }
        System.out.println("tamanho do arraylist depois de adicionar 1000 alunos:" +novoVetor.tamanho());


    }

}
