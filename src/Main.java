import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};

    }

    public static void task2() {
        System.out.println("Задача 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        //В конце строки запятую ставить не надо.
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.print(arr1[0] + ",");
        System.out.print(arr1[1] + ",");
        System.out.print(arr1[2] + "");
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.print(arr2[0] + ",");
        System.out.print(arr2[1] + ",");
        System.out.print(arr2[2] + "");
        System.out.println();
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        //В конце строки запятую ставить не надо.
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) ;
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
            }

        }
        System.out.println(Arrays.toString(arr1));
    }

}



