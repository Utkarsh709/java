import java.lang.String;
class Father1{
 int balance;
  String surname="utkarsh";
 static boolean status;
 public static void main(String args[]){
  Father1 son=new Father1();
  System.out.println(son.balance);
  //System.out.println(Father1.surname);
  //System.out.println(Father1.surname.length());
  System.out.println(Father1.status);
  //System.out.println(son.balance);
  //System.out.println(Father1.balance);
  Father1 daughter=new Father1();
  String mysurname=getsurname(son);
  System.out.println(mysurname);
  
 }

public String getsurname(Father1 obj){
 return obj.surname;
}


}
