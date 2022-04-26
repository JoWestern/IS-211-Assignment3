import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CreateMap {

    private Set<NewNode> nodes = new HashSet<NewNode>();

    public void addNode(NewNode nodeA) {
        nodes.add(nodeA);
    }

    public CreateMap() {
        create();
    }

    public void create() {
/**
        NewNode A = new NewNode("A");
        NewNode B = new NewNode("B");
        NewNode C = new NewNode("C");
        NewNode D = new NewNode("D");
        NewNode E = new NewNode("E");
        NewNode F = new NewNode("F");

        A.addDestination(B, 10);
        A.addDestination(C, 5);
        A.addDestination(D, 9999);
        A.addDestination(E,3);
        A.addDestination(F, 12);

        B.addDestination(A, 10);
        B.addDestination(C, 17);
        B.addDestination(D, 9);
        B.addDestination(E,17);
        B.addDestination(F, 12);

        C.addDestination(A, 5);
        C.addDestination(B, 10);
        C.addDestination(D, 35);
        C.addDestination(E,3);
        C.addDestination(F, 12);

        D.addDestination(A, 9999);
        D.addDestination(B, 9);
        D.addDestination(C, 35);
        D.addDestination(E, 9999);
        D.addDestination(F,12);

        E.addDestination(A,3);
        E.addDestination(B, 17);
        E.addDestination(C,3);
        E.addDestination(D, 9999);
        E.addDestination(F,12);

        F.addDestination(A, 12);
        F.addDestination(B, 12);
        F.addDestination(C, 12);
        F.addDestination(D, 12);
        F.addDestination(E,12); */

        NewNode timisoara = new NewNode("Timisoara");
        NewNode arad = new NewNode("Arad");
        NewNode lugoj = new NewNode("Lugoj");
        NewNode mehadia = new NewNode("Mehadia");
        NewNode drobeta = new NewNode("Drobeta");
        NewNode sibiu = new NewNode("Sibiu");
        NewNode craiova = new NewNode("Craiova");
        NewNode zerind = new NewNode("Zerind");
        NewNode oradea = new NewNode("Oradea");
        NewNode fagaras = new NewNode("Fagaras");
        NewNode rimmicu = new NewNode("Rimmicu Vilea");
        NewNode pitesti = new NewNode("Pitesti");
        NewNode bucharest = new NewNode("Bucharest");
        NewNode giurgiu = new NewNode("Giurgiu");
        NewNode urziceni = new NewNode("Urziceni");
        NewNode hirsova = new NewNode("Hirsova");
        NewNode eforie = new NewNode("Erforie");
        NewNode vaslui = new NewNode("Vaslui");
        NewNode iasi = new NewNode("Iasi");
        NewNode neamt = new NewNode("Neamt");

        /** Previous attempt at creating node edges
        Edge Earad = new Edge(arad, 118);
        Edge Ezerind = new Edge(zerind, 75);
        Edge Eoradea = new Edge(oradea, 71);
        Edge Elugoj = new Edge(lugoj, 111);
        Edge Emehadia = new Edge(mehadia, 70);
        Edge Edrobeta = new Edge(drobeta, 75);
        Edge Ecraiova = new Edge(craiova, 120);
        Edge Esibiu = new Edge(sibiu, 140);
        Edge Esibiu2 = new Edge(sibiu, 151);
        Edge Erimmicu = new Edge(rimmicu, 80);
        Edge Erimmicu2 = new Edge(rimmicu, 146);
        Edge Epitesti = new Edge(pitesti, 97);
        Edge Epitesti2 = new Edge(pitesti, 138);
        Edge Efagaras = new Edge(fagaras, 99);
        Edge Ebucharest = new Edge(bucharest, 211);
        Edge Ebucharest2 = new Edge(bucharest, 101);
        Edge Egiurgiu = new Edge(giurgiu, 90);
        Edge Eurziceni = new Edge(urziceni, 85);
        Edge Ehirsova = new Edge(hirsova, 98);
        Edge Eeforie = new Edge(eforie, 86);
        Edge Evaslui = new Edge(vaslui, 142);
        Edge Eiasi = new Edge(iasi, 92);
        Edge Eneamt = new Edge(neamt, 87);

        timisoara.addEdge(Earad);
        timisoara.addEdge(Elugoj);
        arad.addEdge(Ezerind);
        arad.addEdge(Esibiu);
        zerind.addEdge(Eoradea);
        oradea.addEdge(Esibiu2);
        lugoj.addEdge(Emehadia);
        mehadia.addEdge(Edrobeta);
        drobeta.addEdge(Ecraiova);
        sibiu.addEdge(Erimmicu);
        sibiu.addEdge(Efagaras);
        fagaras.addEdge(Ebucharest);
        craiova.addEdge(Erimmicu2);
        craiova.addEdge(Epitesti2);
        rimmicu.addEdge(Epitesti);
        pitesti.addEdge(Ebucharest2);
        bucharest.addEdge(Egiurgiu);
        bucharest.addEdge(Eurziceni);
        urziceni.addEdge(Ehirsova);
        urziceni.addEdge(Evaslui);
        hirsova.addEdge(Eeforie);
        vaslui.addEdge(Eiasi);
        iasi.addEdge(Eneamt); */

        timisoara.addDestination(arad, 118);
        timisoara.addDestination(lugoj, 111);

        lugoj.addDestination(mehadia, 70);
        lugoj.addDestination(timisoara, 111);

        arad.addDestination(zerind, 75);
        arad.addDestination(sibiu, 140);
        arad.addDestination(timisoara, 118);

        zerind.addDestination(oradea, 71);
        zerind.addDestination(arad, 75);

        oradea.addDestination(sibiu, 151);
        oradea.addDestination(zerind, 71);

        mehadia.addDestination(drobeta, 75);
        mehadia.addDestination(lugoj, 70);

        drobeta.addDestination(craiova, 120);
        drobeta.addDestination(mehadia, 75);

        craiova.addDestination(pitesti, 138);
        craiova.addDestination(drobeta, 120);
        craiova.addDestination(rimmicu, 146);

        sibiu.addDestination(rimmicu, 80);
        sibiu.addDestination(fagaras, 99);
        sibiu.addDestination(arad, 140);
        sibiu.addDestination(oradea,151);

        rimmicu.addDestination(pitesti, 97);
        rimmicu.addDestination(sibiu, 80);
        rimmicu.addDestination(craiova, 146);

        fagaras.addDestination(bucharest, 211);
        fagaras.addDestination(sibiu, 99);

        pitesti.addDestination(bucharest,101);
        pitesti.addDestination(rimmicu, 97);
        pitesti.addDestination(craiova, 138);

        bucharest.addDestination(pitesti,101);
        bucharest.addDestination(fagaras,211);
        bucharest.addDestination(giurgiu,90);
        bucharest.addDestination(urziceni,85);

        giurgiu.addDestination(bucharest,90);

        urziceni.addDestination(bucharest, 85);
        urziceni.addDestination(hirsova, 98);
        urziceni.addDestination(vaslui, 142);

        hirsova.addDestination(urziceni, 98);
        hirsova.addDestination(eforie,86);

        eforie.addDestination(hirsova,86);

        vaslui.addDestination(urziceni,142);
        vaslui.addDestination(iasi,92);

        iasi.addDestination(vaslui,92);
        iasi.addDestination(neamt,87);

        neamt.addDestination(iasi,87);

         Graph graph = new Graph();

        graph.addNode(timisoara);
        graph.addNode(arad);
        graph.addNode(lugoj);
        graph.addNode(mehadia);
        graph.addNode(zerind);
        graph.addNode(drobeta);
        graph.addNode(craiova);
        graph.addNode(oradea);
        graph.addNode(sibiu);
        graph.addNode(rimmicu);
        graph.addNode(fagaras);
        graph.addNode(pitesti);
        graph.addNode(bucharest);
        graph.addNode(giurgiu);
        graph.addNode(urziceni);
        graph.addNode(hirsova);
        graph.addNode(eforie);
        graph.addNode(vaslui);
        graph.addNode(iasi);
        graph.addNode(neamt);


        run(graph, timisoara, bucharest);
    }
/**
    public void loop(ArrayList<NewNode> vertices, Graph graph) {
        for (NewNode startingVertex : vertices) {
            for (NewNode endVertex : graph.getVertices()) {
                Main.calculateDijkstra(graph, startingVertex, endVertex);
                System.out.println(" ");
            }
            System.out.println("Summary for vertex " + startingVertex.getVertex() + ":\n");

        }
    }*/

    public void run(Graph graph, NewNode startNode, NewNode goalNode) {
        System.out.println("---------------------------------------------------");
        System.out.println("Dijkstras algorithm:");
        Main.calculateDijkstra(graph, startNode, goalNode);
        System.out.println("---------------------------------------------------");
        System.out.println("Brute force algorithm:");
        BruteForce.calculateBrute(graph, startNode, goalNode);
    }
}
