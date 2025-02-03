package chat1;

import java.util.Scanner;

// 10869 사칙연산
public class AFB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int min = a - b;
        int mul = a * b;
        int div = a / b;
        int remain = a % b;

        System.out.println(sum);
        System.out.println(min);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(remain);
    }
}
