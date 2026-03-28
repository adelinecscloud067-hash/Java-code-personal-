import java.util.Scanner;
public class find_number_in_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,5,7,11,13};
        int in_array=0;
        int b=0, i=0;
        System.out.print("请输入需要查找的数字：");
        int n=sc.nextInt();
        for(i=0;i<a.length;i++){
            if(n==a[i]){
                in_array=1;
                b=i;
                break;
            }else{
                in_array=0;
                continue;
            }
        }
        if(in_array==1){
            System.out.println(n+"在数组中，对应下标为"+b);
        }else{
            System.out.println(n+"不在数组中");
        }

        sc.close();
    }
}

//定义一维数组并初始化，通过键盘任意输入一个数，查找该数是否存在（结果返回下标值）。
//1.需要设置一个状态判定变量in_array，便于根据参数取值，进行 打印下标/提示数字不在数组中 的不同操作
//2.需要另外引入一个变量，用于接受循环终止变量i，并在循环外输出
//3.用相对不易出错的传统for循环方法，使用a.length获得数组长度遍历寻找
