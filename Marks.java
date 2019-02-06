import java.util.*;

class Marks {

    int[] roundUp(double[] m) {
        int marks;
        int[] arrMrk = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            marks = (int) m[i];

            if (m[i] == (int) m[i]) {
                arrMrk[i] = marks;
            } else {
                arrMrk[i] = marks + 1;
            }
        }
        return arrMrk;
    }

    public static void main(String[] mk) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] marks = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter the marks of subjects" + (i + 1) + " : \t");
            marks[i] = sc.nextDouble();
        }

        Marks obj = new Marks();
        int[] output = obj.roundUp(marks);

        for (int x : output){
            System.out.println(x);
        }
    }


}
