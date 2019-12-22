
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: 徐晓雄
 * @date: 2019-12-22 16:00
 * @desc:
 */
public class PasswordEncry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = null;
        input = in.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);

            if (temp >= 'A' && temp <= 'Z') {
                if (temp == 'Z') {
                    temp = 'a';
                } else {
                    temp = (char) (temp + 33);
                }
            } else if (temp >= 'a' && temp <= 'z') {
                if (temp <= 'c') {
                    temp = '2';
                } else if (temp <= 'f') {
                    temp = '3';
                } else if (temp <= 'i') {
                    temp = '4';
                } else if (temp <= 'l') {
                    temp = '5';
                } else if (temp <= 'o') {
                    temp = '6';
                } else if (temp <= 's') {
                    temp = '7';
                } else if (temp <= 'v') {
                    temp = '8';
                } else {
                    temp = '9';
                }
            }
            list.add(temp);
        }
        for (Character c : list){
            System.out.print(c);
        }
    }
}
