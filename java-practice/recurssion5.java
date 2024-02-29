//power
import java.util.Scanner;
class recurssion5{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter x:");
  int x=sc.nextInt();
  System.out.println("enter n:");
  int n=sc.nextInt();
  int ans=calcPower(x,n);
  System.out.println("ans:" + ans);
  
 }
 public static int calcPower(int x,int n){
  if(n==0){
   return 1;
  } 
  else if(x==0){
   return 0;
  
  }
  else{
   int m=calcPower(x,n-1);
   int k= x*m;
   return k;
   
  }
 }
}
