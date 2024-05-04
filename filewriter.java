import java.io.*;
class filewriter{
  public static void main(String[] args){
   try
   {
    FileWriter f=new FileWriter("/home/utkarsh/Downloads/uuttkk.txt");
   
   try{
    f.write("utkarsh...");
   }
   finally{
    f.close();
   }
  }
  catch(IOException e){
   System.out.println(e);
  }

}
}
