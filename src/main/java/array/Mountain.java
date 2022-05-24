package array;

import java.util.Scanner;

// 10. 봉우리
public class Mountain {
    private boolean isMountain(int count, int x, int y, int[][] arr){
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};

        for(int i = 0;i<4;i++){
            int numX = x + dx[i];
            int numY = y + dy[i];
            if(numX >=0 && numX <count && numY >=0 && numY <count){
                if(arr[numX][numY] >= arr[x][y]){
                    return false;
                }
            }
        }
        return true;
    }
    public int solution(int count, int[][] arr) {
        // 내 풀이
        int answer = 0;

        for(int i =0;i<count;i++){
            for(int j =0;j<count;j++){
                if(isMountain(count,i,j,arr)){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Mountain T = new Mountain();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] arr = new int[len][len];
        for (int i =0;i<len;i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(len, arr));

    }
}
