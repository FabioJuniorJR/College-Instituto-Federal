package listaencadeada;


public class ListaEncadeada<T> {
    private  No<T> inicio;
    
    public void addElemento(T elemento){ //adiciona elemento do tipo T
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("ListaEncadeada [inicio = ").append(inicio).append("]");
        return builder.toString();
    }
}
