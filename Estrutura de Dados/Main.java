package listaencadeada;

public class Main {
    
    public static void main(String[] args) {
        /*  
            //Ative estes metodos para: 
            //acrescentar valores a lista, mostrar valores e o proximo se tiver
        No no1 = new No(10); //cria o primeirto Nó
        No no2 = new No(20); //cria o proximo Nó
        no1.setProximo(no2); //faz o Nó1 apontra para o Nó2
        System.out.println("elemento Nó1[" + no1.getInfo() + "]"); //mostra a informação guradada no Nó1
        System.out.println("elemento Nó2[" + no1.getProximo().getInfo() + "]"); //mostra o valor do proximo Nó            
        System.out.println("elemento Nó2[" + no2.getInfo() + "]");
        System.out.println("elemento Nó3[" + no2.getProximo() + "]");
        */

        /* 
            //Ative estes metodos para: 
            //colocar primeiro valor na lista, ver se esta vazia e buscar proximo se tiver
        Lista lista = new Lista();
        lista.insereprimeiro(5555555);
        System.out.println();
        System.out.println(lista.vazia());
        System.out.println(lista.getPrimeiro().getInfo());
        System.out.println(lista.getPrimeiro().getProximo());
        */

        /*
            //Ative estes metodos para: 
            //Acrescentar substituir valor na primeira posição da lista e ver valores da lista
        Lista lista = new Lista();
        //lista.mostra();
        lista.insereprimeiro(10);
        lista.insereprimeiro(22);
        lista.mostra();
        */

        /*
            //Ative estes metodos para:
            //Acrescentar valor por ultimo na Lista
        Lista lista = new Lista();
        lista.insereprimeiro(10);
        lista.insereprimeiro(22);
        lista.insereUltimo(33);
        lista.insereUltimo(44);
        lista.mostra();
        */

        /*
            //Ative estes metodos para:
            //Acrescentar valor após algum valor da lista usando getProximo
            Lista lista = new Lista();
            lista.insereprimeiro(10);
            lista.insereprimeiro(22);
            lista.insereUltimo(33);
            lista.insereUltimo(44);
            //No no1 = lista.getPrimeiro();
            No no1 = lista.getPrimeiro().getProximo();//coloque outros getPrtoximo para colocar o 99 nas posição afrente.
            lista.insereDepois(no1, 99);
            lista.mostra();
        */

        /* 
            //Ative estes metodos para:
            //Remover primeiro valor da Lista e mostra o Primeiro -  em Desenvolvimento...(continua mostrando o primeiro valor antigo)
        Lista lista = new Lista();
        System.out.println(lista.vazia());
        lista.insereprimeiro(10);
        lista.insereprimeiro(20);
        //No no1 = lista.getPrimeiro();
        //lista.insereDepois(no1, 22);
        lista.mostra();
        System.out.println("O intem removido foi o: " + lista.removePrimeiro().getInfo());
        System.out.println(lista.getPrimeiro().getInfo());
        //System.out.println(lista.getPrimeiro().getInfo());
        */

        /*
            //Ative estes metodos para:
            //Remover um Nó da Lista usando comandos getPrimeiro e acrescentando getProximo
        Lista lista = new Lista();
        System.out.println(lista.vazia());
        lista.insereprimeiro(10);
        lista.insereprimeiro(20);
        lista.insereprimeiro(500);
        lista.insereprimeiro(40);
        lista.mostra();
        System.out.println("Valor removido foi o: " + lista.getPrimeiro().getProximo().getInfo());
        lista.removeDepois(lista.getPrimeiro().getProximo());
        lista.mostra();
        */
    }

}
