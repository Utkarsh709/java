//copy constructor

class Student{
 String name;
 int age;
 
 public void info(){
  System.out.println(this.name);
  System.out.println("hello");
  System.out.println(this.age);
 }
 
 Student(Student s2){
  this.name=s2.name;
  this.age=s2.age;
 }
 
 Student(){
 
 }

}

public class OOP4{
 public static void main(String[] args){
  Student s1=new Student();
  s1.name="utkarsh";
  s1.age=31;
  
  Student s2=new Student(s1);
  s2.info();
 }

}
