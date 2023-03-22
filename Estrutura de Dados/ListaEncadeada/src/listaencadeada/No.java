package listaencadeada;


public class No<T> { //Este tipo generico T vai ser passado quando criarmos nossa Lista(nosso Nó)
    private T elemento;
    private No<T> proximo;

    public No(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
    public No(T elemento, No<T> proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    public T getElemento() {
        return elemento;
    }

    
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    
    public No<T> getProximo() {
        return proximo;
    }

    
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    public String toSting(){
        StringBuilder builder = new StringBuilder();
        builder.append("No [elemento] = ").append(elemento).append(", proximo = ").append(proximo).append("]");
        return builder.toString();
    }
    
}
