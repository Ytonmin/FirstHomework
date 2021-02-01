package Work1;
import java.util.Scanner;
public class JavaHomework1 {
    //排序
    public static void sort(int[] numbers, int counter) {
        int i, j;
        int temp;
        for (i = 0; i < counter; i++) {
            for (j = 0; j < counter; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    //输入
    public static int cin(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String input = sc.next();
        String[] strArr = input.split(",");
        for(int i = 0; i < strArr.length; i++) {
            numbers[i] = Integer.parseInt(strArr[i]);
            counter++;
        }
        return counter;
    }

    //合并
    private static void merge(int[] numbers, int[] numbers2, int counter1, int counter2) {
        int j = 0;
        for (int i = counter1; i < (counter1 + counter2); i++) {
            numbers[i] = numbers2[j];
            ++j;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        int[] numbers2 = new int[100000];
        int i;
        int counter1, counter2, counter3;
        System.out.println("输入第一组数列：");
        counter1 = cin(numbers);
        sort(numbers, counter1);
        System.out.println("第一个数组排序后的结果：");
        for (i = 0; i < counter1; i++) {
            if (i == 0){
                System.out.print(numbers[i]);
            }
            else{
                System.out.print(","+numbers[i]);
            }
        }
        System.out.println(" ");
        System.out.println("请输入第二个数列：");
        counter2 = cin(numbers2);
        merge(numbers, numbers2, counter1, counter2);
        counter3 = counter2 + counter1;
        sort(numbers, counter3);
        System.out.println("合并排序后的结果是：");
        for (i = 0; i < counter3; i++) {
            if (i == 0){
                System.out.print(numbers[i]);
            }
            else{
                System.out.print(","+numbers[i]);
            }
        }
        System.out.println(" ");

    }
}
