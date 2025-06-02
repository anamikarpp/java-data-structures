package graphs;

import java.util.*;

public class EmployeeGraph {
    private Map<Employee, List<Employee>> adjList;
    private List<Employee> allEmployees;

    public EmployeeGraph()
    {
        adjList = new HashMap<>();
        allEmployees = new ArrayList<>();
    }

    public void addEmployee(Employee emp)
    {
        adjList.putIfAbsent(emp,new ArrayList<>());
        allEmployees.add(emp);
    }

    public void addEdge(Employee from,Employee to)
    {
        adjList.get(from).add(to);
        adjList.get(to).add(from);
    }

    public void printAdjList(){
        System.out.println("Adjacency List:");
        for(Employee emp : adjList.keySet())
        {
            System.out.print(emp+"->");
            for(Employee neighbor:adjList.get(emp))
            {
                System.out.print(neighbor+" | ");
            }
            System.out.println();
        }
    }

    public void bfs(Employee start)
    {
        Set<Employee> visited = new HashSet<>();
        Queue<Employee> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        System.out.print("BFS: ");

        while(!q.isEmpty())
        {
            Employee curr =q.poll();
            System.out.print(curr.getId()+ " ");
            for(Employee neighbor : adjList.get(curr))
            {
                if(!visited.contains(neighbor))
                {
                    visited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public  void dfs(Employee start)
    {
        Set<Employee> visited = new HashSet<>();
        System.out.print("DFS: ");
        dfsHelper(start,visited);
        System.out.println();
    }

    private void dfsHelper(Employee emp, Set<Employee>visited)
    {
        visited.add(emp);
        System.out.print(emp.getId()+" ");

        for(Employee neighbor:adjList.get(emp))
        {
            if(!visited.contains(neighbor))
            {
                dfsHelper(neighbor,visited);
            }
        }
    }

}
