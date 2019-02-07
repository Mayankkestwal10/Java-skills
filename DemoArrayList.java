import java.util.ArrayList;

class Employee {
    String name;
    int emp_id;
    double salary;

    Employee(String n, int id, double s) {
        this.name = n;
        emp_id = id;
        this.salary = s;
    }

    public static void getEmployee(String nm, ArrayList <Employee>emp) {
        for (Employee i : emp) {
            if (i.name==nm){
                System.out.println("Employee name : " + nm + "\t" + i.emp_id + "\t" + i.salary);
            }
        }
    }
}

class DemoArrayList {
    public static void main(String[] mk) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee("Mayank", 12, 45.2);
        emp.add(e1);
        Employee e2 = new Employee("Saurav", 14, 45.5);
        emp.add(e2);
        Employee e3 = new Employee("Sagar", 17, 42.5);
        emp.add(e3);

        Employee.getEmployee("Saurav",emp);
    }
}