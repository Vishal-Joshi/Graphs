import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 22/11/14.
 */
public class GraphEdgeFinder {


    public static void main(String args[]){
        Graph graph = buildGraph();
        //printEdgesOfTheGraph(graph);
        DFSPaths dfsPathAlgorithm = new DFSPaths(graph,graph.getListOfVertices().get(0));
        System.out.println(dfsPathAlgorithm.hasPathTo(new Vertex(3,null)));
        System.out.println(dfsPathAlgorithm.pathTo(new Vertex(7,null)));
    }



    private static void printEdgesOfTheGraph(Graph graph) {
        for (Vertex vertex : graph.getListOfVertices()) {
            for (Vertex adjacentVertex : vertex.getAdjacentVertices()) {
                System.out.println(vertex.getIdentityNumber()+"--"+adjacentVertex.getIdentityNumber());
            }
        }
    }


    private static Graph buildGraph() {
        List<Vertex> listOfVerticesFor1 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor0 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor2 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor6 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor4 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor5 = new ArrayList<Vertex>();
        List<Vertex> listOfVerticesFor3 = new ArrayList<Vertex>();
        Vertex v1 = new Vertex(1,listOfVerticesFor1);
        Vertex v0 = new Vertex(0,listOfVerticesFor0);
        Vertex v2 = new Vertex(2,listOfVerticesFor2);
        Vertex v6 = new Vertex(6,listOfVerticesFor6);
        Vertex v4 = new Vertex(4,listOfVerticesFor4);
        Vertex v5 = new Vertex(5,listOfVerticesFor5);
        Vertex v3 = new Vertex(3,listOfVerticesFor3);
        Vertex v7 = new Vertex(7,null);

        listOfVerticesFor1.add(v0);
        listOfVerticesFor0.add(v1);
        listOfVerticesFor0.add(v2);
        listOfVerticesFor2.add(v0);
        listOfVerticesFor6.add(v0);
        listOfVerticesFor6.add(v4);
        listOfVerticesFor0.add(v6);
        listOfVerticesFor4.add(v6);
        listOfVerticesFor5.add(v0);
        listOfVerticesFor0.add(v5);
        listOfVerticesFor5.add(v4);
        listOfVerticesFor4.add(v5);
        listOfVerticesFor3.add(v4);
        listOfVerticesFor4.add(v3);

        List<Vertex> listOfVerticesOnGraph = new ArrayList<Vertex>();
        listOfVerticesOnGraph.add(v0);
        listOfVerticesOnGraph.add(v1);
        listOfVerticesOnGraph.add(v2);
        listOfVerticesOnGraph.add(v3);
        listOfVerticesOnGraph.add(v4);
        listOfVerticesOnGraph.add(v5);
        listOfVerticesOnGraph.add(v6);
        Graph graph = new Graph(listOfVerticesOnGraph);
        return graph;
    }
}
