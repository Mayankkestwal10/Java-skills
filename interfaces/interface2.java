interface A{
 void demo();
}
class Dummy implements A{
 public void demo(){

}
}

class Main{
 void call(A ob){
    System.out.println("Invoked");
}
}

class Test{
 public static void main(String [] mk){
   Dummy d = new Dummy();
   Main ob = new Main();
   ob.call(d);

}

}