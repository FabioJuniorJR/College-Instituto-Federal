public class ListaDupla {
    private NoListaDupla primeiro;
    private NoListaDupla ultimo;

    public ListaDupla() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void insereInicio(int valor) {
        NoListaDupla no = new NoListaDupla(valor);

        if (estaVazia()) {
            primeiro = no;
            ultimo = no;
        } else {
            no.setProximo(primeiro);
            primeiro.setAnterior(no);
            primeiro = no;
        }
    }

    public void insereFim(int valor) {
        NoListaDupla no = new NoListaDupla(valor);

        if (estaVazia()) {
            primeiro = no;
            ultimo = no;
        } else {
            ultimo.setProximo(no);
            no.setAnterior(ultimo);
            ultimo = no;
        }
    }

    public void imprime() {
        if (estaVazia()) {
            System.out.println("A lista está vazia");
        } else {
            NoListaDupla atual = primeiro;

            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }

            System.out.println();
        }
    }
    public int comprimento(){
        if (primeiro == null)
            return 0;

        NoListaDupla cursor = primeiro;
        int tamanho = 1;

        while (cursor.getProximo() != null) {
            cursor = cursor.getProximo();
            tamanho = tamanho + 1;
        }
        System.out.print("Tamanho da Lista: ");
        System.out.println(tamanho);
        return tamanho;
    }

    public boolean retira(int valor) {
        NoListaDupla valorAtual = primeiro;
        
        while (valorAtual != null && valorAtual.getValor() != valor) {
            valorAtual = valorAtual.getProximo();
        }
        
        if (valorAtual == null) {
            return false;
        }
        
        if (valorAtual == primeiro) {
            primeiro = valorAtual.getProximo();
        } else {
            valorAtual.getAnterior().setProximo(valorAtual.getProximo());
        }
        
        if (valorAtual == ultimo) {
            ultimo = valorAtual.getAnterior();
        } else {
            valorAtual.getProximo().setAnterior(valorAtual.getAnterior());
        }
        return true;
    }

    public boolean busca(int valor) {
        NoListaDupla atual = primeiro;

        while (atual != null) {
            if (atual.getValor() == valor) {
                System.out.print("Valor encontrado");
                return true;
            }

            atual = atual.getProximo();
        }
        System.out.print("Valor Nao encontrado");
        return false;
    }

    public void esvazia() {
        primeiro = null;
        ultimo = null;
    }


// Observação: O metodo funciona e mostra se as listas sao iguais ou nao
// Quando elas sao diferentes o System diz que sao diferentes
// Quando elas sao iguais o programa da erro -> implementar para exibir mensagem
    public boolean iguais(ListaDupla lista1, ListaDupla lista2){
        NoListaDupla atualLista1 = lista1.primeiro;
        NoListaDupla atualLista2 = lista2.primeiro;
        while(lista1 != null && lista2 != null){
            if(atualLista1.getValor() != atualLista2.getValor()){
                System.out.print("As listas sao diferentes");
                return true;

            }
            else{
                atualLista1 = atualLista1.getProximo();
                atualLista2 = atualLista2.getProximo();
            }
            
        }
        if(atualLista1 == null && atualLista2 == null ){
            System.out.print("As listas sao iguais");
        }
        return false;
        
    }

    public ListaDupla merge(ListaDupla lista1, ListaDupla lista2){
        ListaDupla listaMerge = new ListaDupla();
        NoListaDupla atualLista1 = lista1.primeiro;
        NoListaDupla atualLista2 = lista2.primeiro;
        while(atualLista1 != null || atualLista2 != null){
            if(atualLista1 != null){
                listaMerge.insereFim(atualLista1.getValor());
                atualLista1 = atualLista1.getProximo();
            }
            if(atualLista2 != null){
                listaMerge.insereFim(atualLista2.getValor());
                atualLista2 = atualLista2.getProximo();
            }
        }
        listaMerge.imprime();
        return listaMerge;
    }
    //
}











































/*public class ListaDupla {
    private NoListaDupla primeiro;
    private NoListaDupla ultimo;
    private int tamanho;

    public ListaDupla() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // verifica se a lista esta vazia ou não
    public boolean listaVazia() {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public int comprimento() {
        return tamanho;
    }

    public void inserePrimeiraPosicao(int valor) {
        NoListaDupla no = new NoListaDupla(valor);
        if (listaVazia()) {
            ultimo = no;
        } else {
            primeiro.setAnterior(no);
        }
        no.setProximo(primeiro);
        primeiro = no;
        tamanho++;
    }

    public void insereUltimaPosicao(int valor) {
        NoListaDupla no = new NoListaDupla(valor);
        if (listaVazia()) {
            primeiro = no;
        } else {
            ultimo.setProximo(no);
            no.setAnterior(ultimo);
        }
        ultimo = no;
        tamanho++;
    }

    public void imprimeLista() {
        NoListaDupla valorBusca = primeiro;
        while (valorBusca != null) {
            System.out.print(valorBusca.getvalor() + " ");
            valorBusca = valorBusca.getProximo();
        }
        System.out.println();
    }

    public boolean buscaValor(int valor) {
        NoListaDupla valorBusca = primeiro;
        while (valorBusca != null) {
            if (valorBusca.getvalor() == valor) {
                return true;
            }
            valorBusca = valorBusca.getProximo();
        }
        return false;
    }

    public void esvaziaLista() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public int retiraValor(int valor) {
        NoListaDupla valorBuscar = primeiro;
        while (valorBuscar != null && valorBuscar.getvalor() != valor) {
            valorBuscar = valorBuscar.getProximo();
        }
        if (valorBuscar == null) {
            return -1;
        }
        if (valorBuscar == primeiro) {
            primeiro = valorBuscar.getProximo();
            if (primeiro != null) {
                primeiro.setAnterior(null);
            }
        } else if (valorBuscar == ultimo) {
            ultimo = valorBuscar.getAnterior();
            if (ultimo != null) {
                ultimo.setAnterior(null);
            }
        } else {
            valorBuscar.   //setAnterior().setProximo() = valorBuscar.  proximo;
            valorBusca.  //proximo.anterior = valorBuscar.anterior;
        }
        tamanho--;
        return valorBuscar.getvalor();
    }

    /*public boolean comparaListas(ListaDupla outraLista) {
        if (tamanho != outraLista.tamanho) {
            return false;
        }
        NoListaDupla temp1 = primeiro;
        NoListaDupla temp2 = outraLista.primeiro;
        while (temp1 != null) {
            if (temp1.valor != temp2.valor) {
                return false;
            }
            temp1 = temp1.proximo;
            temp2 = temp2.proximo;
        }
        return true;
    }*/

    /*public boolean comparaListas(ListaDupla outraLista) {
        if (tamanho != outraLista.tamanho) {
            return false;
        }
        NoListaDupla valorBusca1 = primeiro;
        NoListaDupla valorBusca2 = outraLista.primeiro;
        while (valorBusca1 != null) {
            if (valorBusca1.getvalor() != valorBusca2.getvalor()) {
                return false;
            }
            valorBusca1 = valorBusca1.getProximo();
            valorBusca2 = valorBusca2.getProximo();
        }
        return true;
    }*/

    /*
     * public ListaDuplamergeListas(ListaDupla outraLista) {
     * ListaDuplalistaNova = new ListaDupla();
     * NoListaDupla temp1
     */


/* Explicação Lista Duplamente Encadeada */
/*
 * cada Nó recebe o endereço do seu anterior e sucessor.
 * |-----|--| |-----|--|
 * | 6 | x| <---> | 7 | y|
 * |-----|--| |-----|--|
 * 
 */