
import java.util.Scanner;
class top_two_students{
    static class top_two_result{
        public String NameFirst;
        public double ScoreFirst;
        public String NameSecond;
        public double ScoreSecond;
    }
    public static void renew_top_two(top_two_result result,String name, double score){
        if(score>result.ScoreFirst){
            result.NameSecond=result.NameFirst;
            result.ScoreSecond=result.ScoreFirst;
            result.NameFirst=name;
            result.ScoreFirst=score;
        }else if(score>result.ScoreSecond){
            result.NameSecond=name;
            result.ScoreSecond=score;
        }
    }
}
public class top_two_finder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, i = 0;
        top_two_students.top_two_result result = new top_two_students.top_two_result();
        result.ScoreFirst = -1;
        result.ScoreSecond = -1;
        System.out.print("输入学生人数：");
        n = scanner.nextInt();
        if(n<2){
            System.out.println("应输入不少于2人，可能得出前2名排名");
            scanner.close();
            return;
        }
        scanner.nextLine();
        System.out.println("按次输入学生姓名、成绩：");
        for (i = 0; i < n; i++) {
            String name = scanner.next();
            double score = scanner.nextDouble();
            top_two_students.renew_top_two(result, name, score);
        }
        System.out.println("第一名：" + result.NameFirst +","+ result.ScoreFirst + "分");
        System.out.println("第二名：" + result.NameSecond +","+ result.ScoreSecond + "分");
    scanner.close();
    }
}

/*1.top_two_students应当改为包级访问权限而不是public类。一个文件中只能有一个public类；
2.增加了“scanner.nextLine()”消除缓冲；
3.在public类主功能函数中如果要引用类中的方法，需要先说明类名字“类.方法”
4.用习惯使用的Scanner来类比自创建的类，包含使用方法和新建实例
 */