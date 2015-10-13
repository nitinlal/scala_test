

import java.util.Date

object WellHello extends App{
    println("hello scala");
    
    val a = 1;
    val b = 2;
    
    println(a);
    println(b);
    
    //numbers are objects
    println((1).*(2));

    
    def printSomething(){
      println("this function prints something");
    }
            
    def printEverFew(callback:()=>Unit){
      while(true){
        callback(); Thread sleep 1000;
      }
    }
    
    
    
    
    
    
     //printEverFew(printSomething);
    
    
    //anonymous functions
    
    
    def person(callback:() => Unit){
      callback();
    }
    println(person(()=>println("My Name is Nitin")));

    
      
    
}