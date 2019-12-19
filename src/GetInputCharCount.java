
import	java.util.Scanner;/**
 * @author: 徐晓雄
 * @date: 2019-12-19 20:44
 * @desc:  写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class GetInputCharCount {
    public static void main(String[] args) {
        String input_str = null;
        String search_str ;
        char search_char ;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        // 注意这里需要全部转换成小写
        input_str = scanner.nextLine().toLowerCase();
        search_str = scanner.next().toLowerCase();
        search_char = search_str.charAt(0);
        for (int i = 0; i < input_str.length(); i++) {
            // 怎么判断char相等
            if(input_str.charAt(i) == search_char){
                count++;
            }
        }
        System.out.println(count);
    }
}
