import java.util.Scanner;
public class member_registration {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] a=new char[3];
        char[] b=new char[6];
        int i=0,c=0,j=0;
        System.out.println("请输入用户名");
        for(i=0;i<3;i++){
            a[i]=scanner.nextLine();
            if(a[i]=='\n'){
                System.out.println("错误：用户名长度不得小于3");
                break;
            }
        }
        System.out.println("请输入密码：");
        for(i=0;i<6;i++){
            b[i]=scanner.next()charAt(0);
            if(b[i]=='\n'){
                System.out.println("错误：密码不得少于6位");
                break;
            }
        System.out.print("请再次确认密码：");
        for(j=0;j<6;j++){
            c=scanner.nextInt();
            if(c!=b[i]){
                System.out.println("错误：两次密码不一致");
                break;
            }else{
                continue;
            }
        }
        }
    scanner.close();
    }
}
/*实现会员注册，要求用户名长度不小于3，密码长度不小于6，若不满足需有提示信息，提示输入有误；
注册时两次输入密码必须相同（字符串）*/