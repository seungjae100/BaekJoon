package chat1;

import java.util.Scanner;

// 2588 번
public class ThreeThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ones = B % 10;
        int tens = (B / 10) % 10;
        int hundreds = B / 100;

        int step1 = A * ones;
        int step2 = A * tens;
        int step3 = A * hundreds;
        int result = A * B;

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(result);



    }
}
