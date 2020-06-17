package day03;

/**
 * Create By ${user} on 2020/6/17.
 * 打印等腰三角形
 */
public class homework_01 {
    public static void main(String[] args) {
        //控制行数
        for(int i = 1; i<=4 ; i++) {
            //控制空格
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            //控制星数
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
