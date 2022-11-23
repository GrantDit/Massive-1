public class Massive {
    public static void main(String[] args) {
        System.out.println("Задание 1-2");
        int[] arr1 = new int[]{1, 2, 3}; // Объявил первый массив.
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]); // Вывел в верном порядке через запятую
            if (i < arr1.length - 1)
                System.out.print(" ,"); // Проверил что элемент массива последний, за счет чего убрал запятую после последнего элемента
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986}; // Объявил второй массив.
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]); // Вывел в верном порядке через запятую
            if (i < arr2.length - 1)
                System.out.print(" ,"); // Проверил что элемент массива последний, за счет чего убрал запятую после последнего элемента

        }
        System.out.println();
        int[] arr3 = new int[]{20, 34, 28, 43}; // Объявил третий массив.
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]); // Вывел в верном порядке через запятую
            if (i < arr3.length - 1)
                System.out.print(" ,");  // Проверил что элемент массива последний, за счет чего убрал запятую после последнего элемента
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = arr1.length - 1; i >= 0; i--) { // Вывел в обратном порядке через запятую
            System.out.print(arr1[i]);
            if (i > 0)
                System.out.print(" ,");
        }
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) { // Вывел в обратном порядке через запятую
            System.out.print(arr2[i]);
            if (i > 0)
                System.out.print(" ,");
        }
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) { // Вывел в обратном порядке через запятую
            System.out.print(arr3[i]);
            if (i > 0)
                System.out.print(" ,");
        }
        System.out.println();
        System.out.println("Задание 4");
        int[] arr4 = new int[]{1, 2, 3};
        for (int i = 0; i <= arr4.length -1; i++)
            if (arr4[i] % 2 != 0) {
                arr4[i] += 1;
                System.out.print(arr4[i]);
                if (i <2)
                System.out.print(" , ");
            }
    }
}





