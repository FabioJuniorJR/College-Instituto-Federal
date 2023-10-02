public class Main {
    public static void main(String []args){
        Grafo grafo1 = new Grafo();
        System.out.println("Exemplo1");
        grafo1.insereVertice();
        grafo1.insereVertice();
        grafo1.insereAresta(grafo1.getListaVertices().get(0), grafo1.getListaVertices().get(1));
        System.out.println(grafo1.getListaVertices());
        System.out.println(grafo1.getListaArestas());
        //retorna com qual vertice a aresta esta ligado, caso tenha aparece Vertice[dadoInt=numero identificador do vertice
        System.out.println(grafo1.getListaArestas().get(0).getVerticeLado1());
        System.out.println(grafo1.getListaArestas().get(0).getVerticeLado2());
        System.out.println();
        System.out.println("Exemplo 2");
        Grafo grafo2 = new Grafo();
        //grafo em formato de casa
        grafo2.insereVertice();
        grafo2.insereVertice();
        grafo2.insereVertice();
        grafo2.insereVertice();
        grafo2.insereVertice();
        //grafo2.insereVertice();
        //grafo2.insereAresta(grafo2.getListaVertices().get(0), grafo2.getListaVertices().get(1));
        grafo2.insereAresta(grafo2.getListaVertices().get(0), grafo2.getListaVertices().get(1));
                grafo2.insereAresta(grafo2.getListaVertices().get(1), grafo2.getListaVertices().get(2));
                grafo2.insereAresta(grafo2.getListaVertices().get(2), grafo2.getListaVertices().get(3));
                grafo2.insereAresta(grafo2.getListaVertices().get(3), grafo2.getListaVertices().get(4));
                grafo2.insereAresta(grafo2.getListaVertices().get(0), grafo2.getListaVertices().get(4));
                        grafo2.insereAresta(grafo2.getListaVertices().get(4), grafo2.getListaVertices().get(5));

                System.out.println(grafo2.getListaVertices());
                System.out.println(grafo2.getListaArestas());
                System.out.println(grafo1.getListaArestas().get(0).getVerticeLado1());
                System.out.println(grafo1.getListaArestas().get(0).getVerticeLado2());
                System.out.println("");
        System.out.println(grafo2.vertAdj(grafo2.getListaVertices().get(0)));
                        System.out.println("");
        grafo2.buscaLargura(grafo2.getListaVertices().get(4));
      
    }
}