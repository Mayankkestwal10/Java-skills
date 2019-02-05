import java.util.*;


class Mobile{

    int ram;
    String OS;
    int Price;

    Mobile(int r, String os, int pr){
        ram = r;
        OS = os;
        Price = pr;
    }

    public static void getMobiles(Mobile a[], int pr){
        for (int i = 0; i < 5; i++){
            if(a[i].Price <= pr){
                System.out.println(a[i].ram+"\t"+a[i].OS+"\t"+a[i].Price);
            }
            else {
                continue;
            }
        }

    }

    public static void main(String[] mk){

        Scanner sc = new Scanner(System.in);
        Mobile [] mb = new Mobile[7];
        mb[0] = new Mobile(4, "Android", 12000);
        mb[1] = new Mobile(8, "iOS",50000);
        mb[2] = new Mobile(4, "Android", 25000);
        mb[3] = new Mobile(6, "iOS", 13000);
        mb[4] = new Mobile(8,"Android",18000);

        System.out.print("\n\tEnter your budget : ");
        int n = sc.nextInt();

        getMobiles(mb, n);

    }
}
