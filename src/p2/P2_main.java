package p2;

public class P2_main {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 5, 6};
        System.out.print(pairwiseDifferent(someNumbers));
    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        int ka = 0;
        int nmka;

        while (ka < someNumbers.length) {
            nmka = ka + 1;
            while (nmka < someNumbers.length) {
                if (someNumbers[ka] == someNumbers[nmka]) {
                    return false;
                }
                nmka = nmka + 1;
            }
            ka = ka + 1;
        }

        return true;
    }
}