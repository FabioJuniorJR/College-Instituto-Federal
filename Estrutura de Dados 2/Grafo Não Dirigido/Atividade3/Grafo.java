package Grafos;
import java.util.ArrayList;
import java.util.LinkedList;

public class Grafo{
    private ArrayList<Vertice> listaVertices = new ArrayList<>();
    private ArrayList<Aresta> listaArestas = new ArrayList<>();
    private int numeroVertice = 0;
    private int numeroAresta = 0;

    public Grafo(){
        //No precisa começar com parametros, pois não precisa começar com valores
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
        return listaVertices.size();
    }
    public int getTamanho(){
        return listaArestas.size();
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
    public void removeVertice(Vertice verticeDesejado){
        ArrayList<Integer> listAUXremoveVertice =  new ArrayList<>();
        for(int i = 0; i < listaArestas.size(); i++){
            if(verticeDesejado == listaArestas.get(i).getVerticeLado1() || verticeDesejado == listaArestas.get(i).getVerticeLado2()){
                listAUXremoveVertice.add(i);
            }
        }
        for(int j = listaArestas.size()-1; j >= 0; j--){// começa com os de tras com -1 porque o array list funciona como pilha, tira o primeiro e cai todo resto
            listaArestas.remove(listAUXremoveVertice.get(j).intValue());
        }
        for(int v = 0; v < listaVertices.size(); v++){
            if(listaVertices.get(v) == verticeDesejado){
                listaVertices.remove(v);
            }
        }
    }
    public void insereAresta(Vertice v1, Vertice v2){
        numeroAresta++;
        Aresta novaAresta = new Aresta(v1, v2, numeroAresta);
        listaArestas.add(novaAresta);
    }
    public void removeAresta(Aresta a){
        for(int ar = 0; ar < listaArestas.size(); ar++){
            if(listaArestas.get(ar) == a){
                listaVertices.remove(ar);
            }
        }
    }
    public ArrayList<Vertice> vertAdj(Vertice v){
        ArrayList <Vertice> listVertAdj = new ArrayList<>();
        for(int i = 0; i < listaArestas.size(); i++){
            if(listaArestas.get(i).getVerticeLado1() == v){
                listVertAdj.add(listaArestas.get(i).getVerticeLado2());
            }
            if(listaArestas.get(i).getVerticeLado2() == v){
                listVertAdj.add(listaArestas.get(i).getVerticeLado1());
            }
        }if(listaVertices.size() == 0){
            return null;
        }
        else{
            return listVertAdj;
        }
    }
    public void buscaLargura(Vertice inicial){
        boolean [] verticeVisitado = new boolean[numeroVertice];
        LinkedList<Vertice> filaVertice = new LinkedList<>();
    verticeVisitado[inicial.getDadoInt()] = true;
    filaVertice.add(inicial);
    while(!filaVertice.isEmpty()){
      Vertice atual = filaVertice.poll();
      System.out.println(atual.getDadoInt() + " ");  
      for(Aresta aresta : atual.getListaArestas()){
        Vertice visinho = (aresta.getVerticeLado1() == atual) ? aresta.getVerticeLado2() : aresta.getVerticeLado1();
        if(!verticeVisitado[visinho.getDadoInt()]){
            verticeVisitado[visinho.getDadoInt()] = true;
            filaVertice.add(visinho);
        }
    }
    }
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
removeV(v) remove o vértice v e todas as suas arestas incidentes // Finalizado
insereA(u, v) instancia uma nova aresta incidente aos vértices u e v, e a adiciona ao grafo // Finalizado
removeA(e) remove a aresta e // Finalizado
adj(v) retorna uma iteração com todos os vértices adjacentes ao vértice u // Finalizado
getA(u, v) retorna uma referência para a aresta de u para v ou null se os vértices não forem adjacentes.// 
grau(v) retorna o grau do vértice v em grafos não dirigidos. Alternativamente, pode-se usar os dois métodos
 anteriores em grafos não dirigidos de forma que grauE(v) e grauS(v) retornem o mesmo resultado //Finalizado
verticesA(e) retorna o par de vértices que conectados à aresta e. Se o grafo for dirigido, o primeiro vértice do par é a origem e o segundo é o destino da aresta oposto(v,e) para um vértice v incidente à aresta e, retorna o outro vértice 
incidente à aresta //
arestasE(v) retorna uma iteração de todas as arestas de entrada do vértice v //
arestasS(v) retorna uma iteração de todas as arestas de saída do vértice v //
*/