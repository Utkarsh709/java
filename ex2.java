public class ex2 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the specific exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block always executes, regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }
    }
    
    public static int divide(int numerator, int denominator) {
        // Method that may throw an ArithmeticException if denominator is zero
        return numerator / denominator;
    }
}

