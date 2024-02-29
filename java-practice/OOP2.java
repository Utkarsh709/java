//Default constructor
class Student{
 String name;
 int age;
 
 public void info(){
  System.out.println(this.name);
  System.out.println(this.age);
 }
 
 Student(){
  System.out.println("utkarsh");
 }
 

}

public class OOP2{
 public static void main(String[] args){
  Student s1=new Student();
  s1.name="aman";
  s1.age=31;
  s1.info();
 }

}
