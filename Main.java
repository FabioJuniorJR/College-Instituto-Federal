package listaencadeada;

public class Main {

    public static void main(String[] args) {
        /*
         * No no1 = new No(); // cria o primeirto Nó
         * No no2 = new No(); // cria o proximo Nó
         * no1.setProximo(no2); // faz o Nó1 apontra para o Nó2
         * System.out.println("elemento Nó1[" + no1.getInfo() + "]"); // mostra a
         * informação guradada no Nó1
         * System.out.println("elemento Nó2[" + no1.getProximo().getInfo() + "]"); //
         * mostra o valor do proximo Nó
         * System.out.println("elemento Nó2[" + no2.getInfo() + "]");
         * System.out.println("elemento Nó3[" + no2.getProximo() + "]");
         */
        Lista lista = new Lista();
        // System.out.println("A Lista está: " + lista.vazia());
        // System.out.println(lista.getPrimeiro());
        lista.insereprimeiro(8);
        System.out.println(lista.vazia());
        System.out.println(lista.getPrimeiro().getInfo());
        System.out.println(lista.getPrimeiro().getProximo());
    }

}
