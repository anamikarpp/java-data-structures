package graphs;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",101);
        Employee johnDoe = new Employee("John","Doe",102);
        Employee marySmith = new Employee("Mary","Smith",103);
        Employee mikeWilson = new Employee("Mike","Wilson",104);

        EmployeeGraph graph = new EmployeeGraph();

        graph.addEmployee(janeJones);
        graph.addEmployee(johnDoe);
        graph.addEmployee(marySmith);
        graph.addEmployee(mikeWilson);

        graph.addEdge(janeJones,johnDoe);
        graph.addEdge(johnDoe,marySmith);
        graph.addEdge(marySmith,mikeWilson);
        graph.addEdge(mikeWilson,janeJones);

        graph.printAdjList();
        graph.bfs(janeJones);
        graph.dfs(janeJones);


    }
}