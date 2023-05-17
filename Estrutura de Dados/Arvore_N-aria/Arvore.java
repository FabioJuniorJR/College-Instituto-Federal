public class Arvore {
    
    private NoArvore raiz;

    public Arvore(){
    }

    public NoArvore criaNo(int info){
        NoArvore novaArvore = new NoArvore(info, null, null);
        raiz = novaArvore;
        return novaArvore;

    }
    public void inserefilho(NoArvore pai, NoArvore filho){
        String s = " ";
        filho.setProximo(pai.getPrimeiro());
        pai.setPrimeiro(filho);
        raiz = pai;
    }
    @Override
    public String toString() {
        return imprimi(raiz);
    }
    private String imprimi(NoArvore no){
        String s = new String("");
        s = s + "<";
        s = s + no.getInfo();
        NoArvore p = no.getPrimeiro();
        while(p != null){
            s = s + imprimi(p);
            p = p.getProximo();
        }
        s = s + ">";
        return s;
    }
    public boolean pertence(int info){
        return true;
    }
    private boolean pertence(int info, NoArvore noArvore){
        return true;
    }
    public int altura(){
        return 1;
    }
    private int altura(NoArvore no){
        return 1;
    }


    
}
