package string;

import java.util.ArrayList;
import java.util.Scanner;

class ReverseString {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
//        StringBuilder를 사용
//        for(String x: str) {
//            /*
//            * String은 String 메서드를 사용할 때마다 새로운 객체를 생성
//            * StringBuilder는 기존 메모리에서 연산하기 때문에 메모리 낭비가 되지 않는다. => 가볍다
//            * */
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }


        // 서로의 위치를 스위칭해주는 로직직
       for(String x : str){
            char[] s = x.toCharArray();
            int left = 0;
            int right = s.length-1;
            while(left < right){
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString T = new ReverseString();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        for (String x: T.solution(num, str)){
            System.out.println(x);
        }
    }
}
