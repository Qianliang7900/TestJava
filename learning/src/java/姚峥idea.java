import java.util.Scanner;

public class 姚峥idea {
    public static void main(String[] args) {
        System.out.println("输入a的值：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入b的值：");
        int b = new Scanner(System.in).nextInt();
        int count = 0;
        while (a!=b&&a<b){
            a+=10;
            b-=10;
            count++;
        }
        if (a==b){
        System.out.println("a与b相等，经历"+count+"秒");
        }else {
            System.out.println("ab不会相等");
        }
    }
}
