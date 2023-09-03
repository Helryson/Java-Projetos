import java.util.ArrayList;

import java.util.List;

public class palindromo {

    public static void main(String[] args){

        // Criando uma lista de números inteiros​

        List<Integer> lista = new ArrayList<>();


        // Adicionando elementos à lista​

        lista.add(10);

        lista.add(20);

        lista.add(30);

        lista.add(40);

        lista.add(50);

        // Acessando elementos da lista​

        System.out.println("Elemento na posição 2: " + lista.get(2));
        // Modificando um elemento da lista​

        lista.set(3, 45);

        System.out.println("Lista após modificação: " + lista);

        // Removendo um elemento da lista​

        lista.remove(1);

        System.out.println("Lista após remoção: " + lista);


        // Verificando o tamanho da lista​

        System.out.println("Tamanho da lista: " + lista.size());



        // Verificando se a lista contém um elemento específico​

        boolean contemElemento = lista.contains(30);

        System.out.println("A lista contém o elemento 30? " + contemElemento);

    }
}