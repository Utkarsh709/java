import java.io.*;
class renamefile{
 public static void main(String args[]){
   File f =new File("/home/utkarsh/Downloads/uuttkk.txt");
   File r =new File("/home/utkarsh/Downloads/uuutttkkk.txt");
   if(f.exists())
   {
    System.out.println(f.renameTo(r));
   }
   else{
    System.out.println("file does not found");
   }
   
   
 }


}
