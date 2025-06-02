package queueArrayBacked;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",101);
        Employee johnDoe = new Employee("John","Doe",102);
        Employee marySmith = new Employee("Mary","Smith",103);
        Employee mikeWilson = new Employee("Mike","Wilson",104);
        Employee billMarker = new Employee("Bill","Marker",105);

        ArrayQueue queue = new ArrayQueue(3);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billMarker);

        queue.printQueue();

        queue.remove();
        queue.remove();

        System.out.println();

        queue.printQueue();

        System.out.println(queue.peek());
    }
}