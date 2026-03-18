import java.util.Scanner;
public class MemberRegistration {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        char name = scanner.next();


    }
}
/*实现会员注册，要求用户名长度不小于3，密码长度不小于6，若不满足需有提示信息，提示输入有误；注册时两次输入密码必须相同（字符串）*/