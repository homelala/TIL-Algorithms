package string;

import java.util.Scanner;
// 5. 특정 문자 뒤집기
public class ReverseSpecifyString {
    public String solution(String str) {
        char [] x = str.toCharArray();
        int left = 0;
        int right = x.length-1;
        while(left<right){
            if(!Character.isAlphabetic(x[left])){
                left++;
            }else if(!Character.isAlphabetic(x[right])){
                right--;
            }else{
                char tmp = x[left];
                x[left] = x[right];
                x[right] = tmp;
                left++;
                right--;
            }
        }
        return String.valueOf(x);
    }

    public static void main(String[] args) {
        ReverseSpecifyString T = new ReverseSpecifyString();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
