package Grafos;
public class Aresta{
    private Vertice verticeLado1;
    private Vertice verticeLado2;
    private int numeroArestas;

    public Aresta(Vertice verticeLado1, Vertice verticeLado2, int numeroArestas) {
        this.verticeLado1 = verticeLado1;
        this.verticeLado2 = verticeLado2;
        this.numeroArestas = numeroArestas;
    }

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

