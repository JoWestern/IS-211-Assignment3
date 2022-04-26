import java.util.*;

public class BruteForce {

    public static Set<NewNode> settldNodes = new HashSet<>();
    public static Set<NewNode> unsettldNodes = new HashSet<>();
        public static Graph calculateBrute(Graph graph, NewNode source, NewNode goal) {
            source.setDistance(0);
            List<NewNode> finalPath = new LinkedList<>();
            int goalDistance = Integer.MAX_VALUE;
            String goalText = "";
            NewNode currentNode = source;

            unsettldNodes.add(source);
            System.out.println("Starting with " + source.getVertex());

            while (currentNode != goal) {
                currentNode = getShortestDistanceNode(unsettldNodes);
                int currentDistance = currentNode.getDistance();


                // If the current node is the goal node, save the values
                if (currentNode == goal) {
                    goalDistance = currentDistance;
                    finalPath = currentNode.getShortestPath();
                    goalText = "DESTINATION FOUND --> ";
                }

                unsettldNodes.remove(currentNode);

                // Prints which node we're looking at and values for easier reading
                System.out.println(goalText + "Looking at " + currentNode.getVertex() + ". Distance from source: " +
                        currentNode.getDistance() + ". Adjacent nodes: " + stringifyMap(currentNode.adjacentNodes, currentNode));

                // Looping through the current nodes map-object containing neighbouring nodes,
                // ads the neighbour with the shortest distance.
                for (Map.Entry<NewNode, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                    NewNode adjacentNode = adjacencyPair.getKey();
                    Integer edgeWeight = adjacencyPair.getValue();
                    if (!settldNodes.contains(adjacentNode)) {
                        calculateMinDistance(adjacentNode, edgeWeight, currentNode);
                        unsettldNodes.add(adjacentNode);
                    }
                }
                settldNodes.add(currentNode);
                goalText = "";
            }
            // Sets values and prints the shortest path to the goal node
            goal.setDistance(goalDistance);
            String goalName = goal.getVertex();
            System.out.println("Target found. Path to " + goalName + " with length: " + goal.getDistance() + ". " + stringify(finalPath) + "" + goalName + ".");
            return graph;
        }

        // Method to find the node with the shortest distance in a Set
        public static NewNode getShortestDistanceNode(Set<NewNode> unsettNodes) {
            NewNode lowestDistanceNode = null;
            int lowestDistance = Integer.MAX_VALUE;
            for (NewNode node : unsettNodes) {
                int nodeDistance = node.getDistance();
                if (nodeDistance < lowestDistance) {
                    lowestDistance = nodeDistance;
                    lowestDistanceNode = node;
                } else {
                    settldNodes.add(node);
                }
            }
            return lowestDistanceNode;
        }

    private static void calculateMinDistance(NewNode adjacentNode, Integer edgeWeight, NewNode sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (edgeWeight < adjacentNode.getDistance()) {
            adjacentNode.setDistance(edgeWeight);
            adjacentNode.setDistance(sourceDistance + edgeWeight);
            LinkedList<NewNode> shortestPath = new LinkedList<NewNode>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            adjacentNode.setShortestPath(shortestPath);
            settldNodes.add(adjacentNode);
        } else {
            for (NewNode n : unsettldNodes) {
                if (n != adjacentNode) unsettldNodes.remove(n);
            }
            settldNodes.add(adjacentNode);
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

