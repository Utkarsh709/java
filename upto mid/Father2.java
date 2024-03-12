import java.lang.String;
class Father2{
 int balance;
 static String surname="utkarsh";
 static boolean status;
 public static void main(String args[]){
  static int balance1=300;
  Father2 son=new Father2();
  System.out.println(son.balance);
  System.out.println(Father2.surname);
  System.out.println(Father2.surname.length());
  System.out.println(Father2.status);
  son.balance=200;
  System.out.println(son.balance);
  //System.out.println(Father1.balance);
  Father2 daughter=new Father2();
  System.out.println(daughter.balance);
  String mysurname=son.getsurname(son);
  System.out.println(mysurname);
  
 }

public String getsurname(Father2 obj){
 return obj.surname;
}


}
