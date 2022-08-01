import java.util.*;
public class Problem_1{

    public static double solve(double num1, double num2, String operation){
        double result = 0.0;
        switch (operation.toLowerCase()) {
            case "addition":
                    result = num1 + num2;
                break;
            case "subtraction":
                    result = num1 - num2;
                    break;
            case "multiplication":
                    result = num1 * num2;
                    break;
            case "division" : 
                    result = num1 / num2;
                    break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
        return result;
    }
   

public static void main(String[] args) {
        // Input object of Scanner class
        Scanner scan = new Scanner(System.in);

        // decalre number1 of type double
        double num1;
        // decalre number2 of type double
        double num2;
        // decalre type of operation to be performed
        String operation;
        
        // Take input for num1
        num1 = scan.nextDouble();
        // Take input for num2
        num2 = scan.nextDouble();
        // take input for operation
        operation = scan.next();
        try{
            //perform the operation by calling solve method
            solve(num1, num2, operation);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
        scan.close();
    }
    
}
