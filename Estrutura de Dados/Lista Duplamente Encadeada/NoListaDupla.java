public class NoListaDupla {
    private int valor;
    private NoListaDupla proximo;
    private NoListaDupla anterior;

    public NoListaDupla(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public NoListaDupla getProximo() {
        return proximo;
    }

    public void setProximo(NoListaDupla proximo) {
        this.proximo = proximo;
    }

    public NoListaDupla getAnterior() {
        return anterior;
    }

    public void setAnterior(NoListaDupla anterior) {
        this.anterior = anterior;
    }
}























/*public class NoListaDupla{
    private int valor;
    private NoListaDupla proximo;
    private  NoListaDupla anterior;
        
    public NoListaDupla(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
    // busca valor No
    public int getvalor() {
        return valor;
    }
    // set valor No
    public void setvalor(int valor) {
        this.valor = valor;
    }
    // busca proximo No
    public NoListaDupla getProximo() {
        return proximo;
    }
    // set próximo No
    public void setProximo(NoListaDupla proximo) {
        this.proximo = proximo;
    } 
    // set Nó anterior
    public void setAnterior(NoListaDupla anterior){
        this.anterior = anterior;
    }
    // busca Nó anterior
    public NoListaDupla getAnterior(){
        return anterior;
    }

    
}*/