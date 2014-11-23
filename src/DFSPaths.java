import java.util.List;

/**
 * Created by root on 22/11/14.
 */
public class DFSPaths {

    private final Graph graph;
    private final Vertex source;
    private final Vertex[] marked;
    private final Vertex[] edgeTo;

    public DFSPaths(Graph graph, Vertex source) {
        this.graph = graph;
        this.source = source;
        marked = new Vertex[graph.getListOfVertices().size()];
        edgeTo = new Vertex[graph.getListOfVertices().size()];
        dfs(source,source);
    }

    private void dfs(Vertex pathTo,Vertex source){
        if(isMarked(pathTo)){
            System.out.println(pathTo.getIdentityNumber()+" is already marked!");
            return;
        }

        marked[pathTo.getIdentityNumber()]=pathTo;
        edgeTo[pathTo.getIdentityNumber()]=source;
        System.out.println("Marking "+pathTo.getIdentityNumber());
        for (Vertex adjacentVertex : pathTo.getAdjacentVertices()) {
            System.out.println("Going to "+ adjacentVertex.getIdentityNumber()+" from "+pathTo.getIdentityNumber());
            dfs(adjacentVertex,pathTo);
        }
    }

    private boolean isMarked(Vertex vertex){
        for (Vertex vertex1 : marked) {
            if(vertex1!=null && vertex1.getIdentityNumber()==vertex.getIdentityNumber()){
                return true;
            }
        }
        return false;
    }

    public boolean hasPathTo(Vertex vertex){
        for (Vertex markedVertex : marked) {
            if(markedVertex !=null && markedVertex.getIdentityNumber() == vertex.getIdentityNumber()){
                return true;
            }
        }
        return false;
    }

    public String pathTo(Vertex vertex){
        String pathTo = vertex.getIdentityNumber()+"-->";
        for (int start = vertex.getIdentityNumber();
             vertex.getIdentityNumber() != source.getIdentityNumber();
             start = edgeTo[vertex.getIdentityNumber()].getIdentityNumber()) {

            vertex = edgeTo[vertex.getIdentityNumber()];
            pathTo += vertex.getIdentityNumber() + "-->";

        }
        return pathTo;
    }

}
