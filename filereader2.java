import java.io.*;

class filereader2 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader("/home/utkarsh/Downloads/uuttkk.txt"));
            try {
                String line;
                while ((line = r.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                r.close();
                System.out.println("File closed");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

