//access modifier
class account{
 String name;
 public String surname;
 protected String email;
 private String Password;  //used getters and setters
 
 public String getPassword(){
  return this.Password;
 }
 
 public void setPassword(String pass){
  this.Password=pass;
 }

}

public class OOP10{
 public static void main(String[] args){
  account a1=new account();
  a1.name="utkarsh";
  a1.surname="kshirsagar";
  a1.email="2022bit031@sggs.ac.in";
  a1.setPassword("4567");
  System.out.println(a1.getPassword());
  
  
 }

}
