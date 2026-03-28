public class compare_between_different_numeric_type {
    /**
     * 求a和b的和
     * @param a int型
     * @param b int型
     */
    public static int add(int a, int b){
        return(a+b);
    }

    /**
     * 重载add（）方法
     * @param c double型
     * @param d double型
     */
    public static double add(double c, double d){
        return(c+d);
    }

    /**
     * 重载add()方法
     * @param c double型
     * @param d double型
     * @param e double型
     */
    public static double add(double c, double d, double e){
        return(c+d+e);
    }
    public static void main(String[] args){
        int a=3, b=5;
        double c=0.02, d=0.89, e=5.32;
        System.out.println("a="+a+" b="+b+" c="+c+" d="+d+" e="+e);
        //调用add(int a, int b)方法
        System.out.println("a+b="+add(a,b));
        //调用add(double c, double d)方法
        System.out.println("c+d="+add(c,d));
        //调用add(double  c, double d, double e)方法
        System.out.println("c+d+e="+add(c,d,e));
    }

}
//使用方法重载满足一个方法实现多种数据类型处理功能。
//1.需要规定方法为static型，便于在静态环境中实现调用
