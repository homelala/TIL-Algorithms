package array;

import java.util.Scanner;

// 11. 임시 반장 정하기
public class TempLeader {
    public int solution(int len, int[][] arr) {
        // 내 풀이
        int answer = 0;
        int max = Integer.MIN_VALUE;
        // 이렇게 풀면 같은 반이 되었던 학생에 대해 중복 처리 가 힘들다
//        for(int i =0;i<len ;i++){ // 학생 번호
//            int count = 0;
//            for (int j = 0; j < 5; j++) { // 학년
//                for(int x = 0; x<len;x++) { // 비교 학생 번호
//                    if (arr[i][j] == arr[x][j]) {
//                        count ++;
//                    }
//                }
//            }
//            if(max<count){
//                max = count;
//                answer = i+1;
//            }
//        }

        for(int i =0;i<len ;i++){ // 학생 번호
            int count = 0;
            for (int j = 0; j < len; j++) { // 비교 학생
                for(int x = 0; x<5;x++) { // 학년
                    if (arr[i][x] == arr[j][x]) {
                        count ++;
                        break;
                    }
                }
            }
            if(max<count){
                max = count;
                answer = i+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TempLeader T = new TempLeader();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] arr = new int[len][5];
        for (int i =0;i<len;i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(len, arr));

    }
}
