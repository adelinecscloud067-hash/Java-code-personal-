import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要比较的三个数字：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = (a>b)?((a>c? a:c)):((b>c? b:c));
        System.out.println("最大的整数为"+max);

        scanner.close();

    }
}
/*1.int语句支持同时初始化变量和接收输入数值
* 2.使用嵌套思维解决“一个使用三目运算符的语句一次性比较三个/多个数字”功能
* 3.输出的多个部分内容不是同一种字符类型只能用“+”连接，而不能用逗号加空格*/
