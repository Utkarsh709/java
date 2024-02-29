//Polymorphism
//function overloading(compile time)

class Student{
 String name;
 int age;
 
 public void info(String name){
  System.out.println(name);
  }
  
  public void info(int age){
  System.out.println(age);
  }
  
  public void info(String name,int age){
  System.out.println(name +" " + age);
  }
 
 
  

}

public class OOP5{
 public static void main(String[] args){
  Student s1=new Student();
  s1.name="utkarsh";
  s1.age=31;
  
  s1.info(s1.name);
  s1.info(s1.age);
  s1.info(s1.name,s1.age);
 }

}
