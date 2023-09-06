/*package Grafos;

public class Aresta {
    //private int numArestas;
    private Vertice verticeOrigem;
    private Vertice verticeFinal;

    public Aresta(int numArestas, Vertice verticeOrigem, Vertice verticeFinal) {
        //this.numArestas = numArestas;
        this.verticeOrigem = verticeOrigem;
        this.verticeFinal = verticeFinal;
    }

    public int getNumArestas() {
        return numArestas;
    }

    public void setNumArestas(int numArestas) {
        this.numArestas = numArestas;
    }

    public Vertice getVerticeOrigem() {
        return verticeOrigem;
    }

    public void setVerticeOrigem(Vertice verticeOrigem) {
        this.verticeOrigem = verticeOrigem;
    }

    public Vertice getVerticeFinal() {
        return verticeFinal;
    }

    public void setVerticeFinal(Vertice verticeFinal) {
        this.verticeFinal = verticeFinal;
    }

    @Override
    public String toString() {
        return "Aresta [     verticeOrigem = " + verticeOrigem + ", verticeFinal = "
                + verticeFinal + " ]";
    }

    
}*/
package Grafos;
public class Aresta{
    private Vertice verticeLado1;
    private Vertice verticeLado2;
    private int numeroArestas;

    public Vertice getVerticeLado1() {
        return verticeLado1;
    }

    public void setVerticeLado1(Vertice verticeLado1) {
        this.verticeLado1 = verticeLado1;
    }

    public Vertice getVerticeLado2() {
        return verticeLado2;
    }

    public void setVerticeLado2(Vertice verticeLado2) {
        this.verticeLado2 = verticeLado2;
    }

    public int getNumeroArestas() {
        return numeroArestas;
    }

    public void setNumeroArestas(int numeroArestas) {
        this.numeroArestas = numeroArestas;
    }

    @Override
    public String toString() {
        return "Aresta [verticeLado1=" + verticeLado1 + ", verticeLado2=" + verticeLado2 + ", numeroArestas="
                + numeroArestas + "]";
    }

    
    
    
}

