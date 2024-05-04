import java.io.*;

class filereader4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/home/utkarsh/Downloads/uuttkk.txt");
            try {
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fis.close();
                System.out.println("File closed");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

