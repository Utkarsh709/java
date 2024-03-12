class SGGS3{
  static int x=786;
 {
   System.out.println("Inside the init block");
   x=765;
   System.out.println(x);
 }
 
SGGS3(){
 System.out.println("Insisde SGGS constructor");
}

public static void main(String[] args){
 SGGS1 sggs=new SGGS1();
 System.out.println("Inside main");
 System.out.println("inside main:"+x);
 
}
static{
 System.out.println("Inside SGGS static block");
}

}
