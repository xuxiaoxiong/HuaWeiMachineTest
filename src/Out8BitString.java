import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-19 21:27
 * @desc: •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 */
public class Out8BitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String str2 = scanner.nextLine();
            split(str);
            split(str2);
    }

    public static void split(String str) {
        while(str.length() > 8){
            System.out.println(str.substring(0,8));
            str = str.substring(8);
        }
        String tmp = str + "00000000";
        System.out.println(tmp.substring(0, 8));
    }
}
