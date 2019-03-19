abstract class Add{
  int add(int a, int b);
}
interface X{
 void test();
 default void demo(){
   System.out.println("Interface X invoked");
}
 static void show(){

}

}
interface Y{
 void test();
 default void demo(){
  System.out.println("Interface Y is invoked");
}

}

class Z extends Add implements X, Y{
  public int add(int a, int b){

   return a+b;
  }

  public void test(){
      

  }
  public void demo(){

}
}