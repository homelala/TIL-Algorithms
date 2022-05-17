package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 4. 피보나치 수열
public class Fibonacci {
    public ArrayList<Integer> solution(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        for (int i = 2; i < num; i++) {
            arr.add(arr.get(i - 1) + arr.get(i - 2));
        }

        return arr;
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i :T.solution(num)){
            System.out.print(i + " ");
        }
    }
}
