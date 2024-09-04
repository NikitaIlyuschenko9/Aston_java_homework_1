import java.util.Arrays;

public class TaskRunner {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumCompare(16,5));
        System.out.println(positiveNegative(1));
        System.out.println(posNegative(0));
        System.out.println(printStr("Новый год ", 3));
        System.out.println(leapYear(10000));
        System.out.println(Arrays.toString(arrayChange()));
        System.out.println(Arrays.toString(arrayFill()));
        System.out.println(Arrays.toString(arrMultiply()));
        System.out.println(Arrays.deepToString(dimensionalArray()));
        System.out.println(Arrays.toString(arrConstruct(10,11)));

    }
    //task 1
    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }
    //task 2
    public static void checkSumSign() {
        int a = -5,b = 0;
        if (a+b >= 0){
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");
    }
    //task 3
    public static void printColor(){
        int value = 99;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        else System.out.println("Зеленый");
    }
    //task 4
    public static void compareNumbers(){
        int a = 9,b = 10;
        if (a >= b){
            System.out.println("a >= b");
        }
        else System.out.println("a < b");
    }
    //task 5
    public static boolean sumCompare(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }
    //task 6
    public static String positiveNegative(int num){
        return num >= 0 ? "положительное" : "отрицательное";
    }
    //task 7
    public static boolean posNegative(int number){
        return number >= 0;
    }
    //task 8
    public static String printStr(String str,int amount){
        return str.repeat(amount);
    }
    //task 9
    public static boolean leapYear(int year){
        return year / 100 % 4 == 0;
    }
    //task 10
    public static int[] arrayChange(){
        int[] arr = {1,1,1,0,1,0,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else arr[i] = 0;
        }
        return arr;
    }
    //task 11
    public static int[] arrayFill(){
        int[] array = new int[100];
        for (int i = 0,j = 1; i < array.length; i++,j++){
            array[i] = j;
        }
        return array;
    }
    //task12
    public static int[] arrMultiply(){
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6 ){
                array[i] *= 2;
            }
        }
        return array;
    }
    //task 13
    public static int[][] dimensionalArray(){
        int[][] array = new int[2][2];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j){
                    array[j][i] = 1;
                }
            }
        }
        return array;
    }
    //task 14
    public static int[] arrConstruct(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
}
