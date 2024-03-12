class SGGS2{
 {
   System.out.println("Inside the init block");
 }
SGGS2(){
 System.out.println("Insisde SGGS constructor");
}

public static void main(String[] args){
 SGGS2 sggs=new SGGS2();
 System.out.println("Inside main");
 
}
static{
 System.out.println("Inside SGGS static block");
}

}
