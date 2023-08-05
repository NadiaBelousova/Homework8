
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    private static void task1() {
        System.out.println("Задача 1");
        int[] count = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(count));

        double[] coke = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(coke));

        int[] boxes = new int[14];
        boxes[0] = 1;
        for (int i = 0; i <= boxes.length; i++) {
            boxes[i] = i + 1;
            if (i == boxes.length - 1) {
                System.out.print(boxes[i]);
                break;
            }
            System.out.print(boxes[i] + " ");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] count = new int[]{1, 2, 3};
        int m = count[0];
        for (m = 0; m < count.length; m++) {
            if (m== count.length-1) {
                System.out.print(count[m]);
                break;
            }
            System.out.print(count[m] + ", ");
        }
        System.out.println();

        double[] coke = {1.57, 7.654, 9.986};
        System.out.println(coke[0] + ", " + coke[1] + ", " + coke[2]);

        int[] boxes = new int[14];
        boxes[0] = 1;
        for (int i = 0; i <= boxes.length; i++) {
            boxes[i] = i + 1;
            if (i == boxes.length - 1) {
                System.out.print(boxes[i]);
                break;
            }
            System.out.print(boxes[i] + ", ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] count = {1, 2, 3};
        for (int m = count.length - 1; m >= 0; m--) {
            if (m == 0) {
                System.out.print(count[m]);
                break;
            }
            System.out.print(count[m] + ", ");
        }
        System.out.println();

        double[] coke = {1.57, 7.654, 9.986};
        System.out.println(coke[2] + ", " + coke[1] + ", " + coke[0]);

        int[] boxes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (int i = boxes.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(boxes[i]);
                break;
            }
            System.out.print(boxes[i] + ", ");
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] number = new int[] {1,2,3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
            System.out.println(number[i]);
        }
    }
}







