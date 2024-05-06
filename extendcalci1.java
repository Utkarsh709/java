/*
import java.util.Scanner;

public class calciextend {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Calculator");
        
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Inverse Sine (asin)");
            System.out.println("11. Inverse Cosine (acos)");
            System.out.println("12. Inverse Tangent (atan)");
            System.out.println("13. Logarithm (log)");
            System.out.println("14. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = add(scanner);
                    break;
                case 2:
                    result = subtract(scanner);
                    break;
                case 3:
                    result = multiply(scanner);
                    break;
                case 4:
                    result = divide(scanner);
                    break;
                case 5:
                    result = modulus(scanner);
                    break;
                case 6:
                    result = power(scanner);
                    break;
                case 7:
                    result = sine(scanner);
                    break;
                case 8:
                    result = cosine(scanner);
                    break;
                case 9:
                    result = tangent(scanner);
                    break;
                case 10:
                    result = inverseSine(scanner);
                    break;
                case 11:
                    result = inverseCosine(scanner);
                    break;
                case 12:
                    result = inverseTangent(scanner);
                    break;
                case 13:
                    result = logarithm(scanner);
                    break;
                case 14:
                    System.out.println("Thank you for using Calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 14.");
                    continue;
            }
            
            System.out.println("Result: " + result);
        }
    }
    
    public static double add(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }
    
    public static double subtract(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }
    
    public static double multiply(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }
    
    public static double divide(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // Not a Number
        }
        return dividend / divisor;
    }
    
    public static double modulus(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 % num2;
    }
    
    public static double power(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
    
    public static double sine(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        return Math.sin(angle);
    }
    
    public static double cosine(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        return Math.cos(angle);
    }
    
    public static double tangent(Scanner scanner) {
        System.out.print("Enter angle in radians: ");
        double angle = scanner.nextDouble();
        return Math.tan(angle);
    }
    
    public static double inverseSine(Scanner scanner) {
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        return Math.asin(value);
    }
    
    public static double inverseCosine(Scanner scanner) {
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        return Math.acos(value);
    }
    
    public static double inverseTangent(Scanner scanner) {
        System.out.print("Enter value: ");
        double value = scanner.nextDouble();
        return Math.atan(value);
    }
    
    public static double logarithm(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        return Math.log(num);
    }
}



*/


import java.util.Scanner;

 class calciextend1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (^)");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Inverse Sine (asin)");
            System.out.println("11. Inverse Cosine (acos)");
            System.out.println("12. Inverse Tangent (atan)");
            System.out.println("13. Logarithm (log)");
            System.out.println("14. 10th Power");
            System.out.println("15. e^x");
            System.out.println("16. Matrix Addition");
            System.out.println("17. Matrix Multiplication");
            System.out.println("18. Differentiation");
            System.out.println("19. Integration");
            System.out.println("20. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(scanner);
                    break;
                case 2:
                    result = subtract(scanner);
                    break;
                case 3:
                    result = multiply(scanner);
                    break;
                case 4:
                    result = divide(scanner);
                    break;
                case 5:
                    result = modulus(scanner);
                    break;
                case 6:
                    result = power(scanner);
                    break;
                case 7:
                    result = sine(scanner);
                    break;
                case 8:
                    result = cosine(scanner);
                    break;
                case 9:
                    result = tangent(scanner);
                    break;
                case 10:
                    result = inverseSine(scanner);
                    break;
                case 11:
                    result = inverseCosine(scanner);
                    break;
                case 12:
                    result = inverseTangent(scanner);
                    break;
                case 13:
                    result = logarithm(scanner);
                    break;
                case 14:
                    result = powerOfTen(scanner);
                    break;
                case 15:
                    result = exponentiate(scanner);
                    break;
                case 16:
                    // Implement matrix addition
                    break;
                case 17:
                    // Implement matrix multiplication
                    break;
                case 18:
                    // Implement basic differentiation
                    break;
                case 19:
                    // Implement basic integration
                    break;
                case 20:
                    System.out.println("Thank you for using Calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 20.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    // Existing methods...

    public static double powerOfTen(Scanner scanner) {
        System.out.print("Enter number: ");
        double num = scanner.nextDouble();
        return Math.pow(num, 10);
    }

    public static double exponentiate(Scanner scanner) {
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return Math.exp(exponent);
    }

    // Additional methods for matrix operations, differentiation, and integration...
}

