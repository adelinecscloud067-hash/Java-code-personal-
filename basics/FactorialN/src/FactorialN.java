import java.util.Scanner;
public class FactorialN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i, out=1;
        System.out.println("输入阶乘级数n：");
        int n = scanner.nextInt();
        for(i=1;i<n+1;i++){
            out*=i;
        }
        System.out.println(n+"！结果为"+out);
    scanner.close();
    }
}
