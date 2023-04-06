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
    
}
