import java.util.Scanner;
class strbuilder{
 public static void main(String[] args){
  StringBuilder sb=new StringBuilder("tony");
  System.out.println(sb);

 //print character at index 0
 System.out.println(sb.charAt(0));
 

//set character at index 0
 sb.setCharAt(0,'p');
 System.out.println(sb);
 
 
//insert at index 0
 sb.insert(0,'s');
 System.out.println(sb);
 
 
//delete
 sb.delete(2,3);
 System.out.println(sb);
 
//appending element at last
sb.append("u");
sb.append("t");
System.out.println(sb);


//length
System.out.println(sb.length());



}
 
 
}
