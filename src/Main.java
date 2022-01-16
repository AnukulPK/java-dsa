public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jain","Jones",123));
        stack.push(new Employee("John","Dow",4567));
        stack.push(new Employee("Mary","Smith",22));
        stack.push(new Employee("Mike","Wilson",3245));
        stack.push(new Employee("Bill","End",76));

//        stack.printStack();

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
