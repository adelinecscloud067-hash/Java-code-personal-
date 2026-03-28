public class array_transpose {
    public static void main(String[] args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]=new int[3][3];
        int i, j=0;
        int n=0;
        System.out.println("原数组为：");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
                b[j][i]=a[i][j];
                if((j!=0)&&((j+1)%3==0)){
                    System.out.print('\n');
                }
            }
        }
        System.out.println("转置后的数组为：");
        for(j=0;j<a.length;j++){
            for(i=0;i<a.length;i++){
                System.out.print(b[j][i]+" ");
                if((i!=0)&&((i+1)%3==0)){
                    System.out.print('\n');
                }
            }
        }

    }
}
//编写一个程序，将二维数组a转置后存入数组b（所谓转置就是行列互换）
//1.多维数组定义格式：int 数组名[][]={{第一行},{第二行},......}
//2.循环：注意循环变量和数组长度关系。不能越界访问数组（有n个元素的数组长度为n，最大下标为n-1。更加便利保险的是用a.length限制循环次数）
//3.判断换行：注意下标（n）与个数排序（n+1）的关系，取模进行个数判断是否换行
