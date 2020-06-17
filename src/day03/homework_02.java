package day03;

/**
 * Create By ${user} on 2020/6/17.
 * 求100以内质数的和
 */
public class homework_02 {
    public static void main(String[] args) {
        int j;
        int sum = 0;
        for(int i =2;i<=100;i++){
            for( j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j>=i){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println("\nsum="+sum);
    }
}
