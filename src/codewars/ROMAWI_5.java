package codewars;

public class ROMAWI_5 {

    public static int noBoringZeros(int n) {
        if (n == 0)  return 0;
        while (n % 10 == 0) {
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        int no1 = 1450;
        int no2 = 960000;
        int no3 = 1050;
        int no4 = -1050;

        System.out.println(noBoringZeros(no1));
        System.out.println(noBoringZeros(no2));
        System.out.println(noBoringZeros(no3));
        System.out.println(noBoringZeros(no4));

    }

}
