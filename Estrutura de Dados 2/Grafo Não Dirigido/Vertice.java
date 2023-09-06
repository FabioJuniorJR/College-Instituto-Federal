/*package Grafos;

import java.util.ArrayList;

public class Vertice {
    private int dado;
    private ArrayList<Aresta> listAresta = new ArrayList<Aresta>();

    public Vertice(int dado){
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta> getListAresta() {
        return listAresta;
    }

    public void setListAresta(ArrayList<Aresta> listAresta) {
        this.listAresta = listAresta;
    }

    @Override
    public String toString() {
        return "Vertice [dado = " + dado + ", listAresta = " + listAresta + "]";
    }

    
}*/
package Grafos;

import java.util.ArrayList;

public class Vertice{
    private int dadoInt;
    private ArrayList<Aresta> listaArestas;

    public Vertice(int num){
        this.dadoInt = num;
        this.listaArestas = new ArrayList<Aresta>();
    }

    public int getDadoInt() {
        return dadoInt;
    }

    public void setDadoInt(int dadoInt) {
        this.dadoInt = dadoInt;
    }

    public ArrayList<Aresta> getListaArestas() {
        return listaArestas;
    }

    public void setListaArestas(Aresta listaArestas) {
        this.listaArestas.add(listaArestas);
    }

    @Override
    public String toString() {
        return "Vertice [dadoInt=" + dadoInt + ", listaArestas=" + listaArestas + "]";
    }
    
    

    



}
