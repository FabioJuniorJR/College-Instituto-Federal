package listaencadeada.listaEncadeadaTest;

import listaencadeada.ListaEncadeada;

public class ListaEncadeadaTeste {

    
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        System.out.println();//apaenas para quebrar linha
        
        lista.addElemento(1);
        lista.addElemento(2);
        
        System.out.println(lista);
        System.out.println();//apaenas para quebrar linha
        
    }
    
}
