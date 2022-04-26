import java.util.*;

public class Main {

    public static void main(String[] args) {
        CreateMap map = new CreateMap();
    }


    // Method performs Dijkstra's algorithm to find the shortest path between source and goal
    public static Graph calculateDijkstra(Graph graph, NewNode source, NewNode goal) {
        source.setDistance(0);

        Set<NewNode> settledNodes = new HashSet<>();
        Set<NewNode> unsettledNodes = new HashSet<>();
        List<NewNode> finalPath = new LinkedList<>();
        int goalDistance = Integer.MAX_VALUE;
        String goalText = "";

        unsettledNodes.add(source);
        System.out.println("Starting with " + source.getVertex());

        while (unsettledNodes.size() != 0) {
            NewNode currentNode = getShortestDistanceNode(unsettledNodes);
            int currentDistance = currentNode.getDistance();

            // If the current node is the goal node, save the values
            if (currentNode == goal) {
                    goalDistance = currentDistance;
                    finalPath = currentNode.getShortestPath();
                    goalText = "DESTINATION FOUND --> ";
            }

            unsettledNodes.remove(currentNode);

            // Prints which node we're looking at and values for easier reading
            System.out.println(goalText + "Looking at " + currentNode.getVertex() + ". Distance from source: " +
                    currentNode.getDistance() + ". Adjacent nodes: " + stringifyMap(currentNode.adjacentNodes, currentNode));

            // Looping through the current nodes map-object containing neighbouring nodes,
            // ads the neighbour with the shortest distance.
            for (Map.Entry<NewNode, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                NewNode adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
            goalText = "";
        }
        // Sets values and prints the shortest path to the goal node
        goal.setDistance(goalDistance);
        String goalName = goal.getVertex();
        System.out.println("Target found. Path to " + goalName + " with length: " + goal.getDistance() + ". " + stringify(finalPath) + "" + goalName + ".");
        return graph;
    }

    // Method to find the node with the shortest distance in a Set
    public static NewNode getShortestDistanceNode(Set<NewNode> unsettledNodes) {
        NewNode lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (NewNode node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
/**
    private static NewNode getShortestDistanceTwo(Set<NewNode> unsettledNodes) {
        NewNode lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (NewNode node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }*/

    // Method checks if the given adjacent node has the current shortes distance,
    // if true - ads to the shortest path list
    private static void calculateMinDistance(NewNode adjacentNode, Integer edgeWeight, NewNode sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeight < adjacentNode.getDistance()) {
            adjacentNode.setDistance(sourceDistance + edgeWeight);
            LinkedList<NewNode> shortestPath = new LinkedList<NewNode>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            adjacentNode.setShortestPath(shortestPath);
        }
    }

    private static String stringify(List<NewNode> finalpath) {
        String path = "";
        for (NewNode n : finalpath) {
            path += n.getVertex() + " --> ";
        }
        return path;
    }

    private static String stringifyMap(Map<NewNode, Integer> adjacentNodes, NewNode node) {
        String path = "";
        for (Map.Entry< NewNode, Integer> adjacencyNodes : node.getAdjacentNodes().entrySet()) {
            NewNode sideNode = adjacencyNodes.getKey();
            path += sideNode.getVertex() + ". ";
        }
        return path;
    }
}

