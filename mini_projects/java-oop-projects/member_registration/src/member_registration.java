import java.util.Scanner;
public class member_registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        String confirmPassword;
        boolean registered = false;
        while (!registered) {
            System.out.print("请输入用户名（长度不小于3）：");
            username = scanner.nextLine();
            if (username.length() < 3) {
                System.out.println("提示：用户名长度不能小于3，请重新输入！");
                continue;
            }
            System.out.print("请输入密码（长度不小于6）：");
            password = scanner.nextLine();
            if (password.length() < 6) {
                System.out.println("密码长度不能小于6，请重新输入！");
                continue;
            }
            System.out.print("请再次输入密码：");
            confirmPassword = scanner.nextLine();
            if (!password.equals(confirmPassword)) {
                System.out.println("两次输入的密码不一致，请重新输入！");
                continue;
            }
            registered = true;
            System.out.println("注册成功！欢迎，" + username);
        }
        scanner.close();
    }
}