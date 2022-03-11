package br.com.caelum.ed.pilhas;

public class Exercicio6 {

    public static void main(String [] args){
        PilhaParametrizada<Character> pilhaCharacter = new PilhaParametrizada<Character>();

        String texto = "mensagem";
        for (int i = 0; i < texto.length(); i++){
            pilhaCharacter.insere(texto.charAt(i));
            System.out.println(pilhaCharacter.peek());
        }

        //System.out.println(pilhaCharacter.pegarTamanho());
        System.out.print("Mensagem");
        String criptografada = "";
        int tamanho = pilhaCharacter.pegarTamanho()-1;
        for (int i = 0; i < tamanho; i++){
            pilhaCharacter.remove();
            System.out.print(pilhaCharacter.peek());
        }

        //System.out.println(criptografada);

    }
}
