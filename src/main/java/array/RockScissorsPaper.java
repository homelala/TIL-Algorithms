package array;

import java.util.ArrayList;
import java.util.Scanner;

// 3. 가위 바위 보
public class RockScissorsPaper {
    public ArrayList<String> solution(int num, int[] arr1, int[] arr2) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (arr1[i] == arr2[i]) {
                answer.add("D");
            } else if (arr1[i] == 1 && arr2[i] ==3) {
                answer.add("A");
            } else if (arr1[i] == 2 && arr2[i] ==1) {
                answer.add("A");
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RockScissorsPaper T = new RockScissorsPaper();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        for(int i = 0 ;i<num;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0 ;i<num;i++){
            arr2[i] = sc.nextInt();
        }
        for (String i : T.solution(num, arr1, arr2)) {
            System.out.println(i);
        }
    }
}
