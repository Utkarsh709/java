class Father{
 static int balance=2300000;
 static String surname="gandhi";
 public static void main(String args[]){
   int balance=200;
  System.out.println("hi");
  Father f=new Father();
  System.out.println(f.balance);
  System.out.println(surname);
  Father son=new Father();
  System.out.println(son.balance);
  System.out.println(son.surname);
 // System.out.println(Father.balance);
  son.balance=45000;
  System.out.println(son.balance);
  Father daughter=new Father();
  System.out.println(daughter.balance);
  daughter.surname="modi";
  System.out.println(son.surname);
  System.out.println(Father.surname);
  System.out.println(daughter.surname);
 
 
 
 }



}
