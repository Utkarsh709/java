import java.io.*;
class copyfiletofile{
 public static void main(String[] args) throws IOException{
  FileInputStream r=new FileInputStream("/home/utkarsh/Downloads/uuttkk.txt");
  FileOutputStream w=new FileOutputStream("/home/utkarsh/Downloads/uuttkk1.txt");
  int i;
  while((i=r.read())!=-1){
   w.write((char)i);
  }
  System.out.println("Data copied successfully");
 }

}
