package twoPointer;

import java.util.Scanner;

// 5. 연속된 자연수
public class ContinuousSum {
    public int solution(int num1) {
//        int answer = 0, sum = 0, left = 1;

//        // 내 풀이
//        for (int i = 1; i <= num1; i++) {
//            sum += i;
//            if(sum == num1){
//                System.out.println("i = " + i+" "+sum);
//                answer++;
//            }
//
//            while (sum >= num1) {
//                sum -= left;
//                left++;
//                if (sum == num1 && i != num1) {
//                    System.out.println("i = " + i);
//                    answer++;
//                }
//            }
//        }
//        // 반 까지만 구현하면 된다.
//        for (int i = 1; i <= num1/2+1; i++) {
//            sum += i;
//            if(sum == num1){
//                answer++;
//            }
//
//            while (sum >= num1) {
//                sum -= left;
//                left++;
//                if (sum == num1 && i != num1) {
//                    answer++;
//                }
//            }
//        }
        // 수학적 알고리즘 사용
        int answer = 0, cnt = 1; // cnt 연속된 자연수의 개수
        num1--;

        while (num1 > 0) {
            cnt++;
            num1 -= cnt;
            if(num1%cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSum T = new ContinuousSum();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();


        System.out.print(T.solution(num1));

    }
}
