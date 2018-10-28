public class FullBackpack {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int Backpack(int W, int weight[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;
        if (weight[n - 1] > W)
            return Backpack(W, weight, val, n - 1);
        else return max(val[n - 1] + Backpack(W - weight[n - 1], weight, val, n - 1),
                Backpack(W, weight, val, n - 1)
        );
    }

    public static void main(String args[])
    {
        int val[] = new int[]{60, 100, 120}; // стоимость
        int weight[] = new int[]{10, 20, 30}; // вес
        int  W = 30; // объем
        int n = val.length;
        System.out.println(Backpack(W, weight, val, n));
    }
}