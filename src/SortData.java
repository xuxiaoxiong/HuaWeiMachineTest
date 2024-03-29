
import	java.util.TreeSet;
import	java.util.Scanner;
import java.util.TreeSet;

/**
 * @author: 徐晓雄
 * @date: 2019-12-19 21:11
 * @desc: 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
 */
public class SortData {
    public static void main(String[] args) {
        int num ;
        Scanner scanner = new Scanner(System.in);
        //TreeSet<Integer> set = new TreeSet<Integer> ();
        // 注意这个条件
        while (scanner.hasNext()){
            num = scanner.nextInt();
            int temp;
            TreeSet<Integer> set = new TreeSet<Integer> (); // 必须放这里不然通过不了。尽量不要用全局变量
            for (int i = 0; i < num; i++) {
                temp = scanner.nextInt();
                set.add(temp);
            }
            for (Integer integer : set){
                System.out.println(integer);
            }
        }
    }
}
