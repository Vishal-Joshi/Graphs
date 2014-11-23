import java.util.List;

/**
 * Created by root on 22/11/14.
 */
public class Vertex {

    private int identityNumber;

    private List<Vertex> adjacentVertices;

    public Vertex(int identityNumber, List<Vertex> adjacentVertices) {
        this.identityNumber = identityNumber;
        this.adjacentVertices = adjacentVertices;
    }


    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public int getIdentityNumber() {
        return identityNumber;
    }
}
