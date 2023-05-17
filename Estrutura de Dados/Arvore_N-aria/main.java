public class main {
    
    public static void main(String []args){
        Arvore a = new Arvore();
        NoArvore no1 = a.criaNo(1);
        NoArvore no2 = a.criaNo(2);
        NoArvore no3 = a.criaNo(3);
        NoArvore no4 = a.criaNo(4);
        NoArvore no5 = a.criaNo(5);
        NoArvore no6 = a.criaNo(6);
        NoArvore no7 = a.criaNo(7);
        NoArvore no8 = a.criaNo(8);
        NoArvore no9 = a.criaNo(9);
        NoArvore no10 = a.criaNo(10);

        a.inserefilho(no3, no4);
        a.inserefilho(no2, no5);
        a.inserefilho(no2, no3);
        a.inserefilho(no9, no10);
        a.inserefilho(no7, no9);
        a.inserefilho(no7, no8);
        a.inserefilho(no1, no7);
        a.inserefilho(no1, no6);
        a.inserefilho(no1, no2);



        System.out.println(a.toString()); 

    }
}
