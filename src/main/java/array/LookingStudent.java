package array;


import java.util.Scanner;

// 2. 보이는 학생
public class LookingStudent {
    public int solution(int num, int[] arr) {
        int answer = 1;
        int max = arr[0];
        // 내 풀이
        for (int i = 1; i < num; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LookingStudent T = new LookingStudent();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(num,arr));
    }
}
