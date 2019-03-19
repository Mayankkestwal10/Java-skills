import java.util.*;

class Food{
  int item_id;
  String item;
  int price;   
  int total;
  
  Food(int i, String item, int price){
    this.item_id = i;
    this.item = item;
    this.price = price;
  }
  
  public static void display(ArrayList <Food>item){
   
   System.out.println("\tChoose : \n");
   System.out.println("\t\t1. Starter\t\t2. Main Meal\t\t3. Drinks\n");
   
   Scanner sc = new Scanner(System.in);
   int i = sc.nextInt();
   
   if(i == 1){
     System.out.println("\tChoose : \n");
     for(int j=0;j<3;j++){

     System.out.println(item.get(j).item_id+"\t"+item.get(j).item+"\t"+item.get(j).price+"\n");

   }
   }
   else if(i == 2){


   }
   else if(i == 3){

   
   }
   else{  
    System.out.println("Sorry Invalid option\n");
    display(item);
   }

}

}

class Restaurant{
  public static void main(String[] mk){
    
   ArrayList<Food> item = new ArrayList<>();
   Food i1 = new Food(1,"Chole Bhature",40);
   item.add(i1);
   Food i2 = new Food(2,"Aloo Parantha",30);
   item.add(i2);
   Food i3 = new Food(3,"Toast",40);
   item.add(i3);
   Food i4 = new Food(4,"Khadhi Rice",70);
   item.add(i4);
   Food i5 = new Food(5,"Rajma Rice",60);
   item.add(i5);   
   Food i6 = new Food(6,"Daal Poori",50);
   item.add(i6);
   Food i7 = new Food(7,"Coke",20);
   item.add(i7);
   Food i8 = new Food(8,"Nimbu Paani",15);
   item.add(i8);
   Food i9 = new Food(9,"Mango Shake",40);
   item.add(i9);



   System.out.println("\t\t\tWelcome to Mamu's Restaurant\n");
   Food.display(item);

}

}