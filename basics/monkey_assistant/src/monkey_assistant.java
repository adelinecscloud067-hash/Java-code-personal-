import java.util.Scanner;
class TestMonkeyAssistant{
    String name;
    int age;
    double weight;
    String hobbies;
    double temperature;

    public TestMonkeyAssistant(String name, int age, double weight, String hobby, double temperature){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.temperature=0.0;
    }
    public TestMonkeyAssistant(String name, int age, double weight, String hobbies) {
        this(name, age, weight, hobbies, 0.0);
    }
    public void climbTree(){
        System.out.println("Monkey "+name+" is climbing a tree.");
    }
    public void printDetails(){
        System.out.println("=======猴子助手"+name+"信息======");
        System.out.println("age:"+age);
        System.out.println("weight:"+weight);
        System.out.println("hobbies:"+hobbies);
    }
    public double celsiusToFahrenheit(double celsius){
        return (celsius/1.8+32);
    }
    public double fahrenheitToCelsius(double fahrenheit){
        return ((fahrenheit-32)/((double) 5/9));
    }

}
public class monkey_assistant {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        TestMonkeyAssistant assistant1=new TestMonkeyAssistant("monkey1",3,37.1,"climbing");
        TestMonkeyAssistant assistant2=new TestMonkeyAssistant("皮皮",2,48.0,"eating bananas");
        assistant1.printDetails();
        assistant2.printDetails();
        assistant1.climbTree();
        assistant2.climbTree();
        System.out.println();
        System.out.print("输入一个摄氏温度：");
        double CTemp=scanner.nextDouble();
        System.out.println(assistant1.name+"返回："+assistant1.celsiusToFahrenheit(CTemp)+"℉");
        System.out.println(assistant2.name+"返回："+assistant2.celsiusToFahrenheit(CTemp)+"℉");
        System.out.print("输入一个华氏温度：");
        double FTemp=scanner.nextDouble();
        System.out.println(assistant1.name+"返回："+assistant1.fahrenheitToCelsius(FTemp)+"℃");
        System.out.println(assistant2.name+"返回："+assistant2.fahrenheitToCelsius(FTemp)+"℃");

        scanner.close();
    }

}
//1.用构造函数重载为temperature赋默认值0.0
