//factorial of number using recurssion
import java.util.Scanner;
class recurssion3{
 public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  System.out.println("enter a number:");
  int n=sc.nextInt();
  int m=factorial(n);
  System.out.println("factorial of"+n+"is"+m);
 }
 public static int factorial(int n){
  if(n==0){
   return 1;
  }
  else if(n==1){
   return 1;
  }
  else{
   return n*factorial(n-1);
  }
  
 }
}  
