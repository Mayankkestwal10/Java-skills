interface Test1{

  int check(String s, char c);

}
interface Test2{

  void add(int x, int y, int z);

}
class LambdaExpression{
  public static void main(String[] mk){
  
   Test1 ob1 = (String s, char c) -> {
   
     int count = 0;

    for(int i=0; i < s.length(); i++)
    {    if(s.charAt(i) == c)
            count++;
    }

    return count;

};
   
   System.out.println(ob1.check("Mayank",'M'));


   Test2 ob2 = (int x, int y, int z)->{
    System.out.println(x+y+z);
};
     
   ob2.add(4,6,2);
}

}