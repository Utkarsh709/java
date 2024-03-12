import java.lang.String;
class Father3{
 int balance;
 static String surname="utkarsh";
 static boolean status;
 public static void main(String args[]){
  //static int balance=300;
  Father3 son=new Father3();
  System.out.println(son.balance);
  System.out.println(Father3.surname);
  System.out.println(Father3.surname.length());
  System.out.println(Father3.status);
  son.balance=200;
  System.out.println(son.balance);
  //System.out.println(Father1.balance);
  Father3 daughter=new Father3();
  System.out.println(daughter.balance);
  String mysurname=son.getsurname(son);
  System.out.println(mysurname);
  System.out.println(fun());
  
 }

public String getsurname(Father3 obj){
 System.out.println(fun());
 return obj.surname;
}

public static int fun(){
 return 10;
}


}
