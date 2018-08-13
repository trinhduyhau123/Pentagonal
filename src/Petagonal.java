public class Petagonal {
    public static int Petagonal(int n) {
        return n * (3 * n - 1) / 2;
    }
    public static void main(String[] args) {
        int n = 6;
        for (int i=1;i<=n;i++) {
            System.out.printf(Petagonal(i) +"\t");
        }
    }
}
