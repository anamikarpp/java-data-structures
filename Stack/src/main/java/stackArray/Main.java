package stackArray;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);

        ArrayStack stack = new ArrayStack(10);
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);

        stack.printStack();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.printStack();
    }
}