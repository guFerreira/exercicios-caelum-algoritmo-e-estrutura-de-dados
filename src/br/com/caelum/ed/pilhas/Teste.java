package br.com.caelum.ed.pilhas;

import br.com.caelum.ed.Peca;
public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Peca peca = new Peca();
        pilha.insere(peca);
        Peca pecaRemovida = pilha.remove();
        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual a que foi inserida");
        }
        if (!pilha.vazia()) {
            System.out.println("Erro: A pilha não está vazia");
        }


        testePilhaParametrizada();
    }

    public static void testePilhaParametrizada(){
        PilhaParametrizada<Peca> pilha = new PilhaParametrizada<Peca>();
        Peca peca = new Peca();
        pilha.insere(peca);
        Peca pecaRemove = pilha.remove();
        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }
        PilhaParametrizada<String> pilha2 = new PilhaParametrizada<>();
        pilha2.insere("Rafael Cosentino");
        pilha2.insere("Paulo Silvera");
        String paulo = pilha2.remove();
        String rafael = pilha2.remove();
        System.out.println(paulo);
        System.out.println(rafael);
    }
}
