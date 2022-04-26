# IS-211-Assignment3

For this assignemnt i have chosen to compare Dijkstras algorithm with a more brute force searching algorithm. These two algorithms are similar in structure but execute differently. Dijkstra will compare the nodes and look at the overall shortest path, whilst the brute force algorithm will look at what is currently its shortest path, and will choose the "easiest" answer.

I chose these two algorithms because it can give us insight in how similar algortihms can differ in runtime and precision. I chose the brute force algorithm after a lot of trial and error with the Lin-Kernighan algorithm. After spending a lot of time with it i realized I would not be able to finish the algorithm in time of the assignemnts due date. So i chose this one to be the comparison to Dijkstra. It is not the most optimal but it still gives room for analysis.

In the code the are parts that are commented out which are remains from trying different probelms in the assignment.

# Execution
Firstly to run this algorithm, all that is needed is to compile all java files and run the Main.java file.

# Output
--------------------------------------------------------------------------
Dijkstras algorithm:

Starting with Timisoara.

Looking at Timisoara. Distance from source: 0. Adjacent nodes: Arad. Lugoj. 

Looking at Lugoj. Distance from source: 111. Adjacent nodes: Mehadia. Timisoara. 

Looking at Arad. Distance from source: 118. Adjacent nodes: Zerind. Timisoara. Sibiu. 

Looking at Mehadia. Distance from source: 181. Adjacent nodes: Drobeta. Lugoj. 

Looking at Zerind. Distance from source: 193. Adjacent nodes: Arad. Oradea. 

Looking at Drobeta. Distance from source: 256. Adjacent nodes: Mehadia. Craiova. 

Looking at Sibiu. Distance from source: 258. Adjacent nodes: Arad. Oradea. Rimmicu Vilea. Fagaras. 

Looking at Oradea. Distance from source: 264. Adjacent nodes: Zerind. Sibiu. 

Looking at Rimmicu Vilea. Distance from source: 338. Adjacent nodes: Pitesti. Craiova. Sibiu. 

Looking at Fagaras. Distance from source: 357. Adjacent nodes: Bucharest. Sibiu. 

Looking at Craiova. Distance from source: 376. Adjacent nodes: Pitesti. Rimmicu Vilea. Drobeta. 

Looking at Pitesti. Distance from source: 435. Adjacent nodes: Rimmicu Vilea. Craiova. Bucharest. 

DESTINATION FOUND --> Looking at Bucharest. Distance from source: 536. Adjacent nodes: Pitesti. Urziceni. Giurgiu. Fagaras. 

Looking at Urziceni. Distance from source: 621. Adjacent nodes: Hirsova. Vaslui. Bucharest. 

Looking at Giurgiu. Distance from source: 626. Adjacent nodes: Bucharest. 

Looking at Hirsova. Distance from source: 719. Adjacent nodes: Urziceni. Erforie. 

Looking at Vaslui. Distance from source: 763. Adjacent nodes: Urziceni. Iasi. 

Looking at Erforie. Distance from source: 805. Adjacent nodes: Hirsova. 

Looking at Iasi. Distance from source: 855. Adjacent nodes: Neamt. Vaslui. 

Looking at Neamt. Distance from source: 942. Adjacent nodes: Iasi. 

Target found. Path to Bucharest with length: 536. Timisoara --> Arad --> Sibiu --> Rimmicu Vilea --> Pitesti --> Bucharest.

--------------------------------------------------------------------------
Brute force algorithm:

Starting with Timisoara

Looking at Timisoara. Distance from source: 0. Adjacent nodes: Arad. Lugoj. 

Looking at Lugoj. Distance from source: 111. Adjacent nodes: Mehadia. Timisoara. 

Looking at Mehadia. Distance from source: 181. Adjacent nodes: Drobeta. Lugoj. 

Looking at Drobeta. Distance from source: 256. Adjacent nodes: Mehadia. Craiova. 

Looking at Craiova. Distance from source: 376. Adjacent nodes: Pitesti. Rimmicu Vilea. Drobeta. 

Looking at Pitesti. Distance from source: 514. Adjacent nodes: Rimmicu Vilea. Craiova. Bucharest. 

Looking at Rimmicu Vilea. Distance from source: 522. Adjacent nodes: Pitesti. Craiova. Sibiu. 

Looking at Sibiu. Distance from source: 602. Adjacent nodes: Arad. Oradea. Rimmicu Vilea. Fagaras. 

DESTINATION FOUND --> Looking at Bucharest. Distance from source: 615. Adjacent nodes: Pitesti. Urziceni. Giurgiu. Fagaras. 

Target found. Path to Bucharest with length: 615. Timisoara --> Lugoj --> Mehadia --> Drobeta --> Craiova --> Pitesti --> Bucharest.

# Conclusion
If we look at the overall speed, its easy to see that the Brute Force version finished in the fewest steps. It is looking at a signifacantly smaller amount of nodes and finds a solution faster, but the final length of the path is considerably longer than in Dijkstras algorithm. Looking at Dijkstras algorithm we see that the algorithm looks through every node on the map, and even after the destination is found it keeps searching. This runtime will become longer and longer the more nodes there are. From the other algorithms we have read about, the brute force differs a lot from algorithms such as the Lin-Kernighan, which finds multiple tours and comapres them. Which is much closer to what dijkstra does than the Brute Force algorithm. From what we can see in the tests, one can make out that speed and precision are the two trade offs when it comes to these algorithms. 

