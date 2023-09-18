package Grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        // Obtém um Iterator para a lista
        Iterator<String> iterator = lista.iterator();

        // Percorre a lista usando o Iterator
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);

            // Remove o elemento "B" durante a iteração
            if (elemento.equals("B")) {
                iterator.remove();
            }
        }

        System.out.println("Lista após remoção: " + lista);
    }
}