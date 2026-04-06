import java.util.Scanner;

public class taxifare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入行驶公里数：");
        double km = scanner.nextDouble();
        double fare = 0.0;
        if (km <= 2) {
            fare = 5.0;
        } else if (km <= 9) {
            fare = 5.0 + (km - 2) * 1.3;
        } else {
            fare = 5.0 + (9 - 2) * 1.3 + (km - 9) * 2.0;
        }
        fare += 1.0;
        System.out.printf("应收车费：%.2f元\n", fare);
        scanner.close();
    }
}
