package com.techlab.demo;

import java.lang.Class;
import java.lang.reflect.*;

interface Animal {
   public void display();
}

interface Mammal {
   public void makeSound();
}

class Dog implements Animal, Mammal {
   public void display() {
      System.out.println("I am a dog.");
   }

   public void makeSound() {
      System.out.println("Bark bark");
   }
}

class ReflectionAPI {
  public static void main(String[] args) {
      try {
          // create an object of Dog class
          Dog d1 = new Dog();

          // create an object of Class using getClass()
          Class obj = d1.getClass();
        
          // find the interfaces implemented by Dog
          Class[] objInterface = obj.getInterfaces();
          for(Class c : objInterface) {

              // print the name of interfaces
              System.out.println("Interface Name: " + c.getName());
          }
      }

      catch(Exception e) {
          e.printStackTrace();
      }
   }
}
