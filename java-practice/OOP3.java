//Parameterized constructor
class Student{
 String name;
 int age;
 
 public void info(){
  System.out.println(this.name);
  System.out.println("hello");
  System.out.println(this.age);
 }
 
 Student(String name,int age){
  this.name=name;
  this.age=age;
 }
 

}

public class OOP3{
 public static void main(String[] args){
  Student s1=new Student("utkarsh",31);
  s1.info();
 }

}
