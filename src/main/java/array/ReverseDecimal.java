package array;

import java.util.ArrayList;
import java.util.Scanner;


// 6. 뒤집은 소수
public class ReverseDecimal {
    public boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%2 ==0)
                return false;
        }
        return true;
    }

    public ArrayList<Integer>  solution(int num, int[] arr) {
        // 내 풀이
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            StringBuilder temp = new StringBuilder(Integer.toString(arr[i])).reverse();
            int a = Integer.parseInt(temp.toString());
            if (isPrime(a)) {
                answer.add(a);
            }
        }

        // 나머지를 이용한 리버스 구현
        for(int i =0;i<num;i++){
            int tmp = arr[i];
            int res = 0;
            while (tmp>0){
                int t= tmp%10;
                res = res*10+t;
                tmp/=10;
            }
            if (isPrime(res)) {
                answer.add(res);

            }
        }
        for (Integer integer : answer) {
            System.out.println("integer = " + integer);
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseDecimal T = new ReverseDecimal();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(num, arr));

    }
}
