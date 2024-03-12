class Overloading2{
int balance=0;
static String surname;
static boolean status;
public static void main(String args[]){
 Overloading2 son=new Overloading2();
 
 System.out.println(son.fun(Integer.MAX_VALUE,1));
 //son.fun(10l,10);
 

}
/*
public void fun(int a,long b){
 System.out.println("inside fun(int,int)");
 System.out.println(a+b);
}
*/
public int fun(int a,int b){
 System.out.println("inside fun(int,int)");
 return (long)(a+b);
}




}
