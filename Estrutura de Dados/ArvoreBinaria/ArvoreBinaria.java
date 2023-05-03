public class ArvoreBinaria {
    private NoArvoreBinaria raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public NoArvoreBinaria insere(int v, NoArvoreBinaria sea, NoArvoreBinaria sad){
        NoArvoreBinaria no = new NoArvoreBinaria(v, sea, sad);
        this.raiz = no;
        return no;
    }

    public boolean vazia(){
        return (raiz == null);
    }
    
    public String toString(){
        return imprimiPre(this.raiz);
    }

    private String imprimiPre(NoArvoreBinaria no){
        String s = "";
        s = s + "<";
        if(no != null){
            s = s + no.getInfo();
            s = s + imprimiPre(no.getSea());
            s = s + imprimiPre(no.getSad());
        }
        s = s + ">";
        return s; 
    }

/* 
    public boolean pertence(){

    }

    public boolean pertence(){
        
    }
*/
    
}
