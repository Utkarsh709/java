import java.io.File;

public class filehandle2 {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "example.txt";

        // Create a File object representing the file to be deleted
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            // Attempt to delete the file
            boolean isDeleted = file.delete();

            if (isDeleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}

