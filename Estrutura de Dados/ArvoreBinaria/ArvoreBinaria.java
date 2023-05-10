public class ArvoreBinaria {
    private NoArvoreBinaria raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    //insere: m etodo para inserir um novo valor, juntamente com suas sub-arvores
    public NoArvoreBinaria insere(int v, NoArvoreBinaria sea, NoArvoreBinaria sad){
        NoArvoreBinaria no = new NoArvoreBinaria(v, sea, sad);
        this.raiz = no;
        return no;
    }

    //este metodo deve retornar um valor booleano indicando se a ́arvore  ́e vazia ou nao;
    public boolean vazia(){
        return (raiz == null);
    }
    
    //retorna uma string com a representa cao textual da  ́arvore
    public String toString(){
        return imprimiPre(this.raiz);
    }

    //m etodos para imprimir  ́arvores bin ́arias em pre-ordem,
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

    //método que verifca se há um determinado valor na arvore
    public boolean pertence(int info){
        return pertence(raiz, info);
    }   

    private boolean pertence(NoArvoreBinaria no, int info){
        if(no == null){
            return false;
        }else{
            return ((no.getInfo() == info)||pertence(no.getSea(), info)||(pertence(no.getSad(), info)));
        }
    }

    public void imprimiPos(int info){
        if(info != null){
            imprimiPre(no.getSea());
            imprimiPre(no.getSad());
            System.out.print(no.getInfo());
        }
       
    }
    public String imprimiSim(NoArvoreBinaria no){
        String s = "";
        s = s + "<";
        if(no != null){
            System.out.print(no.getInfo());
            imprimiSim(no.getSea());
            imprimiSim(no.getSad());
        }
        s = s + ">";
        return s; 
    }

/* 
    public int pares(){

    }

    public int folohas(){
        
    }

    

    public int numNos(){
        
    }

    public int altura(){
        
    }

    public int igual(){
        
    }

*/
    
}

/*
Métodos Implementar:
+ArvoreBinaria()                                                (Feito)
+insere(v : int, esq, dir: NoArvoreBinaria) : NoArvoreBinaria   (Feito)
+vazia() : boolean                                              (Feito)
+toString() : String                                            (Feito)
-toStringAux(no: NoArvoreBinaria) : String                      (Nao Feito)
+pertence(info: int) : boolean                                  (Feito)
- pertence(no: NoArvoreBinaria, info: int) : boolean            (Feito)
+ pares(): int                                                  (Nao Feito)
+ folhas(): int                                                 (Nao Feito)
+ imprimePre(): String                                          (Feito)
+ imprimePre(): String                                          (Nao Feito)
+ imprimePre(): String                                          (Nao Feito)
+ numNos(): int                                                 (Nao Feito)
+ altura(): int                                                 (Nao Feito)
+ igual(a: ArvoreBinaria): boolean                              (Nao Feito)
 */