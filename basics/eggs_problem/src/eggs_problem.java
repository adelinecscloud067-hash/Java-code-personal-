public class eggs_problem {
    public static void main(String[] args) {
        int eggs = 63;
        while (true) {
            if (eggs % 2 == 1 && eggs % 3 == 0 && eggs % 4 == 1 &&
                    eggs % 5 == 4 && eggs % 6 == 3 && eggs % 7 == 0 &&
                    eggs % 8 == 1 && eggs % 9 == 0) {
                System.out.println("最少有 " + eggs + " 个鸡蛋。");
                break;
            }
            eggs += 63;
        }
    }
}
