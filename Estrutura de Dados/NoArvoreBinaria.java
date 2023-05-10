public class NoArvoreBinaria {
    private int info;
    private NoArvoreBinaria sea;
    private NoArvoreBinaria sad;

    public NoArvoreBinaria(int info) {
        this.info = info;
        sea = null;
        sad = null;
    }

    public NoArvoreBinaria(int info, NoArvoreBinaria sea, NoArvoreBinaria sad) {
        this.info = info;
        this.sea = sea;
        this.sad = sad;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvoreBinaria getSea() {
        return sea;
    }

    public void setSea(NoArvoreBinaria sea) {
        this.sea = sea;
    }

    public NoArvoreBinaria getSad() {
        return sad;
    }

    public void setSad(NoArvoreBinaria sad) {
        this.sad = sad;
    }

    @Override
    public String toString() {
        return "NoArvoreBinaria [info=" + info + ", sea=" + sea + ", sad=" + sad + "]";
    }

    
    

}
/* Métodos Implemetar:
+NoArvoreBinaria(info: int)                                 (Feito)    
+NoArvoreBinaria(info: int, esq, dir: NoArvoreBinaria)      (Feito)    
+setInfo(info : int)                                        (Feito)    
+getInfo() : int                                            (Feito)    
+setSae(esq : NoArvoreBinaria) : void                       (Feito)    
+getSae() : NoArvoreBinaria                                 (Feito)    
+setSad(dir : NoArvoreBinaria) : void                       (Feito)    
+getSad() : NoArvoreBinaria                                 (Feito)    
+toString() : String                                        (Feito)   
(Concluido - 100%) 
 */