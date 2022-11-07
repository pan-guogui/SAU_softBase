import java.util.Scanner;

/**
 * @author PanGg
 * @date 2022年11月07日 15:03
 */

public class maxS {

    static int n;

    static int[] cl = new int[100];

    public static void main(String[] args) {//主函数

        Scanf();

    }

    public static void Scanf() {//输入函数

        @SuppressWarnings("resource")//抑制编译器警告

        Scanner shu = new Scanner(System.in);

        System.out.print("输入数组个数n:" + "\n");

        n = shu.nextInt();

        if (n <= 0)

            System.out.print("ERROR");

        else {

            System.out.print("输入数组:" + "\n");

            for (int i = 0; i < n; i++) {

                cl[i] = shu.nextInt();

            }

            Print();

        }

    }

    public static void Print() {//输出函数

        System.out.print("该数组最大字段和为：" + Max(cl));

    }

    public static int Max(int[] block) {//算法

        int sum = 0;

        int max = 0;

        for (int i = 0; i < block.length; i++) {

            sum += block[i];

            if (sum <= 0)

                sum = 0;

            if (sum > max)

                max = sum;

        }

        return max;

    }

}
