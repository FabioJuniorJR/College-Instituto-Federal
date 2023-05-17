public class NoArvore{
    private int info;
    private NoArvore primeiro;
    private NoArvore proximo; 

    public NoArvore(int info, NoArvore primeiro, NoArvore proximo) {
        this.info = info;
        this.primeiro = primeiro;
        this.proximo = proximo;
    }
    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvore getPrimeiro() {
        return primeiro;
    }
    
    public void setPrimeiro(NoArvore primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString() {
        return "NoArvore [info=" + info + ", primeiro=" + primeiro + ", proximo=" + proximo + "]";
    }
    
    
}