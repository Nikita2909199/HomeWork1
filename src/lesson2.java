public class lesson2 {
    public static boolean one(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    static void two (int a) {
        System.out.println("");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    static boolean three(int a) {
        System.out.println("");
        if (a < 0) return true;
        if (a > 0) return false;
        return true;
    }
    public static void four(String str, int n) {
        for (int i = 3; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}
