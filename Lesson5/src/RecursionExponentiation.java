/**
 * Java home work 5
 *
 * @author Denisov Alexey
 * @version dated Oct, 25, 2018
 */


public class RecursionExponentiation {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(exponentiation(4, 3)); // где х - число, у - степень.

    }

    private static int exponentiation(int x, int y) throws InterruptedException {
        if (y == 0) {
            return 1;
        }
        {
            if (y == 1) {
                return x;
            } else
                return x * (exponentiation(x, y - 1));
        }
    }
}