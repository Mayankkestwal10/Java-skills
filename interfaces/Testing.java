interface Prime {
    boolean isPrime(int x);
}

interface Average {
    double getAverage(int x, int y, int z);
}

interface Sum {
    void show(int x, int y, double c);
}

class Testing {

    public static void main(String[] mk) {
        Prime p = (int x) -> {
            int i;
            int c = 0;
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    c++;
                    break;
                } else {
                    continue;
                }
            }
            if (c == 0) {

                return true;

            } else {
                return false;
            }


        };
        System.out.print(p.isPrime(6));
    }
}