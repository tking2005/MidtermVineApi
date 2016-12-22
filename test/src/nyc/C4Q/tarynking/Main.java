package nyc.C4Q.tarynking;

public class Main {

    public static void main(String[] args) {
        int n = mystery(1789);
        System.out.println(1789/10);

    }

    private static int mystery(int n) {
        while (n >= 10) {
            int k = 0;
            while (n > 0) {
                k += n % 10;
                n /= 10;
            }
            n = k;
        }
        return n;
    }


}
