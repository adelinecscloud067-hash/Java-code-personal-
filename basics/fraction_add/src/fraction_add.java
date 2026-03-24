public class fraction_add {
    public static void main(String[] args) {
        // 1. 使用 for 循环
        double sumFor = 1.0;
        double fact = 1.0;
        for (int n = 2; n <= 20; n++) {
            fact *= n;
            double term = 1.0 / fact;
            if (n % 2 == 0) {
                sumFor += term;
            } else {
                sumFor -= term;
            }
        }
        System.out.println("for 循环计算结果：" + sumFor);
        double sumDoWhile = 1.0;
        double factDoWhile = 1.0;
        int n = 2;
        do {
            factDoWhile *= n;
            double term = 1.0 / factDoWhile;
            if (n % 2 == 0) {
                sumDoWhile += term;
            } else {
                sumDoWhile -= term;
            }
            n++;
        } while (n <= 20);
        System.out.println("do-while 循环计算结果：" + sumDoWhile);
    }
}
