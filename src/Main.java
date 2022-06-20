public class Main {
    public static void main(String[] args) {

        /* int [] bigBox={5, 6, 12};
        */

        int [] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0,0,0,};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[4]);
        int january=0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

        int[] arr = new int[10]; // Создали массив переменных типа int на 10 элементов
        arr[0] = 5; // Положили в ячейку 0 значение 5
        int i = 10; // Создали переменную типа int со значением 10
        arr[1] = i; // Положили значение переменной i в первую ячейку
        arr[5] = 10; // Положить в пятую ячейку значение 10
        int i = arr[5]; // Создать переменную int i и инициализировать ее значение из пятой ячейки массива arr
        int arrSize = arr.length; // Присвоили переменной arrSize значение длины массива (10)
        int i = arr[arr.length - 1];
    }
}