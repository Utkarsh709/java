import java.util.Scanner;
class greater{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a first number:");
int a=sc.nextInt();
System.out.println("enter a second number:");
int b=sc.nextInt();
int k=greaters(a,b);
System.out.println("greatrer number is :" + k);

}
public static int greaters(int m,int n){
if(m>n){
return m;
}
else{
return n;
}
}

}



