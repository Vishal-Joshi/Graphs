import java.util.Iterator;
import java.util.List;

public class Graph {

    private List<Vertex> listOfVertices;

    public Graph(List<Vertex> listOfVertices) {
        this.listOfVertices = listOfVertices;
    }

    public Iterator adjacentTo(int v){
        Vertex vertexForTheNumber = findVertex(v);
        if(vertexForTheNumber != null){
             return vertexForTheNumber.getAdjacentVertices().iterator();
        }
        return null;
    }

    private Vertex findVertex(int v) {
        for (Vertex vertex : listOfVertices) {
            if(vertex.getIdentityNumber() == v) {
                return vertex;
            }
        }
        return null;
    }

    public List<Vertex> getListOfVertices(){
        return listOfVertices;
    }
}
