package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 3. 최대 매출
public class MaxSales {
    public int solution(int num1, int num2, int[] arr1) {
        int answer = 0;
        int max = 0;
        for(int i =0;i<num2;i++){
            max += arr1[i];
        }
        answer = max;
        for (int i = num2; i < num1; i++) {
            max = max + arr1[i] - arr1[i - num2];
            answer = Math.max(answer, max);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxSales T = new MaxSales();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr1 = new int[num1+2];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print(T.solution(num1, num2, arr1));
    }
}
