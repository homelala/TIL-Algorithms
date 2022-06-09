package twoPointer;

import java.util.Scanner;

// 6. 최대 길이 연속 부분 수열
public class MaxLengthContinuousArray {
    public int solution(int num1, int num2, int[] arr1) {
        int answer = 0;
        int left = 0, count = 0;
        for (int i = 0; i < num1; i++) {
            if(arr1[i] == 0){ count++;}

            while (count > num2) {
                if(arr1[left] == 0) count--;
                left++;
            }
            answer = Math.max(answer, i - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxLengthContinuousArray T = new MaxLengthContinuousArray();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] arr1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print( T.solution(num1, num2, arr1));

    }
}
