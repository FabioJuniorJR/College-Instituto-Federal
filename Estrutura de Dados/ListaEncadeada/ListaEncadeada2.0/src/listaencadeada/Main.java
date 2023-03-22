

public class Main {
    
    public static void main(String[] args) {
        /*  
            //Ative estes metodos para: 
            //acrescentar valores a lista, mostrar valores e o proximo se tiver
        No no1 = new No(10); //cria o primeirto Nó
        No no2 = new No(20); //cria o proximo Nó
        no1.setProximo(no2); //faz o Nó1 apontra para o Nó2
        System.out.println("elemento Nó1[" + no1.getInfo() + "]"); //imprimi a informação guradada no Nó1
        System.out.println("elemento Nó2[" + no1.getProximo().getInfo() + "]"); //imprimi o valor do proximo Nó            
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
        //lista.imprimi();
        lista.insereprimeiro(10);
        lista.insereprimeiro(22);
        lista.imprimi();
        */

        /*
            //Ative estes metodos para:
            //Acrescentar valor por ultimo na Lista e busca o ultimo valor
        Lista lista = new Lista();
        lista.insereprimeiro(10);
        lista.insereprimeiro(22);
        lista.insereFim(33);
        lista.insereFim(44);
        lista.imprimi();
        if(lista.vazia()){
            System.out.println("A lista está vazia");
        }else{
            No primeiro = lista.getPrimeiro();
            No cursor = primeiro;
            while(cursor.getProximo()!= null){
                cursor = cursor.getProximo();
            }
            System.out.println("O ultimo valor é: " + cursor.getInfo());
        }
        */

        /*
                //Ative estes metodos para:
                //Acrescentar valor após algum valor da lista usando getProximo
            Lista lista = new Lista();
            lista.insereprimeiro(10);
            lista.insereprimeiro(22);
            lista.insereFim(33);
            lista.insereFim(44);
            //No no1 = lista.getPrimeiro();
            No no1 = lista.getPrimeiro().getProximo();//coloque outros getPrtoximo para colocar o 99 nas posição afrente.
            lista.insereDepois(no1, 99);
            lista.imprimi();
        */

        /* 
            //Ative estes metodos para:
            //Remover primeiro valor da Lista e imprimi o Primeiro -  em Desenvolvimento...(continua mostrando o primeiro valor antigo)
        Lista lista = new Lista();
        System.out.println(lista.vazia());
        lista.insereprimeiro(10);
        lista.insereprimeiro(20);
        //No no1 = lista.getPrimeiro();
        //lista.insereDepois(no1, 22);
        lista.imprimi();
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
        lista.imprimi();
        System.out.println("Valor removido foi o: " + lista.getPrimeiro().getProximo().getInfo());
        lista.retira(lista.getPrimeiro().getProximo());// remove o valor 500, o proximo depois do primeiro
        lista.imprimi();
        */

        /* 
        Lista lista = new Lista();
        System.out.println(lista.vazia());
        lista.insereprimeiro(10);
        lista.insereprimeiro(20);
        lista.insereprimeiro(500);
        lista.insereprimeiro(40);
        System.out.println(lista);
        */

            
        /*
            //Ative estes metodos para:
            //Usar o toString e visualizar o objeto em String

        No no = new No(1);
        Lista lista = new Lista();
        System.out.println(lista);
        lista.insereprimeiro(3);
        System.out.println(lista);
        lista.insereprimeiro(10);
        lista.insereprimeiro(20);
        lista.insereprimeiro(500);
        lista.insereprimeiro(40);
        System.out.println(lista);
        */        

        /*
             //Ative estes metodos para:
            //Ver comprimento da Lista
            Lista lista = new Lista();
            
            for (int i = 0; i < 10; i++){
                lista.insereFim(10);
            }
            System.out.println(lista.comprimento());
        */

        /*
            //Ative estes metodos para:
            //Liberar toda lista(destroi a lista)
        Lista lista = new Lista();
        lista.libera();
        */


    }
       
}
