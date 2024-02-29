import java.util.Scanner;
class maxmin{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter array size:");
  int size=sc.nextInt();
  

  int[] number=new int[size];
  for(int i=0;i<size;i++){
   System.out.println("enter"+ (i+1) + "element:");
   number[i]=sc.nextInt();
  }
  int max=number[0];
  int min=number[0];
  for(int i=0;i<size;i++){
   if(max<number[i]){
    max=number[i];
    }
    }
  for(int i=0;i<size;i++){
   if(min>number[i]){
    min=number[i];
    }
    }
System.out.println("max:"+max);
System.out.println("min:"+min);
 }
}
