import java.io.*;

class filewriter2 {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("/home/utkarsh/Downloads/uuttkk.txt");

            try {
                f.write("utkarsh...".getBytes()); // Writing a string directly to FileOutputStream requires converting it to bytes first
            } finally {
                f.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

