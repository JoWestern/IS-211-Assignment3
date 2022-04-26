public class Edge {
    private NewNode destination;
    private int weight;

    public Edge(NewNode destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public NewNode getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}
