import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers of your choice.");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println("Enter an operator +, -, *, /");
        char operator = reader.next().charAt(0);
        double result;

        switch(operator){
            case '+':result=first+second;
            break;

            case '-': result=Math.abs(first-second);
            break;

            case '*': result=first*second;
            break;

            case '/': result=first/second;
            break;

            default:System.out.println("Error! Operator not found");
            return;
        }

        System.out.println("The operation of " + operator +"yielded the result as " +result);
    }
}
