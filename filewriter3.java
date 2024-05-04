import java.io.*;

class filewriter3 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("/home/utkarsh/Downloads/uuttkk.txt")) {
            writer.print("utkarsh..."); // Write the string to the file
            writer.close(); // Close the file
        } catch (IOException e) {
            System.out.println(e); // Handle any exceptions
        }
    }
}

