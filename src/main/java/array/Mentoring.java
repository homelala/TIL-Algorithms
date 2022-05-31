package array;

import java.util.Scanner;

// 12. 멘토링
public class Mentoring {
    public int solution(int count,int test, int[][] arr) {
        int answer = 0;
        // 내 풀이
        for (int i = 0; i < count; i++) { // 학생 1
            for (int j = 0; j < count; j++) { // 학생 2
                boolean flag = true;
                for (int k = 0; k < test; k++) { // 시험 횟수
                    int pi=0, pj=0;
                    for (int l = 0; l < count; l++) { // 등수 찾기, 확인하기
                        if(arr[k][l] == i+1)
                            pi = l;
                        if(arr[k][l] == j+1)
                            pj = l;
                    }
                    if(pi <= pj){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Mentoring T = new Mentoring();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int test = sc.nextInt();
        int[][] arr = new int[test][count];
        for(int i = 0 ;i<test;i++){
            for (int j = 0; j < count; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(count,test,arr));
    }
}
