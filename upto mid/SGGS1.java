class SGGS1{
 {
   System.out.println("Inside the init block");
 }
SGGS1(){
 System.out.println("Insisde SGGS constructor");
}

public static void main(String[] args){
 SGGS1 sggs=new SGGS1();
 System.out.println("Inside main");
 
}
static{
 System.out.println("Inside SGGS static block");
}

}
