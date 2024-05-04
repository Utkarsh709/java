import java.io.*;

class filewriter1 {
    public static void main(String[] args) {
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("/home/utkarsh/Downloads/uuttkk.txt"));

            try {
                f.write("utkarsh...");
            } finally {
                f.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

