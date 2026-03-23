import java.util.Scanner;
public class Chinese_zodiac_analyze {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int birth_year=0;
        int mod_result=0;
        System.out.print("输入出生年份算生肖属相：");
        birth_year=scanner.nextInt();
        mod_result=birth_year%12;
        switch(mod_result){
            case 0:
                System.out.println("属猴");
                break;
            case 1:
                System.out.println("属鸡");
                break;
            case 2:
                System.out.println("属狗");
                break;
            case 3:
                System.out.println("属猪");
                break;
            case 4:
                System.out.println("属鼠");
                break;
            case 5:
                System.out.println("属牛");
                break;
            case 6:
                System.out.println("属虎");
                break;
            case 7:
                System.out.println("属兔");
                break;
            case 8:
                System.out.println("属龙");
                break;
            case 9:
                System.out.println("属蛇");
                break;
            case 10:
                System.out.println("属马");
                break;
            case 11:
                System.out.println("属羊");
                break;
            default:
                System.out.println("请输入正确的年份！");
        }
        scanner.close();

    }
}
