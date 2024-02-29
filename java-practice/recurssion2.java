//to print sum of n natural numbers
import java.util.Scanner;
class recurssion2{
 public static void main(String[] args)
  printSum(1,5,0);
  }
 public static void main(int i,int n,int sum){
  if(i==n){
   sum=sum+i;
   System.out.println(sum);
   return;
  }
  sum=sum+i;
  printSum(i+1,n,sum);
 } 
}
