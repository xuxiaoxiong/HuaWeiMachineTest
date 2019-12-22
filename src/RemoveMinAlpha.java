
import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-22 16:49
 * @desc: 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 */
public class RemoveMinAlpha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] chars = new int[26];
        int min = Integer.MAX_VALUE;  // 注意这里
        char[] chars1 = input.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            int temp = chars1[i] - 97;
            chars[temp]++;
            min = min > chars[temp] ? chars[temp] : min;
        }
        System.out.println(min);
        for (int i = 0; i < chars.length; i++) {
            if (min == chars [i]) {
                input = input.replaceAll(String.valueOf((char)(i + 97)),"");
            }
        }
        System.out.println(input);

    }
}
