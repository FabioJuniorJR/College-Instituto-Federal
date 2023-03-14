package listaencadeada;

public class No {
    private int info;
    private No proximo; // tipo objeto Nó, pois vai apontar para o proximo objeto tipo Nó

    public No(int info) {
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}
