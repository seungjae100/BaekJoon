package chat1;

import java.util.Scanner;
// 10430 나머지 계산
public class Rest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int a1 = (A + B) % C;
        int a2 = ((A % C) + (B % C)) % C;

        int b1 = (A * B) % C;
        int b2 = ((A % C) * (B % C)) % C;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);

    }
}
