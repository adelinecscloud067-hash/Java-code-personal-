public class turtle_climb {
    public static void main(String[] args){
        int distance=100;
        int time=0;
        while(distance>=0){
            time+=1;
            distance-=4;
            if(distance==0){
                break;
            }
            distance+=1;
        }
        System.out.println("总共用了"+time+"小时第一次到达终点");
    }
}
