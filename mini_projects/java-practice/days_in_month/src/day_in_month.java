import java.util.Scanner;
public class day_in_month {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year=0;
        int month=0;
        int is_leap_year=0, a=0;
        System.out.println("依次输入年份、月份");
        year=scanner.nextInt();
        month=scanner.nextInt();
        a=year%4;
        switch(a){
            case 0:
                is_leap_year=1;
                break;
            default:
                is_leap_year=0;
        }

        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println(year+"年"+month+"月有31天");
                break;
            case 4,6,9,11:
                System.out.println(year+"年"+month+"月有30天");
                break;
            case 2:
                if(is_leap_year==1){
                    System.out.println(year+"年"+month+"月有29天");
                    break;
                }else{
                    System.out.println(year+"年"+month+"月有28天");
                    break;
                }
        }
        scanner.close();
    }
}
