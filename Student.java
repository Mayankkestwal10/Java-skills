import java.util.Scanner;
class Student
{
String name;
double cgpa;
long mobile;

void showDetails(){
  System.out.println(name + "\t" + cgpa + "\t" + mobile);
}
}

class Main
{
public static void main(String [] mk)
{
 Scanner sc  = new Scanner(System.in);
for(int i=1; i<=2; i++){
 Student s1 = new Student();
 System.out.println("Enter the name");
 s1.name = sc.nextLine();
 System.out.println("Enter the Contact Number");
 s1.mobile = sc.nextLong();
 System.out.println("Enter the cgpa");
 s1.cgpa = sc.nextDouble();
 s1.showDetails();
}


}
}