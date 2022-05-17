package array;

import java.util.ArrayList;
import java.util.Scanner;

// 5. 에라토스테네스의 체
public class Eratosthenes {
    public int solution(int num) {
        int answer = 0;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                answer++;
                int j = 2;
                while (i * j <= num) {
                    arr[i * j] = 1;
                    j++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Eratosthenes T = new Eratosthenes();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(T.solution(num));

    }
}
