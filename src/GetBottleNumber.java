
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-22 14:15
 * @desc:
 */
public class GetBottleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<Integer> list = new ArrayList<>();
        while (count-- > 0) {
            int temp = in.nextInt();
            list.add(temp);
        }
        for (Integer i : list) {
            System.out.println(i / 2);

        }
    }
}
