package chat1;

import java.util.Scanner;
// 1001 A - B
public class AMinusB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a - b;

        System.out.println(min);
    }
}
