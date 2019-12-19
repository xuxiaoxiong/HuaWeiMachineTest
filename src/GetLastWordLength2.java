
import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-19 20:17
 * @desc:
 */
public class GetLastWordLength2 {
    public static void main(String[] args) {
        String input_str = null;
        String cutout_str = null;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串！");
        input_str = in.nextLine();
        int index = input_str.lastIndexOf(" ");
        cutout_str = input_str.substring(index+1);
        System.out.println(cutout_str.length() );
    }
}
