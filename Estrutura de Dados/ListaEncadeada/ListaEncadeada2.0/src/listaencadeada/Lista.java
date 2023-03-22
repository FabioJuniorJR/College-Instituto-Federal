
public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    // Metodo verifica se a Lista esta vazia
    public boolean vazia() {
        if (primeiro == null) {
            String vazia = "esta vazia";
            return true; // Se a lista estiver fazia mostra no terminal true
        } else {
            String preenchida = "há itens na lista";
            return false;
        } // Se a lista estiver fazia mostra no terminal false
    }

    // Insere na primeira posicao da Lista
    public void insereprimeiro(int valor) {
        No no1 = new No(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
    }

    // Mostra os elemenetos da Lista se ela nao estiver vazia
    public void imprimi() {
        if (vazia()) {
            System.out.println("A lISTA ESTÁ VAZIA");
        } else {
            No aux = primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProximo();
            }
        }

    }

    // Insere valor na ultima posição da Lista
    public void insereFim(int valor) {
        if (vazia()) {
            insereprimeiro(valor);
        } else {
            No cursor = primeiro;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            No no1 = new No(valor);
            cursor.setProximo(no1);
        }
    }

    // Insere valor depois, onde temos {a, b, c, d} acrescentando a1 apos o a, o a
    // deixara de apontar para b a passara a apontar para a1.
    public void insereDepois(No no, int valor) {
        No no1 = new No(valor);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);
    }

    // Remove priemiro valor da Lista
    public No removePrimeiro() {
        if (vazia()) {
            System.out.println("A lista esta vazia");
            return null;
        } else {
            No cursor = primeiro;
            primeiro.getProximo().getInfo();
            return cursor;
        }
    }

    public int comprimento() {
        if (primeiro == null)
            return 0;

        No cursor = primeiro;
        int i = 1;

        while (cursor.getProximo() != null) {
            cursor = cursor.getProximo();
            i = i + 1;
        }
        return i;
    }

    /*
    public void retira(int v){
        if(vazia()){
            System.out.println("A lista esta vazia");
        }else{
            No primeiro = getPrimeiro();
            No cursor = primeiro;
            boolean encontrou = false;
            while(encontrou == false){
                if(cursor.getProximo().getInfo()!= v){ 
                    cursor = cursor.getProximo();
                }else{
                    break;
                }

                
            }
        }
    }*/
    // Remove valor qualquer da Lista
    // Passado valor v tipo No para comparar onjeto tipo e remove-lo 
    public void retira(No v) {
        if (vazia()) {
            System.out.println("A lista esta vazia");
        } else {
            No anteriorValor = null;
            No cursor = primeiro;
            while (cursor.getProximo() != null) {
                anteriorValor = cursor;
                cursor = cursor.getProximo();
                if (cursor.equals(v)) {
                    anteriorValor.setProximo(cursor.getProximo());
                }
            }
        }
    }

    public void libera(){
        System.out.println("Lista atual");
        insereprimeiro(10);
        insereprimeiro(22);
        insereFim(33);
        insereFim(44);
        imprimi();
        primeiro = null; // atrubui null
        System.out.println("Lista esta vazia ou nao?"); // chama metodo imprimi que verifica se a lista esta vazia e retorna a mensagem se esta vazia ou nao
        imprimi();
        
    }

    public void igual(){
        
    }












    @Override
    public String toString() {
        if (this.vazia()) {
            return "Lista vazia.";
        }
        String s = "Lista simples: ";
        No p = this.primeiro;
        while (p != null) {
            s = s + p.toString() + " ";
            p = p.getProximo();
        }
        return s;

    }
}