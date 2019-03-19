interface First{
  int x = 10; //by default public,static and final
  void abc();  // by default public and abstract
  
  static void demo1(){ // by default public
    
   System.out.println("Static demo in First");

  }

  default void demoDefault1(){    //by default public

   System.out.println("Default in First");
}

}
interface Second{
  int y = 20; //by default public,static and final
  void abc();  // by default public and abstract
  
  static void demo2(){ // by default public
    
   System.out.println("Static demo in Second");

  }

  default void demoDefault2(){    //by default public

   System.out.println("Default in Second");
}
}

class MyClass{

 void test(){
  System.out.println("My Class");
 }

}

abstract class MultipleInheritance extends MyClass implements First, Second{


}