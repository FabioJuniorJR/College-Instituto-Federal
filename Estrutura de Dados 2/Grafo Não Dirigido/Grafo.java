package Grafos;

import java.util.ArrayList;

public class Grafo{
    private ArrayList<Vertice> listaVertices = new ArrayList<>();
    private ArrayList<Aresta> listaArestas = new ArrayList<>();
    private int numeroVertice = 0;
    private int numeroAresta = 0;

    public Grafo(){
        //No precisa começar com parametros, pois nãao precisa começar com valores
    }
    public ArrayList<Vertice> getListaVertices(){
        return listaVertices;
    }
    public void setVertices(ArrayList<Vertice> listaVertices){
        this.listaVertices = listaVertices;
    }
    public ArrayList<Aresta> getListaArestas(){
        return listaArestas;
    }
    public void setNumArestas(ArrayList<Aresta> listaArestas){
        this.listaArestas = listaArestas;
    }
    public int getOrdem(){
        return numeroVertice;
    }
    public int getTamanho(){
        return numeroAresta;
    }
    public ArrayList<Vertice> vertices(){
        return listaVertices;
    }
    public ArrayList<Aresta> arestas(){
        return listaArestas;
    }
    public void insereVertice(){
        numeroVertice++;
        Vertice novoVertice = new Vertice(numeroVertice);
        listaVertices.add(novoVertice);
    }
    /*Concertar
    public void removeVertice(Vertice verticeDesejado){
        for(Vertice vertice: listaVertices){
            if(vertice == verticeDesejado){
                System.out.println("encontrou");
            }
        }
    }*/
    public Aresta insereAresta(Vertice u, Vertice v){
        Aresta novAresta = new Aresta();
        listaArestas.add(novAresta);
        return novAresta;
    }
    public void removeAresta(Aresta a){
        listaArestas.remove(a);

    }

}


/*Descricao
Importante: a sua estrutura deve ser implementada como listas de adjacencia ou mapas de
adjacˆencia, cabendo a vocˆe decidir qual prefere implementar.
O quadro mostrado na figura 1 mostra o conjunto m ́ınimo de opera ̧c ̃oes que vocˆe deve implementar
neste exerc ́ıcio para grafos simples n ̃ao-dirigidos. M ́etodos construtores e acessores n ̃ao est ̃ao
descritos no quadro, mas devem ser implementados. Vocˆe tamb ́em deve desenvolver alguma forma de
identificar v ́ertices e arestas (por exemplo, por um identificador inteiro ou string). Note que algumas

opera ̧c ̃oes s ̃ao gerais para qualquer tipo de grafos e outras s ̃ao particulares a grafos dirigidos ou n ̃ao-
dirigidos (tais como opera ̧c ̃oes para obter o grau de um v ́ertice).

Al ́em das opera ̧c ̃oes descritas acima, vocˆe deve implementar uma opera ̧c ̃ao para retornar uma string
representando o grafo de forma textual.

---Operação Descrição---
getOrdem( ) retorna quantidade de vértices // Finalizdo
getTamanho( ) retorna quantidade de arestas // Finalizado
vertices( ) retorna uma iteração de todos os vértices do grafo // Finlizado
arestas( ) retorna uma iteração de todas as arestas do grafo // Finalizdo
insereV( ) instancia um novo vértice e o adiciona ao grafo // Finlizado
removeV(v) remove o vértice v e todas as suas arestas incidentes //
insereA(u, v) instancia uma nova aresta incidente aos vértices u e v, e a adiciona ao grafo //
removeA(e) remove a aresta e //
adj(v) retorna uma iteração com todos os vértices adjacentes ao vértice u // 
getA(u, v) retorna uma referência para a aresta de u para v ou null se os vértices não forem adjacentes. Para grafos não dirigidos //
getA(u, v) e getA(v, u) produzem o mesmo resultado //
grauE(v) retorna o grau de entrada do vértice v em grafos dirigidos //
grauS(v) retorna o grau de saída do vértice v em grafos dirigidos //
grau(v) retorna o grau do vértice v em grafos não dirigidos. Alternativamente, pode-se usar os dois métodos anteriores em grafos não dirigidos de forma que grauE(v) e grauS(v) retornem o mesmo resultado //
verticesA(e) retorna o par de vértices que conectados à aresta e. Se o grafo for dirigido, o primeiro vértice do par é a origem e o segundo é o destino da aresta oposto(v,e) para um vértice v incidente à aresta e, retorna o outro vértice 
incidente à aresta //

arestasE(v) retorna uma iteração de todas as arestas de entrada do vértice v //
arestasS(v) retorna uma iteração de todas as arestas de saída do vértice v //
*/