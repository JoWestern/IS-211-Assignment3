import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<NewNode> nodes = new HashSet<>();

    public void addNode(NewNode node) {
        nodes.add(node);
    }

    // getters and setters


    public void setNodes(Set<NewNode> nodes) {
        this.nodes = nodes;
    }

    public Set<NewNode> getNodes() {
        return nodes;
    }
}