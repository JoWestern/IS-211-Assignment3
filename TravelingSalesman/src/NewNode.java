import java.util.*;

public class NewNode {
    private String vertex;
    private List<Edge> edges = new LinkedList<>();
    private List<NewNode> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Integer trueDistance = 0;

    Map<NewNode, Integer> adjacentNodes = new HashMap<>();

    public NewNode(String vertex) {
        this.vertex = vertex;
    }

    public Map<NewNode, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<NewNode, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public List<Edge> getEdge() {
        return edges;
    }

    public void setShortestPath(List<NewNode> sp) {
        this.shortestPath = sp;
    }

    public List<NewNode> getShortestPath() {
        return shortestPath;
    }

    public String getVertex() {
        return vertex;
    }

   public void addEdge(Edge n) {
        edges.add(n);
   }

   public void setDistance(int dist) {
        this.distance = dist;
   }

   public int getDistance() {
        return distance;
   }

   public void setTrueDistance(int trueDistance) {this.trueDistance = trueDistance;}

    public int getTrueDistance() { return trueDistance;}

   public void addDestination(NewNode destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
}
