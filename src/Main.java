public class Main {
    public static void main(String[] args) {
        task();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }



    public static void task() {
        System.out.println();
        System.out.println("Вывод значений массива");
        int[] arr = generateRandomArray();
        for (int i : arr) {
            System.out.println(i);
        }
    }




    public static void task1() {
        System.out.println();
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }


    public static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxSum = 0;
        int minSum = 1000000000;
        for (int i : arr) {
            if (i > maxSum){
                maxSum=i;
            }
            if (i<minSum){
                minSum=i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+maxSum+" рублей");
    }


    public static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int numberOfDays = 0;
        int sum = 0;
        for (int i : arr) {
            sum = sum+i;
            numberOfDays+=1;
        }
        int averageValue = sum/numberOfDays; //ругался на double поэтому сделал int
        System.out.println("Средняя сумма трат за месяц составила "+averageValue+" рублей");
    }


    public static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            //я не понимаю почему должен начинать со значения, которое на единицу меньше последнего.
            System.out.print(reverseFullName[i]);
        }
    }
}