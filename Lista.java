package listaencadeada;

public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    // Metodo verifica se a Lista esta vazia
    public boolean vazia() {
        if (primeiro == null) {
            return true; // Se a lista estiver fazia mostra no terminal true
        } else {
            return false;
        } // Se a lista estiver fazia mostra no terminal false
    }

    // Insere na primeira posicao da Lista
    public void insereprimeiro(int valor) {
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
    }

}
