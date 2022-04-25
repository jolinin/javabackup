package loop;
import java.util.Scanner;
public class jioujudgement {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要判断的数据");
        int b = sc.nextInt();
        if (b % 2 == 0) {
            System.out.println("该数是偶数");
        } else {
            System.out.println("该数是奇数");
        }
    }
}