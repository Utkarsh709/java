//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.Scanner;
class stringque1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:");
  int size=sc.nextInt();
  int total=0;
  String[] a=new String[size];
  for(int i=0;i<size;i++){
   System.out.println("enter string at"+(i+1)+ "index");
   a[i]=sc.next();
  }
   for(int i=0;i<size;i++){
    total=total + a[i].length();
    }
  System.out.println("total length of all string :" + total);
 }
}
