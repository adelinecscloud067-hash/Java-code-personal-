import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    static int attendanceCount;

    public Employee(int id, String name){
        this.id=0;
        this.name="Unknown";
    }
    public Employee(){                                                             //便于使用默认构造方法预留无信息对象
        this.id=0;
        this.name="Unknown";
    }

    public static void sign_in(String name){                                       //设置为static型便于在主方法中调用
        System.out.println(name+"已签到，当前共有"+attendanceCount+"人已签到");
    }
    public void displayInfo(){
        System.out.println("——————"+name+" 信息——————");
        System.out.println("编号："+id);
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("职务："+position);
        System.out.println("部门："+department);
    }
}

public class employee_management {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Employee employee1=new Employee(001,"Mark");
        Employee employee2=new Employee(002,"Jane");
        Employee employee3=new Employee(003,"Steven");
        Employee employee4=new Employee();
        int choice=0;
        while(choice!=3){                                                       //隐含 在此界面内输入3自动关闭系统判断
            System.out.println("-------雇员管理系统主页面------");
            System.out.println("|1.发起签到                   |");
            System.out.println("|2.显示雇员详细信息            |");
            System.out.println("|3.退出系统                   |");
            System.out.println("|____________________________|");
            choice=scanner.nextInt();                                            //每次重新判断choice，防止在某一个功能中死循环
            switch(choice){
                case 1:
                    System.out.println("请依次输入签到人名字：");
                    String c=scanner.nextLine();
                    while(!(c=scanner.nextLine()).equals("0")){                     //判断输入是否为结束符号，并接收第一个名字
                        if((c.equals("Mark"))||(c.equals("Jane"))||(c.equals("Steven"))){
                            Employee.attendanceCount+=1;
                            Employee.sign_in(c);
                        }else{
                            System.out.println("输入不在雇员名单内。请重新输入！");
                        }
                    }
                    System.out.println("签到结束。共有"+Employee.attendanceCount+"人参加此次签到");
                    break;
                case 2:
                    System.out.print("输入要查询的雇员编号（001到004）：");
                    int num=scanner.nextInt();
                    if(num==1){
                        employee1.displayInfo();
                    }
                    else if(num==2){
                        employee2.displayInfo();
                    }
                    else if(num==3){
                        employee3.displayInfo();
                    }
                    else if(num==4){
                        employee4.displayInfo();
                    }
                    break;

            }
        }

    System.out.println("系统已关闭。");
    scanner.close();

    }

}
