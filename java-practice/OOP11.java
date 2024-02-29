//Abstraction
abstract class Animal{
 abstract void walk();
 public void eats(){
  System.out.println("eats something");
  }
  Animal(){
   System.out.println("Inside animal class");
  
 }
 
 }

class horse extends Animal{
 public void walk(){
  System.out.println("walks on 4 legs");
 }
 horse(){
  System.out.println("Inside horse class");
 }
}

class duck extends Animal{
 public void walk(){
  System.out.println("walks on 2 legs");
 }
}

public class OOP11{
 public static void main(String[] args){
  horse h=new horse();
  h.walk();
  h.eats();
 }

}
