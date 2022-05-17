package array;

import string.Password;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 1. 큰 수 출력하기
public class printMaxNumber {
    public ArrayList<Integer> solution(int[] arr) {
        // 내 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i =1;i<arr.length;i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        printMaxNumber T = new printMaxNumber();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i =0;i<count;i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer integer : T.solution(arr)) {
            System.out.print(integer+" ");
        }
    }
}
