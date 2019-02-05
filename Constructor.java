import java.util.Scanner;
class ArrayTest{
 public static void main(String [] mk){

  Scanner sc = new Scanner(System.in);

  Employee [] emps = new Employee [10];
  emps[5] = new Employee("Mayank",5,42642);
  emps[1] = new Employee("Saurav",4,44551);
  emps[3] = new Employee("Ashutosh",2,75564);

  System.out.print("\n Enter the Employee Id that you want to search : ");
  int id = sc.nextInt();
  System.out.println("\n You have entered :"+id);

  boolean found = false;
  for(Employee e:emps){
    if(e != null && e.emp_id == id){
      System.out.println(e.emp_name + "\t" + e.salary);
      found = true;
      break;
}
}
}
}



class Employee{
  int emp_id;
  double salary;
  String emp_name;

//Constructor
  Employee(String n, int id, double sal){
     emp_name = n;
     emp_id = id;
     salary = sal;

}

}