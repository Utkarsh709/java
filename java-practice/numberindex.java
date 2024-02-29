import java.util.Scanner;
class numberindex{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter size of array:");
  int size=sc.nextInt();
  System.out.println("enter target element:");
  int target=sc.nextInt();
  int[] number=new int[size];
  for(int i=0;i<size;i++){
   System.out.println("enter " + (i+1) + "element:"); 
   number[i]=sc.nextInt();
  }
  for(int i=0;i<size;i++){
   if(target==number[i]){
    System.out.println("index of" + target + "is" + i );
   }
   
  }
 }
}
