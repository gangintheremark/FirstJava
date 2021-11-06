import java.util.Scanner;

public class test_07 {
    public static void main(String[] args) {
        int[] data = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            data[i] = (int) (Math.random() * 10 + 1); // 1에서 10까지의 범위의 정수를 랜덤생성
            sum += data[i];
        }
        System.out.print("랜덤한 정수들 : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("평균은 " + (float) sum / 10.0);
    }
}
