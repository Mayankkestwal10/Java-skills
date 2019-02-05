import java.util.*;

enum Doctors {
    Doctor1("Dr.Gupta", "Dentist", 250),
    Doctor2("Dr.Chopra", "ENT", 100),
    Doctor3("Dr.Batra", "OPD", 50);

    String name, specialization;
    int consultation_fee;

    Doctors(String n, String spec, int fee) {
        name = n;
        specialization = spec;
        consultation_fee = fee;

    }
}

class EnumDemo {
    public static void main(String[] mk) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\tList of Doctors\n");
        for (Doctors d : Doctors.values())
            System.out.println(d);
        System.out.print("Select the Doctor(Enter the title): \t");
        String doc = sc.next();
        Doctors d = Doctors.valueOf(doc);

        switch (d) {
            case Doctor1:
                System.out.println(d.name + "\t" + d.consultation_fee + "\t" + d.specialization);
                break;

            case Doctor2:
                System.out.println(d.name + "\t" + d.consultation_fee + "\t" + d.specialization);
                break;

            case Doctor3:
                System.out.println(d.name + "\t" + d.consultation_fee + "\t" + d.specialization);
                break;


        }

    }

}