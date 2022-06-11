package hashmap;

import java.util.HashMap;
import java.util.Scanner;

// 1. 학급 회장
public class Chairman {
    public String solution(String str) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        int max = Integer.MIN_VALUE;
        for (Character character : map.keySet()) {
            if (max < map.get(character)) {
                answer = character.toString();
                max = map.get(character);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Chairman T = new Chairman();
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        String input = sc.next();

        System.out.println(T.solution(input));
    }
}
