import java.util.Scanner;
public class serial_addition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("依次输入10个数字");
        double sum=0;
        for(int i=0; i<10; i++){
            int n= scanner.nextInt();
            sum +=n;
        }
        System.out.print("和为"+sum);

        scanner.close();
    }
}