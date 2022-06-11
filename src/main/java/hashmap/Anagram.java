package hashmap;

import java.util.HashMap;
import java.util.Scanner;

// 2. 아나 그램
public class Anagram {
    public String solution(String str1, String str2) {
//        // 내 풀이
//        HashMap<Character, Integer> map = new HashMap<>();
//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        for (int i = 0; i < str1.length(); i++) {
//            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
//            map.put(arr2[i], map.getOrDefault(arr2[i], 0) - 1);
//        }
//        for (Character character : map.keySet()) {
//            if(map.get(character) != 0)
//                return "NO";
//        }
//        return "YES";

        // 다른 풀이
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : str1.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);

        }
        for (Character character : str1.toCharArray()) {
            if(!map.containsKey(character) || map.get(character) == 0)
                return "NO";
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        return "YES";

    }

    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        System.out.println(T.solution(input1, input2));
    }
}
