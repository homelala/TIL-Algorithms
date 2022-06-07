package twoPointer;

import java.util.ArrayList;
import java.util.Scanner;

// 4. 연속 부분 수열
public class ContinuousArray {
    public int solution(int num1, int num2, int[] arr1) {
        int answer = 0;
        int left = 0, sum = arr1[0];
        for (int right = 0; right < num2; right++) {
            sum += arr1[right];
            if(sum == num2) answer++;
            while (sum >= num2) {
                sum -= arr1[left];
                if(sum == num2) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousArray T = new ContinuousArray();
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

