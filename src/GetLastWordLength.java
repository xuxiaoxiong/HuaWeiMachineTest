
import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-19 20:17
 * @desc:
 */
public class GetLastWordLength {
    public static void main(String[] args) {
        String input_str = null;
        String[] str_array = null;
        int length = 0;
        int lastWordLength = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串！");
        input_str = in.nextLine();
        str_array =  input_str.split(" ");
        length = str_array.length;
        lastWordLength = str_array[length - 1].length();
        System.out.println("整数"+lastWordLength+",最后一个单词的长度");
    }
}
