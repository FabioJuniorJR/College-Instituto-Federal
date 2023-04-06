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

    